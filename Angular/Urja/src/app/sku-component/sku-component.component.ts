import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { SkuServiceService } from '../sku-service.service';

@Component({
  selector: 'app-sku-component',
  templateUrl: './sku-component.component.html',
  styleUrls: ['./sku-component.component.css']
})
export class SkuComponentComponent implements OnInit {

  skuData=[];

  constructor(private route:ActivatedRoute,private router:Router,private _skuService:SkuServiceService) { }

  ngOnInit() {
    

    this._skuService.getSkus().subscribe(data=>this.skuData=data);


    
  }

}
