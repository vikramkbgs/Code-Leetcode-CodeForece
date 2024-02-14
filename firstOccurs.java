// oneliner O(n + m)

public int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
}

// recursion )(n*m) n lenght of heystack m needle length
class Solution {
    
    private int strStrRecursive(String haystack, String needle, int index) {
        if (index > haystack.length() - needle.length()) {
            return -1; // The remaining length of haystack is less than needle's length
        }
        
        if (haystack.substring(index).startsWith(needle)) {
            return index; // Found the needle
        }
        
        return strStrRecursive(haystack, needle, index + 1); // Move to the next character in haystack
    }

    public int strStr(String haystack, String needle) {
        return strStrRecursive(haystack, needle, 0);
    }
}