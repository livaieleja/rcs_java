import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-subtraction',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './subtraction.component.html',
  styleUrl: './subtraction.component.css'
})
export class SubtractionComponent {

  number1: number = 0;
  number2: number = 0;
  result: number= 0;

  calculateSubtraction(){
    this.result = this.number1 - this.number2;
  }
}
