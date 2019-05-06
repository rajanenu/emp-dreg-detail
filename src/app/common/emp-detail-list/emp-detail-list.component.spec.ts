import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpDetailListComponent } from './emp-detail-list.component';

describe('EmpDetailListComponent', () => {
  let component: EmpDetailListComponent;
  let fixture: ComponentFixture<EmpDetailListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmpDetailListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpDetailListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
