import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FoodBoxModel } from '../food-box-model';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-add-food',
  templateUrl: './add-food.component.html',
  styleUrls: ['./add-food.component.css']
})
export class AddFoodComponent implements OnInit {
  private food:FoodBoxModel;
  constructor(private foodService:FoodService, private router:Router) {
    this.food=new FoodBoxModel(); //Creating new obj so that the form fields are refreshed
   }

   public addShoes():void{
     this.foodService.addFood(this.food).subscribe(res=>{
       this.food=new FoodBoxModel();
       this.router.navigate(['/foodsList']);
     })
   }
  ngOnInit() {
  }

}
