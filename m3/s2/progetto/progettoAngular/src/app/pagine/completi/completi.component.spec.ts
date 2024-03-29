import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompletiComponent } from './completi.component';

describe('CompletiComponent', () => {
  let component: CompletiComponent;
  let fixture: ComponentFixture<CompletiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CompletiComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CompletiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
