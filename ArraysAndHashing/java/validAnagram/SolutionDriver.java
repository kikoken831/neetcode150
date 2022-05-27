package ArraysAndHashing.java.validAnagram;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/

public class SolutionDriver {
    public static void main(String[] args) {
        System.out.println(isAnagram(args[0], args[1]));
    }

    public static boolean isAnagram(String s, String t) {
        // create 2 hashmap for s and t
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        Map<Character, Integer> m2 = new HashMap<Character, Integer>();
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
           m1.merge(s.charAt(i), 1, Integer::sum);
           m2.merge(t.charAt(i), 1, Integer::sum);
        }

        return (m1.equals(m2));
    }
}