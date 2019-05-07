# EmpDetailReg

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.1.4.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

----------------------------------------------------------
Employee Registraion Form and Employee Details Application.
----------------------------------------------------------
-In Employee registraion and details, we have one module called "App Module"(this is default module)
-In Employee registraion and details,we have two components(except default component "App Component") and those are called as emp-register-component and emp-detail-list component
-In this application one service is created and that is called as get-data.service

Spring Boot Backend code
===========================
-To this application I made two rest api calls and one is for POST and another one is for GET
-GET request is used to the get the employee details
-POST is used post the emploee details into the spring boot or DB or file system.
-Currently i have not used DB or file system,I just make it the global variable to hold the employee data.
-Please find the GET request URL
http://localhost:9440/employees
-Please find teh POST request url
http://localhost:9440/employees/<empobject>
 -I used swagegr UI to see these rest apis urls and also the documentation.
 http://localhost:9440/swagger-ui.html
 

