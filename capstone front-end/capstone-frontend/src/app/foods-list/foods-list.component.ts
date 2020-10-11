import { Component, OnInit } from '@angular/core';
import { FoodBoxModel } from '../food-box-model';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-foods-list',
  templateUrl: './foods-list.component.html',
  styleUrls: ['./foods-list.component.css']
})
export class FoodsListComponent implements OnInit {

  private foodsList: FoodBoxModel[];
  constructor(private foodService: FoodService) { }

  ngOnInit() {
    this.foodService.getAllFoods().subscribe(res => { this.foodsList = res; });
  }

}
