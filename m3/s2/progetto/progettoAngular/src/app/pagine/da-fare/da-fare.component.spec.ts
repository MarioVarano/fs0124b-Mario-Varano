import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DaFareComponent } from './da-fare.component';

describe('DaFareComponent', () => {
  let component: DaFareComponent;
  let fixture: ComponentFixture<DaFareComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DaFareComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DaFareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
