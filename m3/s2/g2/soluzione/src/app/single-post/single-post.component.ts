import { Component, Input } from '@angular/core';
import { PostInterface } from 'src/interfaces/post.interface';
import { PostService } from '../post.service';

@Component({
  selector: 'app-single-post',
  templateUrl: './single-post.component.html',
  styleUrls: ['./single-post.component.scss']
})
export class SinglePostComponent {
  posts!: PostInterface[];

  @Input() post!: PostInterface
  edit: Boolean = false
  toggleEdit() {
    this.edit = !this.edit
  }


  constructor(private PostSvc:PostService) {
    this.posts = this.PostSvc.getAllPosts()
  }

}
