import { Injectable } from '@angular/core';
import { IUser } from '../Modules/i-user';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from '../../environments/environment.development';
import { BehaviorSubject, map, tap } from 'rxjs';
import { ILogin } from '../Modules/i-login';
import { JwtHelperService } from '@auth0/angular-jwt';


type AccessData = {
  accessToken:string,
  user:IUser
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  jwtHelper:JwtHelperService = new JwtHelperService()//ci permette di lavorare facilmente con i jwt

  authSubject = new BehaviorSubject<IUser|null>(null);//se nel behavioursubject c'è null significa che l'utente non è loggato, altrimenti conterrà l'oggetto user con tutte le sue info

  user$ = this.authSubject.asObservable()//contiene i dati dell'utente loggato oppure null
  isLoggedIn$ = this.user$.pipe(
    map(user => !!user),
    tap(user =>  this.syncIsLoggedIn = user)
    )//restituisce true se lò'utente è loggato, false se non lo è
  //!!user è come scrivere Boolean(user)
  //isLoggedIn$ = this.user$.pipe(map(user => Boolean(user)))

  syncIsLoggedIn:boolean = false;


  constructor(private http:HttpClient,
    private router:Router) { }

    registerUrl:string = environment.registerUrl
    loginUrl:string = environment.loginUrl


    register(newUser:Partial<IUser>):Observable<AccessData>{
      return this.http.post<AccessData>(this.registerUrl,newUser)
    }


    login(loginData:ILogin):Observable<AccessData>{
      return this.http.post<AccessData>(this.loginUrl,loginData)
      .pipe(tap(data => {

        this.authSubject.next(data.user)//comunico al subject che l'utente si è loggato
        localStorage.setItem('accessData', JSON.stringify(data))

        this.autoLogout(data.accessToken)

      }))
    }


    logout(){

      this.authSubject.next(null)//comunico al subject che l'utente si è sloggato
      localStorage.removeItem('accessData')//cancello i dati dell'utente

      this.router.navigate(['/auth/login'])//mando via l'utente loggato

    }


    autoLogout(jwt:string){
      const expDate = this.jwtHelper.getTokenExpirationDate(jwt) as Date;//trovo la data di scadenza del token
      const expMs = expDate.getTime() - new Date().getTime(); //sottraggo i ms della data/ora di oggi da quella nel jwt

      //avvio un timer, quando sarà passato il numero di ms necessari per la scadenza del token, avverrà il logout
      setTimeout(()=>{
        this.logout()
      },expMs)
    }
}
