package com.talleruno.app2.factory;

import com.talleruno.app2componenttxt.DocumentoTexto;
import com.talleruno.app2componenthtml.DocumentoHtmlImp;
import com.talleruno.app2componentpdfadapter.DocumentoPdfImp;
import com.talleruno.app2interfaces.App2Interfaces.documentos.Documento;

public class Fabrica {
	
	public Documento getComponentToManageDocument(String nameComponent) {
		switch (nameComponent) {
		case "txt":
			Documento documentoTXT = new DocumentoTexto();
			return documentoTXT;
		case "html":
			Documento documentoHTML = new DocumentoHtmlImp();
			return documentoHTML;
		case "pdf":
			Documento documentoPDF = new DocumentoPdfImp();
			return documentoPDF;
		default:
			return null;
		}
	}

}
