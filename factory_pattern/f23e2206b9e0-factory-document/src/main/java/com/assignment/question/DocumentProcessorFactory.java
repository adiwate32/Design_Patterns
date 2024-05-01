package com.assignment.question;

public class DocumentProcessorFactory {
    public static DocumentProcessor getFactoryObj(DocumentType documentType, String documentName){
        switch (documentType){
            case TEXT -> {
                return new TextDocumentProcessor(documentName);
            }
            case SPREAD_SHEET -> {
                return new SpreadsheetDocumentProcessor(documentName);
            }
            case PRESENTATION -> {
                return new PresentationDocumentProcessor(documentName);
            }
        }
        return null;
    }
}