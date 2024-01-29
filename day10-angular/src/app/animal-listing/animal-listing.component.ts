import { Component, OnInit} from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Animal } from '../animalinterface';
import { AnimalService } from '../animal.service';


@Component({
  selector: 'app-animal-listing',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './animal-listing.component.html',
  styleUrl: './animal-listing.component.css'
})
export class AnimalListingComponent implements OnInit{

  lst: Animal[] = [];
   
  animalIndex!: number;
  newAnimalName!: string;
  showError: boolean = false;

  constructor(private AnimalService: AnimalService) {
  }
  
  ngOnInit(): void {
    this.getAnimals();
  }

  getAnimals() : void{
    this.lst = this.AnimalService.getAnimal();

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


