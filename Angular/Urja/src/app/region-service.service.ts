import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RegionI } from './RegionI';
import { setDefaultService } from 'selenium-webdriver/opera';

@Injectable({
  providedIn: 'root'
})
export class RegionServiceService {

  constructor(private http:HttpClient) { }

  getAllRegions()
  {
    return this.http.get<RegionI[]>("http://localhost:8080/region/get");
  }

  getRegionbyId(id : number)
  {
    return this.http.get<RegionI[]>("http://localhost:8080/region/get/"+id);
  }


}
