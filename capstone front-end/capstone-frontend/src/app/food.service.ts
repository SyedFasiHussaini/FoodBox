import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { FoodBoxModel } from './food-box-model';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FoodService {
  private url:string;
  constructor(private http:HttpClient) { 
    this.url="http://localhost:8080/food";
  }

  public addFood(food:FoodBoxModel):Observable<FoodBoxModel>{
    return this.http.post<FoodBoxModel>(this.url, food);
  }

  public getFoodById(id):Observable<FoodBoxModel>{
  return this.http.get<FoodBoxModel>("http://localhost:8080/food/"+id);
  }

  public getAllFoods():Observable<FoodBoxModel[]>{
    return this.http.get<FoodBoxModel[]>(this.url+"s");
  }

  public deleteFood(id):Observable<FoodBoxModel>{
    return this.http.delete<FoodBoxModel>("http://localhost:8080/food/"+id);
  }

  public updateFood(food:FoodBoxModel):Observable<FoodBoxModel>{
    return this.http.put<FoodBoxModel>(this.url, food);
  }
}
