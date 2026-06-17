class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();

        for (int i=0;i<s.length();++i) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                filtered.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int i=0;
        int j=filtered.length()-1;

        while(i<j) {
            if (filtered.charAt(i)!=filtered.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
