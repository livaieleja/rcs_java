import { Routes } from '@angular/router';
import { MainComponent } from './main/main.component';
import { AboutComponent } from './about/about.component';
import { FunnypictureComponent } from './funnypicture/funnypicture.component';

export const routes: Routes = [
    {path:'main', component: MainComponent},
    {path:'about', component: AboutComponent},
    {path:'picture', component: FunnypictureComponent},
];
