import { Component, OnInit } from '@angular/core';
import { GetDataService } from '../../services/get-data.service';
import { Employee } from 'src/app/model/employee';

@Component({
  selector: 'app-emp-detail-list',
  templateUrl: './emp-detail-list.component.html',
  styleUrls: ['./emp-detail-list.component.scss']
})
export class EmpDetailListComponent implements OnInit {
  public sampleData: any = [];
  public settings: any = { } ;
  public dataFromService: Employee [];
  constructor(private getEmpService: GetDataService) { }

  ngOnInit() {
    this.settings  = {
      columns: {
        firstName: {
          title: 'First Name',
          compareFunction:(direction: any, a: any, b: any) => {
            // Converting strings to lowercase
            let first = typeof a === 'string' ? a.toLowerCase() : a;
            let second = typeof b === 'string' ? b.toLowerCase() : b;

            if (first < second) {
                return -1 * direction;
            }
            if (first > second) {
                return direction;
            }
            return 0;
        }
        },
        lastName: {
          title: 'Last Name'
        },
        gender: {
          title: 'Gender'
        },
        dateOfBirth: {
          title: 'Date of Birth'
        },
        department: {
          title: 'Deparment'
        }
      },
      actions:{
        columnTitle: '',
        add: false,
        edit: false,
        delete: false
      },
      hideSubHeader: true,
      pager : {
        display : true,
        perPage:5
        },
        attr: {
          class: 'table table-bordered'
        },
    };
    this.getEmpService.getEmpData().subscribe((dataFromService)=>{
      console.log(dataFromService);
      this.sampleData = dataFromService;
    }, ( error: any) => {
      console.log(error);
    });


  }



}
