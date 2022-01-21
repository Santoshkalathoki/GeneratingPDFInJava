package PDF;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {
	public static void main(String[] args) {
		
		try {
		String file_name="D:\\GeneratePDF\\PDF";
		Document document	 = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(file_name));
		document.open();
		

		

		
		PdfPTable table = new PdfPTable(4);
	    
	    PdfPCell cell = new PdfPCell(new Phrase("1"));
	    cell.setRowspan(2);
	    cell.setColspan(2);
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Phrase("2"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    
	    
	    cell = new PdfPCell(new Phrase("3"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Phrase("4"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	   
	    
	    cell = new PdfPCell(new Phrase("5"));
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);	   
	    table.addCell(cell);
	    
	    
	    cell = new PdfPCell(new Phrase("6"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    cell.setRowspan(20);
	    
	    cell = new PdfPCell(new Phrase("7"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    cell.setColspan(2);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Phrase("8"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    cell = new PdfPCell(new Phrase("9"));	   
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(cell);
	    
	    
	    
	    document.add(table);
		document.close();
		
		
		
		
		
		
		
		
		
		
		System.out.println("Finished..");
		}catch(Exception e) {
			System.err.println(e);
		}
	}

}
