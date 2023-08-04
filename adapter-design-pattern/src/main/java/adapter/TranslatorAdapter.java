package adapter;

import adaptee.JapaneseAdaptee;
import target.VietnameseTarget;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String message) {
        System.out.println("Reading words ...");
        System.out.println(message);
        String vietnameseWords = this.translate(message);
        System.out.println("Sending words ...");
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
