import { Routes } from '@angular/router';
import { AboutMeComponent } from './about-me/about-me.component';
import { RecipesComponent } from './recipes/recipes.component';
import { TravelFoodBlogComponent } from './travel-food-blog/travel-food-blog.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
    { path: 'about-me', component: AboutMeComponent },
    { path: 'recipes/:type', component: RecipesComponent },
    { path: 'travel-food-blog/:region', component: TravelFoodBlogComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'home', component: HomeComponent },
  ];