package com.company.StringHelper;

import java.util.ArrayList;
import java.util.Collections;

public class StringHelper implements CharSequence {
    private String text;

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public boolean isEmpty() {
        return text.isEmpty();
    }

    @Override
    public char charAt( int index ) {
        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence( int start, int end ) {
        return text.subSequence(start, end);
    }

    public void reverse() {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            characters.add(charAt(i));
        }
        Collections.reverse(characters);
        StringBuilder reversedText = new StringBuilder();
        for (Character character : characters) {
            reversedText.append(character);
        }
        System.out.println(reversedText);
    }

    public String getText() {
        return text;
    }

    public void setText( String text ) {
        this.text = text;
    }
}
