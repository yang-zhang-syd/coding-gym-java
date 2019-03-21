package com.example;

public class ReverseWordsInString {

    public void reverseWords(char[] str) {

        int begin = 0;
        int end = 0;

        for(int i = 0; i <= str.length; ++i) {

            if(i == str.length || str[i] == ' ') {
                end = i - 1;

                // reverse the word
                reverse(str, begin, end);

                // set new begin pointer
                begin = i + 1;
            }

        }

        begin = 0;
        end = str.length - 1;
        reverse(str, begin, end);
    }

    private void reverse(char[] str, int begin, int end) {

        while(begin < end) {
            char temp = str[begin];
            str[begin] = str[end];
            str[end] = temp;

            begin++;
            end--;
        }

    }

}
