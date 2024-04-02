import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-buttone',
  templateUrl: './buttone.component.html',
  styleUrl: './buttone.component.scss'
})
export class ButtoneComponent {
  @Input() testo!:string;
}
