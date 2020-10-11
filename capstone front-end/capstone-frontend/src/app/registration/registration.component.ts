import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user=new User();
  msg='';
  constructor(private service:RegistrationService,private route: Router) { }

  ngOnInit() {
  }
  RegisterUser(){
    this.service.registerUserFromRemote(this.user).subscribe(
      data => {console.log("response received") ;
      this.route.navigate(['/login'])
    },
      error => {console.log("exception occured");
      this.msg=error.error;
  }
    )
  }

}
