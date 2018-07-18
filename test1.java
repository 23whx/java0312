package com.offcn;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfDocumentInfo;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		//1.创建PdfWriter
		PdfWriter pdfwriter = new PdfWriter("d:\\chart\\hello.pdf");
		
		//2.创建PdfDocument
		PdfDocument pdfdoc = new PdfDocument(pdfwriter);
		//3.获取文档属性设置对象
		PdfDocumentInfo info = pdfdoc.getDocumentInfo();
		info.setAuthor("java0312班");
		info.setCreator("博丽灵梦");
		info.setKeywords("java,jsp,j2ee,servlet");
		info.setSubject("JAVA文档研究主题");
		info.setTitle("JAVA测试文档");
		
		//4.创建Document文档对象
		Document doc=new Document(pdfdoc);
		
		//5.操作document对象，写入内容
		doc.add(new Paragraph("hello world!"));
		
		//6.关闭
		doc.close();	
		System.out.println("pdf ok");
	}   
}
