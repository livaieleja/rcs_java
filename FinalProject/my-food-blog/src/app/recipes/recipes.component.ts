import { Component,OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { ActivatedRoute } from '@angular/router';

interface Recipe {
  id: number;
  title: string;
  type: string;
  ingredients: string[];
  instructions: string[];
  imageURL: string;
}

@Component({
  selector: 'app-recipes',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './recipes.component.html',
  styleUrls: ['./recipes.component.css']
})

export class RecipesComponent implements OnInit {
  recipes: Recipe[] = [];
  filteredRecipes: Recipe[] = [];

  constructor(private http: HttpClient, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      const type = params['type'];
      console.log('Type parameter:', type);
      this.loadRecipes(type);
    });
  }

  loadRecipes(type: string): void {
    this.http.get<{ recipes: Recipe[] }>('/assets/Recipes.json').subscribe(data => {
      this.recipes = data.recipes;
      this.filteredRecipes = this.recipes.filter(recipe => recipe.type.toLowerCase() === type);
      console.log('Filtered recipes:', this.filteredRecipes);
    });
  }
}