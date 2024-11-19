package com.talleruno.app2componenttxt;

import com.talleruno.app2interfaces.App2Interfaces.documentos.Documento;

public class DocumentoTexto implements Documento {
	private String contenido;

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void dibujar() {
		System.out.println("Dibujando Documento en la aplicación." + contenido);
	}

	public void imprimir() {
		System.out.println("Imprimiendo Documento." + contenido);
	}
}
