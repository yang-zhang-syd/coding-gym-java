package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {

        List<String> mapping = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        List<String> result = new ArrayList<>();

        for(Character digit : digits.toCharArray()) {

            List<String> newStrings = new ArrayList<>();
            String chars = mapping.get(Integer.parseInt(digit.toString()) - 2);

            if(result.size() == 0) {
                for(Character c : chars.toCharArray()) {
                    newStrings.add(c.toString());
                }
            }
            else {
                for(String s : result) {
                    for(char c : chars.toCharArray()) {
                        newStrings.add(s + c);
                    }
                }
            }

            result = newStrings;

        }

        return result;
    }

}
