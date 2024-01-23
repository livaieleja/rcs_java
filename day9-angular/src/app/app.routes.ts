import { Routes } from '@angular/router';
import { AdditionComponent } from './addition/addition.component';
import { SubtractionComponent } from './subtraction/subtraction.component';
import { DivisionComponent } from './division/division.component';
import { MultiplicationComponent } from './multiplication/multiplication.component';

export const routes: Routes = [
    {path:'addition', component: AdditionComponent},
    {path:'subtraction', component: SubtractionComponent},
    {path:'division', component: DivisionComponent},
    {path:'multiplication', component: MultiplicationComponent},
    
];
