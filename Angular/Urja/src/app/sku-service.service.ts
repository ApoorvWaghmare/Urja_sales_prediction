import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SkuI } from './SkuI';

@Injectable({
  providedIn: 'root'
})
export class SkuServiceService {

  constructor(private http:HttpClient) { }

  getSkus()
  {
    return this.http.get<SkuI[]>("http://localhost:8080/sku/getexisting");
  }

  getSkubyId(id:number)
  {
    var url="http://localhost:8080/sku/get/"+id;
    return this.http.get<SkuI>(url);
  }

}


