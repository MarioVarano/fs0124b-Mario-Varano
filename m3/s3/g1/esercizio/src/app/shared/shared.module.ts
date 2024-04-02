import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ButtoneComponent } from './buttone/buttone.component';



@NgModule({
  declarations: [
    ButtoneComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    ButtoneComponent
  ]
})
export class SharedModule { }
