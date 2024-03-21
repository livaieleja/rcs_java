import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

  constructor(private router: Router) {}

  navigateToAboutMe() {
    this.router.navigate(['/about-me']);
  }
  
  navigateToRecipes(type: string) {
    this.router.navigate(['/recipes', type]);
  }
  
  navigateToTravelFoodBlog(region: string) {
    this.router.navigate(['/travel-food-blog', region]);
  }
  
  navigateToContact() {
    this.router.navigate(['/contact']);
  }

  navigateToHome() {
    this.router.navigate(['/home']);
  }


}
