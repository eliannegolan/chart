
package com.example.application.views;

import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinRequest;

import static java.lang.System.currentTimeMillis;

public class MainLayout
{
     //void init()//VaadinRequest request)
    //{
      //  final VerticalLayout layout = new VerticalLayout();
        //layout.setMargin(true);
        //setContent(layout);
       // HRData data = new HRData();
       // layout.add(getHR(data));


   // }

        public void getHR()
    {

        Chart chart = new Chart();
        Configuration conf = chart.getConfiguration();
        conf.setTitle("Live Heart Rate Data");

        conf.getChart().setType(ChartType.SPLINE);

        XAxis xAxis = conf.getxAxis();
        xAxis.setTitle(new AxisTitle("Time"));
        xAxis.setType(AxisType.DATETIME);
        xAxis.setTickPixelInterval(150);

        YAxis yAxis = conf.getyAxis();
        yAxis.setTitle(new AxisTitle("Heart Rate (bpm)"));

        conf.getTooltip().setEnabled(false);
        conf.getLegend().setEnabled(false);


        DataSeries hr = new DataSeries("Heart Rate");
        hr.setPlotOptions(new PlotOptionsSpline());

       
    }

}



  //  private void setContent(VerticalLayout layout) {
    //}
