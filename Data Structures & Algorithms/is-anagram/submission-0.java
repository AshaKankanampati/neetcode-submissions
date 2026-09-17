class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t==null)
        return true;

        if(s.length()!=t.length())
        return false;
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        Arrays.sort(charsS);
        Arrays.sort(charsT);
        String sortedS = new String(charsS);
        String sortedT = new String(charsT);
        if(sortedS.equalsIgnoreCase(sortedT))
        return true;
        return false;
    }
}
