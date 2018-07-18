package com.offcn.bar;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.DefaultCategoryDataset;

public class hello {
	
	public static String getBar(HttpSession session) throws IOException{
		//1、创建数据集
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.addValue(250, "深圳", "苹果");
		dataset.addValue(180, "深圳", "橘子");
		dataset.addValue(350, "深圳", "香蕉");
		dataset.addValue(450, "深圳", "橙子");
		dataset.addValue(550, "深圳", "柠檬");
		
		//2.调用工厂方法来生成柱状图
		JFreeChart chart = ChartFactory.createBarChart3D("水果销售图", "水果", "销售", dataset, PlotOrientation.VERTICAL, true, true, false);
		//3、调用Servlet工具类生成图片
		String filename=ServletUtilities.saveChartAsJPEG(chart, 700, 500, session);
		return filename;
	}
	
}
