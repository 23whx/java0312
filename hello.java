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
		//1���������ݼ�
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.addValue(250, "����", "ƻ��");
		dataset.addValue(180, "����", "����");
		dataset.addValue(350, "����", "�㽶");
		dataset.addValue(450, "����", "����");
		dataset.addValue(550, "����", "����");
		
		//2.���ù���������������״ͼ
		JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ��", "����", dataset, PlotOrientation.VERTICAL, true, true, false);
		//3������Servlet����������ͼƬ
		String filename=ServletUtilities.saveChartAsJPEG(chart, 700, 500, session);
		return filename;
	}
	
}
