package com.taller1.app2;

import com.taller1.app2.factory.Fabrica;
import com.talleruno.app2interfaces.App2Interfaces.documentos.Documento;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la fábrica
        Fabrica fabrica = new Fabrica();

        // Solicitar un componente específico (por ejemplo, "txt", "html" o "pdf")
        String tipoDocumento = "txt"; // Cambia el tipo según lo necesario
        Documento documento = fabrica.getComponentToManageDocument(tipoDocumento);

        // Validar si se obtuvo un documento
        if (documento != null) {
            // Llamar al método del documento (ejemplo: procesar)
            documento.setContenido("contenido del documento");
            documento.dibujar();
            documento.imprimir();
        } else {
            System.out.println("Tipo de documento no reconocido: " + tipoDocumento);
        }
    }
}
