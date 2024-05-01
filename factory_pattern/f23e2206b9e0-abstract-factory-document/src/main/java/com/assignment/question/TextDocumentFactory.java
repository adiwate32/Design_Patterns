package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.parser.TextDocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.printer.SpreadsheetDocumentPrinter;
import com.assignment.question.printer.TextDocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;
import com.assignment.question.processor.SpreadsheetDocumentProcessor;
import com.assignment.question.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor documentProcessor) {
        return new TextDocumentPrinter(documentProcessor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String name) {
        return new TextDocumentProcessor(name);
    }
}