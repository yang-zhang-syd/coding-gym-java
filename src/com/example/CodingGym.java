package com.example;

public class CodingGym {
    public static void main(String[] args) {
        String testStr = "the sky is blue";
        char[] str = testStr.toCharArray();

        ReverseWordsInString testObj = new ReverseWordsInString();
        testObj.reverseWords(str);
    }
}


