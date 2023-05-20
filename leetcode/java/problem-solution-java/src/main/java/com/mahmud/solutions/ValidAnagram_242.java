package com.mahmud.solutions;

import java.util.Arrays;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        char[] tempArrayS = s.toCharArray();
        char[] tempArrayT = t.toCharArray();

        Arrays.sort(tempArrayS,0,tempArrayS.length);
        Arrays.sort(tempArrayT,0,tempArrayT.length);
        return Arrays.equals(tempArrayS, tempArrayT);
    }
}
