import { Injectable } from '@angular/core';
import {Post } from './postsInterface'
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  private postUrl: string = "https://jsonplaceholder.typicode.com/posts";


  lst: Post[] = [
    {
      userId: 1,
      id: 1,
      title: "demo",
      body: "aaaaaaabbbbbcccc"
    },
    {
      userId: 1,
      id: 2,
      title: "demo2",
      body: "aaaaaaabbbbbccccddddddeeee"
    },
 
  ]

  constructor(private http: HttpClient) { }

  getPosts() : Observable <Post[]>{
    return this.http.get<Post[]>(this.postUrl);
  }
}
