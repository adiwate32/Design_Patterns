package com.assignment.question;

import java.util.List;

public interface TranslationProviderAdapter {
    String translate(TranslationRequest req);
    List<String> getSupportedLanguages();
}