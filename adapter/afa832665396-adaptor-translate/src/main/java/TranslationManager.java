import com.assignment.question.GoogleTranslateAdapter;
import com.assignment.question.MicrosoftTranslateAdapter;
import com.assignment.question.TranslationProviderAdapter;
import com.assignment.question.TranslationRequest;

public class TranslationManager {
    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
        TranslationProviderAdapter adapter;
        if (provider.equals("google")) {
            adapter = new GoogleTranslateAdapter();
        } else if (provider.equals("microsoft")) {
            adapter = new MicrosoftTranslateAdapter();
        } else {
            throw new RuntimeException("Invalid provider");
        }
        TranslationRequest req = new TranslationRequest();
        req.setConffidence(0.8);
        req.setText(text);
        req.setSourceLanguage(sourceLanguage);
        req.setTargetLanguage(targetLanguage);
        return adapter.translate(req);
    }
}