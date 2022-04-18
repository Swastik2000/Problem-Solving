# Vaild-Anagram 
# https://leetcode.com/problems/valid-anagram
class Solution {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
       
        HashMap<Character, Integer> map = new HashMap<>();
       
        for (int i = 0; i < a.length(); i++) {
           
            if (map.containsKey(a.charAt(i))) {
              
                map.put(a.charAt(i),
                        map.get(a.charAt(i)) + 1);
            }
            else {
               
                map.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
       
            if (map.containsKey(b.charAt(i))) {
              
                map.put(b.charAt(i),
                        map.get(b.charAt(i)) - 1);
            }
        }
        Set<Character> keys = map.keySet();
       
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
        
    }
}

# 1.Sort

public boolean isAnagram(String s, String t) {
    if (s == t || s.equals(t)) {
        return true;
    }
    char[] sArray = s.toCharArray();
    Arrays.sort(sArray);
    String sortedS = new String(sArray);
    char[] tArray = t.toCharArray();
    Arrays.sort(tArray);
    String sortedT = new String(tArray);
    return sortedS.equals(sortedT);
}
# 2.Hash Array

public boolean isAnagram(String s, String t) {
    int[] hash = new int[26];
    for (int i = 0; i < s.length(); i++) {
        hash[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
        hash[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < hash.length; i++) {
        if (hash[i] != 0) {
            return false;
        }
    }
    return true;
}
# 3.Prime

private static final int[] PRIMES = new int[]{3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
        73, 79, 83, 89, 97, 101, 107};
public boolean isAnagram(String s, String t) {
    return hash(s) == hash(t);
}

private long hash(String s) {
    long hash = 1;
    for (int i = 0; i < s.length(); i++) {
        hash *= PRIMES[s.charAt(i) - 'a'];
    }
    return hash;
}
