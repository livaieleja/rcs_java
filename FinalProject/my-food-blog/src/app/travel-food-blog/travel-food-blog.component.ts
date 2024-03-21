import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { ActivatedRoute } from '@angular/router';


interface Food {
  name: string;
  description: string;
  price: string;
  imageURL: string;
}

interface BlogPost {
  id: number;
  region: string;
  country: string;
  city: string;
  restaurant: string;
  restaurantDescription: string;
  picture: string;
  food: Food[];
}

@Component({
  selector: 'app-travel-food-blog',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './travel-food-blog.component.html',
  styleUrl: './travel-food-blog.component.css'
})

export class TravelFoodBlogComponent implements OnInit {
  blogPosts: BlogPost[] = [];

  constructor(private http: HttpClient, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      const region = params['region']; // 'europe' or 'asia'
      this.loadBlogPosts(region);
    });
  }

  loadBlogPosts(region: string): void {
    // Adjust the path according to the actual location of your FoodBlog.json file
    this.http.get<{ travelFoodBlog: BlogPost[] }>('/assets/FoodBlog.json').subscribe(data => {
      // Use 'region' for filtering
      this.blogPosts = data.travelFoodBlog.filter(post => post.region.toLowerCase() === region);
    }, error => {
      console.error('Failed to load blog posts:', error);
    });
  }
}