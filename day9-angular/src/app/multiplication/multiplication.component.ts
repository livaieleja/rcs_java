import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-multiplication',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './multiplication.component.html',
  styleUrl: './multiplication.component.css'
})
export class MultiplicationComponent {

number1: number = 0;
number2: number = 0;
result: number= 0;

calculateMultiplication(){
  this.result = this.number1 * this.number2;
}
}

