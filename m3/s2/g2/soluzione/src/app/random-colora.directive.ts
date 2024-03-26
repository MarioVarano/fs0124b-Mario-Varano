import { Directive, ElementRef, Input } from '@angular/core';
import { PostService } from './post.service';

@Directive({
  selector: '[appRandomColora]'
})
export class RandomColoraDirective {

  constructor(private ref:ElementRef, private PostSvc:PostService) { }

  @Input() colore:string = ''


  ngOnInit(){
    this.colore = this.PostSvc.getRandomColor()
    this.ref.nativeElement.style.background = this.colore
  }
}

