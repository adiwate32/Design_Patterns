package com.assignment.question;

import com.assignment.question.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslateAdapter implements TranslationProviderAdapter{

    private MicrosoftTranslateApi microsoftTranslateApi;
    public MicrosoftTranslateAdapter() {
       microsoftTranslateApi = new MicrosoftTranslateApi();
    }

    @Override
    public String translate(TranslationRequest req) {
        return microsoftTranslateApi.translate(req.getText(), req.getSourceLanguage(), req.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
