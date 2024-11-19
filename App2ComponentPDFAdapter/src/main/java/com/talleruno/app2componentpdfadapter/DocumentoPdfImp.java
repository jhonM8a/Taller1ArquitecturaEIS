package com.talleruno.app2componentpdfadapter;

import com.talleruno.app2componentpdf.ComponentePDF;
import com.talleruno.app2interfaces.App2Interfaces.documentos.Documento;

public class DocumentoPdfImp implements Documento {

	ComponentePDF herramientaPdf = new ComponentePDF();

	@Override
	public void setContenido(String contenido) {
		herramientaPdf.pdfFijaContenido(contenido);
	}

	@Override
	public void dibujar() {
		herramientaPdf.pdfPreparaVisualizacion();
		herramientaPdf.pdfRefresca();
		herramientaPdf.pdfFinalizarVisualizacion();
	}

	@Override
	public void imprimir() {
		herramientaPdf.pdfEnviarImpresora();
	}
}
