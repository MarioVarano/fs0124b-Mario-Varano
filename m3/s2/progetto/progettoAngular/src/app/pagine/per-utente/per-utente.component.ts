import { iUsers } from './../../Modules/users';
import { Component } from '@angular/core';
import { ToDOService } from '../../Service/to-do.service';
import { UsersService } from '../../Service/users.service';
import { iToDo } from '../../Modules/to-do';

@Component({
  selector: 'app-per-utente',
  templateUrl: './per-utente.component.html',
  styleUrl: './per-utente.component.scss'
})
export class PerUtenteComponent {
  userArr:iUsers[] = []
  todoArr:iToDo[]= []


  constructor(private todoSvc:ToDOService,
    private userSvc:UsersService
    ){}

    cambiaColore(id:number) {
      this.todoSvc.getById(id)
    }

    mapToDo(id:number): iToDo[]{
      return this.todoArr = this.todoSvc.getAlltodo().filter(todo => todo.userId === id)

    }

    mapUser(id:number){
      let user = this.userSvc.getAllUser().find(user => user.id === id)
      return user ? `${user.firstName} ${user.lastName}`: ''

    }


    ngOnInit(){
      this.userArr = this.userSvc.getAllUser()




    }

}
