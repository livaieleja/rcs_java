import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculator',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './calculator.component.html',
  styleUrl: './calculator.component.css'
})
export class CalculatorComponent {

  number1: string = "";
  number2: string = "";
  sum: number = 0;

  Calculatesum(){
    let parsedNumber1 = parseInt(this.number1);
    let parsedNumber2 = parseInt(this.number2);

    this.sum = parsedNumber1+parsedNumber2;
  }

}
