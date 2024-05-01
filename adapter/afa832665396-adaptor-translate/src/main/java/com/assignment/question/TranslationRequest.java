package com.assignment.question;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@NoArgsConstructor
@Getter
@Setter
public class TranslationRequest {
    String text;
    String sourceLanguage;
    String targetLanguage;
    double conffidence;
}