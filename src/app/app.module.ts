import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Ng2SmartTableModule } from 'ng2-smart-table';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpDetailListComponent } from './common/emp-detail-list/emp-detail-list.component';
import { EmpRegisterComponent } from './common/emp-register/emp-register.component';
import { GetDataService } from './services/get-data.service';

@NgModule({
  declarations: [
    AppComponent,
    EmpDetailListComponent,
    EmpRegisterComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    Ng2SmartTableModule,
    AppRoutingModule
  ],
  providers: [GetDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
