import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FunnypictureComponent } from './funnypicture.component';

describe('FunnypictureComponent', () => {
  let component: FunnypictureComponent;
  let fixture: ComponentFixture<FunnypictureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FunnypictureComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FunnypictureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
