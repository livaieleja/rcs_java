import { Component, OnInit} from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-animal-listing',
  standalone: true,
  imports: [CommonModule,FormsModule],
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
  ];

  animalIndex: number= 0;
  newAnimalName: string = '';
  showError: boolean = false;
  constructor() { }
  
  ngOnInit(): void {
  }

  editAnimalName(): void {
    if (this.animalIndex >= 0 && this.animalIndex < this.lst.length) {
      this.lst[this.animalIndex].name = this.newAnimalName;
      this.showError = false;
    } else {
      this.showError = true;
    }
  }
  
}

export interface Animal{
  name: string;
  age: number;
  species: string;
  picture: string;
  
}
