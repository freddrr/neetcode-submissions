class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i=0; i < s.length();++i) {
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j=0; j < t.length();++j) {
            tCount.put(t.charAt(j), tCount.getOrDefault(t.charAt(j), 0) + 1);
        }

        return sCount.equals(tCount);
    }
}
