import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { CategoryServiceService } from '../category-service.service';
import { CategoryI } from '../CategoryI';



@Component({
  selector: 'app-category-component',
  templateUrl: './category-component.component.html',
  styleUrls: ['./category-component.component.css']
})
export class CategoryComponentComponent implements OnInit {


  private categoryData=[];
  private a=7;
  constructor(private route:ActivatedRoute,private router:Router,private _categoryService : CategoryServiceService) { }

  ngOnInit() {

    this._categoryService.getCategories().subscribe(data=>this.categoryData=data);


  }

}
