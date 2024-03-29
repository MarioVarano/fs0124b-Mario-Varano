import { Component } from '@angular/core';
import { iToDo } from '../../Modules/to-do';
import { ToDOService } from '../../Service/to-do.service';
import { UsersService } from '../../Service/users.service';

@Component({
  selector: 'app-da-fare',
  templateUrl: './da-fare.component.html',
  styleUrl: './da-fare.component.scss'
})
export class DaFareComponent {
  todoArrInComp:iToDo[] = []

  constructor(private todoSvc:ToDOService,
              private userSvc:UsersService
              ){}



  cambiaColore(id:number) {
    this.todoSvc.getById(id)
  }
  mapUser(id:number){
    let user = this.userSvc.getAllUser().find(user => user.id === id)
    if (user){
      return `${user.firstName} ${user.lastName}`
    }else{
      return ''
    }
  }



  ngOnInit(){
    this.todoArrInComp = this.todoSvc.getInCompletati()

  }
}
