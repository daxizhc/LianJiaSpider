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
public class WatchChart extends ApplicationFrame {

	private static final long serialVersionUID = 1L;

	public WatchChart(String applicationTitle , String chartTitle) {      
		super( applicationTitle );        
	      JFreeChart barChart = ChartFactory.createBarChart(
	         chartTitle,           
	         "",            
	         "带看人数",            
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
	      
	      dataset.addValue(10, "杭州", "滨江");
	      dataset.addValue(11, "杭州", "拱墅");
	      dataset.addValue(5, "杭州", "江干");
	      dataset.addValue(8, "杭州", "上城");
	      dataset.addValue(9, "杭州", "下城");
	      dataset.addValue(7, "杭州", "萧山");
	      dataset.addValue(10, "杭州", "下沙");
	      dataset.addValue(10, "杭州", "西湖");
	      dataset.addValue(8, "杭州", "余杭");
//	      dataset.addValue( 1.0 , fiat , speed );        
//	      dataset.addValue( 3.0 , fiat , userrating );        
//	      dataset.addValue( 5.0 , fiat , millage ); 
//	      dataset.addValue( 5.0 , fiat , safety );           
//
//	      dataset.addValue( 5.0 , audi , speed );        
//	      dataset.addValue( 6.0 , audi , userrating );       
//	      dataset.addValue( 10.0 , audi , millage );        
//	      dataset.addValue( 4.0 , audi , safety );
//
//	      dataset.addValue( 4.0 , ford , speed );        
//	      dataset.addValue( 2.0 , ford , userrating );        
//	      dataset.addValue( 3.0 , ford , millage );        
//	      dataset.addValue( 6.0 , ford , safety );               
	      
//	      dataset.setValue(value, rowKey, columnKey);
	      
	      
	      return dataset; 
	   }
	
	 public static void main( String[ ] args )
	   {
		 WatchChart chart = new WatchChart("杭州链家二手房", "杭州各城区每户二手房平均带看人数");
	      chart.pack( );        
	      RefineryUtilities.centerFrameOnScreen( chart );        
	      chart.setVisible( true ); 
	   }
	
	
}
