import { PostService } from './../post.service';
import { Component, ViewChild } from '@angular/core';
import { PostInterface } from 'src/interfaces/post.interface';
import { SinglePostComponent } from '../single-post/single-post.component';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss'],
})
export class HomepageComponent {
  post!: PostInterface;
  related!: PostInterface[];
  posts!:PostInterface[]

  @ViewChild("singlePost") singlePost!: SinglePostComponent

  constructor(private PostSvc:PostService) {
    this.post = this.PostSvc.getTopPost()
    this.related = this.PostSvc.getRandomPosts(4)
    this.posts = this.PostSvc.getAllPosts()
  }


  editPost() {
    alert("Edit successful!")
  }
}
