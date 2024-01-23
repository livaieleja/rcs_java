import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-addition',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './addition.component.html',
  styleUrl: './addition.component.css'
})
export class AdditionComponent {

  number1: number = 0;
  number2: number = 0;
  result: number= 0;

  calculateAddition(){
    this.result = this.number1 + this.number2;
  }
}

