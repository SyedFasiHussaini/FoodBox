import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FoodBoxModel } from '../food-box-model';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-update-food',
  templateUrl: './update-food.component.html',
  styleUrls: ['./update-food.component.css']
})
export class UpdateFoodComponent implements OnInit {

  private food:FoodBoxModel;
  constructor(private foodService:FoodService, private router:Router) {
    this.food=new FoodBoxModel(); //Creating new obj so that the form fields are refreshed
   }
   public updateFood():void{
    this.foodService.updateFood(this.food).subscribe(res=>{
      this.food=new FoodBoxModel();
      this.router.navigate(['/foodsList']);
    })
  }
  ngOnInit() {
  }

}
