import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { EmpRegisterComponent } from "./common/emp-register/emp-register.component";
import { EmpDetailListComponent } from "./common/emp-detail-list/emp-detail-list.component";

const routes: Routes = [
  {
    path: "register",
    component: EmpRegisterComponent
  },
  {
    path: "list",
    component: EmpDetailListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
