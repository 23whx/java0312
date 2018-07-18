package com.offcn;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfDocumentInfo;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		//1.����PdfWriter
		PdfWriter pdfwriter = new PdfWriter("d:\\chart\\hello.pdf");
		
		//2.����PdfDocument
		PdfDocument pdfdoc = new PdfDocument(pdfwriter);
		//3.��ȡ�ĵ��������ö���
		PdfDocumentInfo info = pdfdoc.getDocumentInfo();
		info.setAuthor("java0312��");
		info.setCreator("��������");
		info.setKeywords("java,jsp,j2ee,servlet");
		info.setSubject("JAVA�ĵ��о�����");
		info.setTitle("JAVA�����ĵ�");
		
		//4.����Document�ĵ�����
		Document doc=new Document(pdfdoc);
		
		//5.����document����д������
		doc.add(new Paragraph("hello world!"));
		
		//6.�ر�
		doc.close();	
		System.out.println("pdf ok");
	}   
}
