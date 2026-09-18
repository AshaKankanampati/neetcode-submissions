class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t==null)
            return true;
        if((s==null && t!=null) || (s!=null && t==null))
        return false;
        if(s.length()!=t.length())
        return false;
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        String sorteds=new String(cs);
        String sortedt=new String(ct);
        if(sorteds.equalsIgnoreCase(sortedt))
        return true;
        else
        return false;

    }
}
