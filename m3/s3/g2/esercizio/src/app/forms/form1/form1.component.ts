import { Component, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrl: './form1.component.scss'
})
export class Form1Component {
  @ViewChild('f',{static:true}) form!:NgForm



  submit(form:NgForm){
    console.log(this.form.value);

  }
}
