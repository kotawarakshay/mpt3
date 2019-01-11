import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  //template: `<style><h1>Helo </h1><br/><h1>'${name}'</h1></style>`,
 templateUrl : './app.component.html',
 styleUrls:['./app.component.css'],
 // styles:['.cube']
})
export class AppComponent{
  Name:string='hello,';
  

}

