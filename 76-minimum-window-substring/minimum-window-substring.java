class Solution {
    public String minWindow(String s, String t) {
        int[] ch = new int[128];

        for (char c : t.toCharArray())
            ch[c]++;

        int i = 0, j = 0 , n = t.length() ;
         int min = Integer.MAX_VALUE, start = 0;
        

        while (j < s.length()) {
            if (ch[s.charAt(j)] > 0)
                n--;
            ch[s.charAt(j)]--;
            j++;

            while (n == 0) {
                if (j - i < min) {
                    min = j - i;
                    start = i;
                }

                ch[s.charAt(i)]++;
                if (ch[s.charAt(i)] > 0)
                    n++;
                i++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}