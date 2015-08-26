/**
 * 
 */
package com.apress.isf.java.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

/**
 * @author herb
 *
 */
public class MySearchEngine implements SearchEngine {

	public List<Document> findByType(Type documentType) {
		List<Document> result = new ArrayList<Document>();
		for (Document document : storage()) {
			if(documentType.getName().equals(document.getType().getName()))
				result.add(document);
		}
		return result;
	}

	public List<Document> listAll() {		
		return storage();
	}
	
	private List<Document> storage() {
		List<Document> result = new ArrayList<Document>();
		
		Type type = new Type();
		type.setName("PDF");
		type.setDesc("Portable Document Format");
		type.setExtension(".pdf");
		
		Document document = new Document();
		document.setName("Book Template");
		document.setType(type);
		document.setLocation("/Documents/Book Template.pdf");
		
		result.add(document);
		
		Type type2 = new Type();
		type2.setName("DOCX");
		type2.setDesc("Windows Word Document");
		type2.setExtension(".docx");
		
		Document document2 = new Document();
		document2.setName("Story Template");
		document2.setType(type2);
		document2.setLocation("/Documents/Story Template.docx");
		
		result.add(document2);
		
		Type type3 = new Type();
		type3.setName("WEB");
		type3.setDesc("Web link");
		type3.setExtension(".url");
		
		Document document3 = new Document();
		document3.setName("Some web page");
		document3.setType(type3);
		document3.setLocation("/Documents/Some_web_page.url");
		
		result.add(document3);
		
		return result;
	}

}
