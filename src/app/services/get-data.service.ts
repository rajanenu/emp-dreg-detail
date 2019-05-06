import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpResponse, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Employee } from 'src/app/model/employee';

const httpOptions = {
  headers: new HttpHeaders({
   'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn:'root'
})
export class GetDataService {
  private baseUrl: string = '';
  constructor(private http: HttpClient) {
    this.baseUrl = "http://localhost:9440/employees";
   }
/**
 * This service method is used to get the list of employees who are already registered
 */
  public getEmpData() {
    return this.http.get(this.baseUrl)
               .map(response=> response)
               .catch(this.handleError)
  }
/**
 * This service method is used to pass the information to the rest api call
 * @param emp
 */
  public createEmpReg(emp: Employee) {
    console.log('Before caling post ' + this.baseUrl + JSON.stringify(emp));
    return this.http.post(this.baseUrl, emp, httpOptions)
               .map(response=> response)
               .catch(this.handleError);
  }

  private handleError(error: any){
    return Promise.reject(error.message || error );
  }

}
