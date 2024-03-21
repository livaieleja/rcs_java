import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TravelFoodBlogComponent } from './travel-food-blog.component';

describe('TravelFoodBlogComponent', () => {
  let component: TravelFoodBlogComponent;
  let fixture: ComponentFixture<TravelFoodBlogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TravelFoodBlogComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TravelFoodBlogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
