package com.assignment.question;

public abstract class DocumentProcessor {
    private String documentName;

    DocumentProcessor(String documentName){
        this.documentName = documentName;
    }

    public abstract DocumentType supportsType();

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

}