import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CategoryComponentComponent } from './category-component/category-component.component';
import { SkuComponentComponent } from './sku-component/sku-component.component';
import { RegionComponentComponent } from './region-component/region-component.component';
import { SaleComponentComponent } from './sale-component/sale-component.component';


const routes: Routes = [
  
  
  {path:'category',component:CategoryComponentComponent},
  {path:'sku',component:SkuComponentComponent},
  {path:'region',component:RegionComponentComponent},
  {path:'sale',component:SaleComponentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
