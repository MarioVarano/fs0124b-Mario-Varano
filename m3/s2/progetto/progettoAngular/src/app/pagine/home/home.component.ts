import { Component } from '@angular/core';
import { iToDo } from '../../Modules/to-do';
import { ToDOService } from '../../Service/to-do.service';
import { UsersService } from '../../Service/users.service';
import { iUsers } from '../../Modules/users';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  todoArr:iToDo[] = []
  userArr:iUsers[] = []


  constructor(private todoSvc:ToDOService,
              private userSvc:UsersService
              ){}



  cambiaColore(id:number) {
    this.todoSvc.getById(id)
  }

  mapUser(id:number){
    let user = this.userSvc.getAllUser().find(user => user.id === id)
    return user ? `${user.firstName} ${user.lastName}`: ''

  }



  ngOnInit(){
    this.todoArr = this.todoSvc.getAlltodo()
  }
}
