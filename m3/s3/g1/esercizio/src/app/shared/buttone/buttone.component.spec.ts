import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ButtoneComponent } from './buttone.component';

describe('ButtoneComponent', () => {
  let component: ButtoneComponent;
  let fixture: ComponentFixture<ButtoneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ButtoneComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ButtoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
