import { Component } from '@angular/core';
import { IFilm } from '../../Modules/i-film';
import { AuthService } from '../../auth/auth.service';
import { FilmService } from '../film.service';
import { IUser } from '../../Modules/i-user';

@Component({
  selector: 'app-preferiti',
  templateUrl: './preferiti.component.html',
  styleUrl: './preferiti.component.scss'
})
export class PreferitiComponent {
  preferitiArr:IFilm[] = []
  var!:IUser|null
  varN!:any



  constructor(private filmSvc:FilmService,
    private authSVC:AuthService
  ){}

  ngOnInit(){
    this.authSVC.user$.subscribe(res => {this.var = res
      this.varN = this.var?.name || []
      this.preferitiArr = this.var?.preferiti || []
  })
    console.log(this.preferitiArr);



  }


}
