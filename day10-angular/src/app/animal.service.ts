import { Injectable } from '@angular/core';
import { Animal } from './animalinterface';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {
    lst: Animal [] = [
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

  getAnimal() : Animal []{
    return this.lst;
  }
}
