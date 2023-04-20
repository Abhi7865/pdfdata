package com.example.demo.Service;

import java.io.ByteArrayInputStream; 
import java.io.ByteArrayOutputStream;

import org.hibernate.boot.archive.internal.ByteArrayInputStreamAccess;
import org.hibernate.engine.jdbc.Size;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LoanRepository;
import com.example.demo.entity.LoanDatabase;
import com.fasterxml.jackson.core.util.RequestPayload;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.example.demo.payload.*;
@Service
public class PdfService {

	private Logger logger= LoggerFactory.getLogger(PdfService.class);
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private LoanDatabase loanDatabase;
	
	public ByteArrayInputStream createPdf(com.example.demo.payload.RequestPayload requestPayload) {
		logger.info("Create PDF Started :");
		String title ="DETAILS";
		String content="CONTAINS ALL NECESSARY REQUIRED DETAILS";
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Document document = new Document();
		
		
		 PdfWriter.getInstance(document, out);
		 
		 document.open();
		 Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		Paragraph TitlePara = new Paragraph(title,titleFont );
		TitlePara.setAlignment(Element.ALIGN_CENTER);
		
		document.add(TitlePara);
		Font paraFont = FontFactory.getFont(FontFactory.HELVETICA,19);
		Paragraph paragraph = new Paragraph(content);
		
		paragraph.add(new Chunk("wow this text is added after creating paragraph"));
		
		document.add(paragraph);
		
		document.close();
		
		
		
		
		return new ByteArrayInputStream(out.toByteArray());
		
	}
	

	public ByteArrayInputStream createLoanPdf(com.example.demo.payload.RequestPayload requestPayload) {
		
	
		//ByteArrayInputStream pdf=createPdf(requestPayload);
		
		loanDatabase.setFirstName(requestPayload.getFirstName());//1
		loanDatabase.setLastName(requestPayload.getLastName());//2
		loanDatabase.setDob(requestPayload.getDob());//3
		loanDatabase.setLoanAmount(requestPayload.getLoanAmount());//4
		loanDatabase.setLoanNumber(requestPayload.getLoanNumber());//5
		loanDatabase.setLoanTennure(requestPayload.getLoanTennure());//6
//		loanDatabase.setLoanpdf(pdf.b);//7
		loanDatabase.setLoanEmi(requestPayload.getLoanEmi());//8
		
		loanRepository.save(loanDatabase);
		return null;
		
	}
	
	
}
