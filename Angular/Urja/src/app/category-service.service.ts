import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CategoryI } from './CategoryI';

@Injectable({
  providedIn: 'root'
})
export class CategoryServiceService {

  constructor(private http:HttpClient) { }

  getCategories()
  {
    return this.http.get<CategoryI[]>("http://localhost:8080/category/get");

  }

  

}
