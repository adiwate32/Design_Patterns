package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentType supportsType();

    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor documentProcessor);
    public abstract DocumentProcessor createDocumentProcessor(String name);
}