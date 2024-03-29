import { Component } from '@angular/core';
import { ToDOService } from '../../Service/to-do.service';
import { iToDo } from '../../Modules/to-do';
import { UsersService } from '../../Service/users.service';

@Component({
  selector: 'app-completi',
  templateUrl: './completi.component.html',
  styleUrl: './completi.component.scss'
})
export class CompletiComponent {
  todoArrComp:iToDo[] = []

  constructor(private todoSvc:ToDOService,
              private userSvc:UsersService){}



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
    this.todoArrComp = this.todoSvc.getCompletati()

  }
}
