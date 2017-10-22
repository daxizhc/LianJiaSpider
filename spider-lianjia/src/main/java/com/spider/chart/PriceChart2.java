package com.spider.chart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

//用于生成图表
public class PriceChart2 extends ApplicationFrame {

	private static final long serialVersionUID = 1L;

	public PriceChart2(String applicationTitle , String chartTitle) {      
		super( applicationTitle );        
	      JFreeChart barChart = ChartFactory.createBarChart(
	         chartTitle,           
	         "",            
	         "房价（单位：元／平方米）",            
	         createDataset(),          
	         PlotOrientation.VERTICAL,           
	         true, true, false);
	         
	      ChartPanel chartPanel = new ChartPanel( barChart );        
	      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
	      setContentPane( chartPanel ); 
	}

	private CategoryDataset createDataset( )
	   {
//	      final String fiat = "FIAT";        
//	      final String audi = "AUDI";        
//	      final String ford = "FORD";        
//	      final String speed = "Speed";        
//	      final String millage = "Millage";        
//	      final String userrating = "User Rating";        
//	      final String safety = "safety";        
	      final DefaultCategoryDataset dataset = 
	      new DefaultCategoryDataset( );  
	      
	      dataset.addValue(23756.0, "余杭", "闲林");
	      dataset.addValue(29513.5, "余杭", "良渚");
	      dataset.addValue(25722.2, "余杭", "瓶窑");
	      dataset.addValue(19650.9, "余杭", "星桥");
	      dataset.addValue(19661.6, "余杭", "崇贤");
	      dataset.addValue(13353.9, "余杭", "塘栖");
	      dataset.addValue(25768.9, "余杭", "勾庄");
	      dataset.addValue(12682.8, "余杭", "仁和");
	      dataset.addValue(22963.1, "余杭", "乔司");
	      dataset.addValue(19695.6, "余杭", "临平");
	      
	      return dataset; 
	   }
	
	 public static void main( String[ ] args )
	   {
		 PriceChart2 chart = new PriceChart2("杭州链家二手房", "余杭各地区平均房价");
	      chart.pack( );        
	      RefineryUtilities.centerFrameOnScreen( chart );        
	      chart.setVisible( true ); 
	   }
	
	
}
