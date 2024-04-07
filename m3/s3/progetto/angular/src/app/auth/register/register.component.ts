import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { IUser } from '../../Modules/i-user';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

  registerData:Partial<IUser> = {}

  constructor(
    private authSvc:AuthService,
    private router:Router
    ){}

  signUp(){
    this.registerData.preferiti = [];
    this.authSvc.register(this.registerData)
    .subscribe(data => {

      this.router.navigate(['/Film'])

    })
  }
}
