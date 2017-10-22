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
public class FocusChart extends ApplicationFrame {

	
	private static final long serialVersionUID = 1L;

	public FocusChart(String applicationTitle , String chartTitle) {      
		super( applicationTitle );        
	      JFreeChart barChart = ChartFactory.createBarChart(
	         chartTitle,           
	         "",            
	         "关注人数",            
	         createDataset(),          
	         PlotOrientation.VERTICAL,           
	         true, true, false);
	         
	      ChartPanel chartPanel = new ChartPanel( barChart );        
	      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
	      setContentPane( chartPanel ); 
	}

	private CategoryDataset createDataset( )
	   {    
	      final DefaultCategoryDataset dataset = 
	      new DefaultCategoryDataset( );  
	      
	      dataset.addValue(27.5, "杭州", "滨江");
	      dataset.addValue(23.2, "杭州", "拱墅");
	      dataset.addValue(12.8, "杭州", "江干");
	      dataset.addValue(18, "杭州", "上城");
	      dataset.addValue(16.7, "杭州", "下城");
	      dataset.addValue(19.9, "杭州", "萧山");
	      dataset.addValue(18.8, "杭州", "下沙");
	      dataset.addValue(20.6, "杭州", "西湖");
	      dataset.addValue(23.1, "杭州", "余杭");

	      
	      return dataset; 
	   }
	
	 public static void main( String[ ] args )
	   {
		 FocusChart chart = new FocusChart("杭州链家二手房", "杭州各城区每户二手房平均关注人数");
	      chart.pack( );        
	      RefineryUtilities.centerFrameOnScreen( chart );        
	      chart.setVisible( true ); 
	   }
	
	
}
