import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PerUtenteComponent } from './per-utente.component';

describe('PerUtenteComponent', () => {
  let component: PerUtenteComponent;
  let fixture: ComponentFixture<PerUtenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PerUtenteComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PerUtenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
