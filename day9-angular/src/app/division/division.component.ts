import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-division',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './division.component.html',
  styleUrl: './division.component.css'
})
export class DivisionComponent {

  number1: number = 0;
  number2: number = 0;
  result: number= 0;

  calculateDivision(){
    this.result = this.number1 / this.number2;
  }
}
