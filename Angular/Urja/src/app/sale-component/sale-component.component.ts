import { Component, OnInit } from '@angular/core';
import {Chart} from 'chart.js'
import { HttpClient } from '@angular/common/http';
import { SaleServiceService } from '../sale-service.service';
import {SaleI} from '../SaleI'
@Component({
  selector: 'app-sale-component',
  templateUrl: './sale-component.component.html',
  styleUrls: ['./sale-component.component.css']
})
export class SaleComponentComponent implements OnInit {

  constructor(private _saleservice:SaleServiceService) {


   }

  YearlyChart=[]; //yearly chart object
  QuarterlyChart=[];
  MonthlyChart=[];

  YearlySale=[];
  graphdata=[];
  quartgraphdata=[];
  monthgraphdata=[];
  temp=[];

  ngOnInit() {

    this._saleservice.getyearlsales(2019)
      .subscribe(
        (response) => {
          for(var i = 0; i < response.length; i++) {
            this.temp.push(i+1);
          }
          this.graphdata=response;
          this.buildYearlyChart();
        },
        (error) => console.error(error)
      );
     
    this._saleservice.getmonthlysales(2019).subscribe(
      (response)=>{
          this.monthgraphdata=response;
          var sum=0;
          for(var i=0;i<response.length;i++)
          {

            if((i+1)%3===0)
            {
              sum=sum+response[i];
              this.quartgraphdata.push(sum);
              sum=0;
            }  
            else
            {
              sum=sum+response[i];
            }
          }
          this.buildQuarterlyChart();
          this.buildMonthlyChart();
      }
    );





 



  }

  buildYearlyChart()
  {
this.YearlyChart = new Chart('yearlyChart', {
  type: 'bar',
data: {
   labels: this.temp,
 datasets: [{
     label: 'Daily Sale',
    //  data: [{y:90,x:10},{y:70,x:20} , {y:30,x:30}, {y:50,x:40}, {y:20,x:50}, {y:100,x:60},{x:70,y:150},{x:80,y:160},{x:90,y:190},{x:100,y:30},{x:110,y:10},{x:120,y:90}],
    // data:[1,2,3,4,4,5,5,5,6,7,7,8,1,12,2,2,3,4,5,6,7,8,9,6],
    data:this.graphdata,
     fill:false,
     lineTension:0.2,
     borderColor:"#D50D31",
     borderWidth: 2
     
 }]
}, 
options: {
 title:{
     text:"Yearly Sku Sale BarChart of year 2019",
     display:true
 },
 scales: {
     yAxes: [{
         ticks: {
             beginAtZero:true
         }
     }]
    
 }

 
}
});
}

buildQuarterlyChart()
{
  this.QuarterlyChart = new Chart('quarterlyChart', {
    type: 'pie',
  data: {
     labels:["Q1","Q2","Q3","Q4"],
   datasets: [{
       label: 'Quarterly Sale',
      //  data: [{y:90,x:10},{y:70,x:20} , {y:30,x:30}, {y:50,x:40}, {y:20,x:50}, {y:100,x:60},{x:70,y:150},{x:80,y:160},{x:90,y:190},{x:100,y:30},{x:110,y:10},{x:120,y:90}],
      // data:[1,2,3,4,4,5,5,5,6,7,7,8,1,12,2,2,3,4,5,6,7,8,9,6],
      data:this.quartgraphdata,
       fill:false,
       lineTension:0.2,
       borderColor:"black",
       backgroundColor:["#F85605","#DD8D33","#DDCB33","#9ADD33"],
       borderWidth: 0
       
   }]
  }, 
  options: {
   title:{
       text:"Quarterly Sku Sale LineChart of year 2019",
       display:true
   },
   scales: {
       yAxes: [{
           ticks: {
               beginAtZero:true
           }
       }]
      
   }
  
   
  }
  });



}

buildMonthlyChart()
{
  this.MonthlyChart = new Chart('monthlyChart', {
    type: 'line',
  data: {
     labels:["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"],
   datasets: [{
       label: 'Monthly Sale',
      //  data: [{y:90,x:10},{y:70,x:20} , {y:30,x:30}, {y:50,x:40}, {y:20,x:50}, {y:100,x:60},{x:70,y:150},{x:80,y:160},{x:90,y:190},{x:100,y:30},{x:110,y:10},{x:120,y:90}],
      // data:[1,2,3,4,4,5,5,5,6,7,7,8,1,12,2,2,3,4,5,6,7,8,9,6],
      data:this.monthgraphdata,
       fill:false,
       lineTension:0.2,
       borderColor:"#D50D31",
       borderWidth: 2
       
   }]
  }, 
  options: {
   title:{
       text:"Monthly Sku Sale LineChart of year 2019",
       display:true
   },
   scales: {
       yAxes: [{
           ticks: {
               beginAtZero:true
           }
       }]
      
   }
  
   
  }
  });

}


}
