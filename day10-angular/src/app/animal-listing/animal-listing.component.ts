import { Component, OnInit} from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-animal-listing',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './animal-listing.component.html',
  styleUrl: './animal-listing.component.css'
})
export class AnimalListingComponent implements OnInit{

  lst: Animal[] = [
    {
      name: "Hugo",
      age: 15,
      species: "Lauva",
      picture:'assets/Lion.jpg',
    },
    {
      name: "Arno",
      age: 9,
      species: "Tīģeris",
      picture:'assets/Tiger.jpg',
    },
    {
      name: "Simba",
      age: 3,
      species: "Zilonis",
      picture:'assets/Elephant.jpg',
    },
    {
      name: "Rocket",
      age: 1,
      species: "Leopards",
      picture:'assets/Leopard.jpg',
    }
  ]
  
  constructor() { }
  
  ngOnInit(): void {
  }

}

export interface Animal{
  name: string;
  age: number;
  species: string;
  picture: string;
}
