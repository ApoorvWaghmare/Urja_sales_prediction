import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CategoryComponentComponent } from './category-component/category-component.component';
import { CategoryServiceService } from './category-service.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { SkuComponentComponent } from './sku-component/sku-component.component';
import { SkuServiceService } from './sku-service.service';
import { RegionComponentComponent } from './region-component/region-component.component';
import { SaleComponentComponent } from './sale-component/sale-component.component';



@NgModule({
  declarations: [
    AppComponent,
    CategoryComponentComponent,
    SkuComponentComponent,
    RegionComponentComponent,
    SaleComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CategoryServiceService,SkuServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
