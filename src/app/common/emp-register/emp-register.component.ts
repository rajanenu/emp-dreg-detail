import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from './../../model/employee';
import { GetDataService } from './../../services/get-data.service';

@Component({
  selector: 'app-emp-register',
  templateUrl: './emp-register.component.html',
  styleUrls: ['./emp-register.component.scss']
})
export class EmpRegisterComponent implements OnInit {
  public employee = new Employee();
  public Radiogroup = [
    { name: 'Male', value: 'Male' },
    { name: 'Female', value: 'Female' }
  ];
  public radioSel: any;
  public radioSelected: string;
  public radioSelectedString: string;
  public department: any = [
    { name: 'IT' },
    { name: 'Support' },
    { name: 'Admin' },
    { name: 'Accounts' },
    { name: 'Business' },
    { name: 'None' }
  ];
  private selectedObj: any;
  public showMsg: boolean;


  constructor(private empRegService: GetDataService) {
    this.employee.gender = '';
    this.getSelecteditem();
  }

  public ngOnInit(): void {}

  public getSelecteditem(): void {
    this.radioSel = this.Radiogroup.find(
      Item => Item.value === this.employee.gender
    );
    this.radioSelectedString = JSON.stringify(this.radioSel);
  }

  public onItemChange(): void {
    this.getSelecteditem();
  }

  private selectedValueObj(name: any): void {
    this.employee.department = (name.srcElement || name.target).value;
    for (let i = 0; i < this.department.length; i++) {
      if (this.department[i].name == this.employee.department) {
        this.selectedObj = this.department.length[i];
      }
    }
  }

  public Submission(form: NgForm): void {
     if (form.valid) {
      this.empRegService.createEmpReg(this.employee).subscribe();
      this.showMsg = true;
  }
}
}
