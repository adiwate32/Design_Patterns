package com.assignment.question;

import com.assignment.question.external.GoogleTranslateApi;
import com.assignment.question.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslateAdapter implements TranslationProviderAdapter{
    private GoogleTranslateApi googleTranslateApi;

    public GoogleTranslateAdapter(){
        googleTranslateApi = new GoogleTranslateApi();
    }

    @Override
    public String translate(TranslationRequest req) {
        GoogleTranslationRequest request = new GoogleTranslationRequest(req.getText(), req.getSourceLanguage(), req.getTargetLanguage(), req.getConffidence());
        return googleTranslateApi.convert(request);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
