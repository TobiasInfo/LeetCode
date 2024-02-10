class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        if (s.trim().length() == 0) {
            return 1;
        }
        int max = 0;
        Set<Character> letters = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            letters.clear();
            for (int j = i; j < s.length(); j++) {
                if (letters.contains(s.charAt(j))) {
                    max = Math.max(max, letters.size());
                    break;
                }
                letters.add(s.charAt(j));
            }
            max = Math.max(max, letters.size());
            System.out.println(letters);
        }
        return max;
    }
}