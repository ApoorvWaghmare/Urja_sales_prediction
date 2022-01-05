import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SaleI } from './SaleI';

@Injectable({
  providedIn: 'root'
})
export class SaleServiceService {

  constructor(private http:HttpClient) { }


getsales()
{
  
  return this.http.get<SaleI[]>("http://localhost:8080/sale/get");
}
getyearlsales(year:number)
{
  return this.http.get<number[]>("http://localhost:8080/sale/getbyyear/"+year);
}
getmonthlysales(year:number)
{
  return this.http.get<number[]>("http://localhost:8080/sale/getmonthly/"+year);
}

}
