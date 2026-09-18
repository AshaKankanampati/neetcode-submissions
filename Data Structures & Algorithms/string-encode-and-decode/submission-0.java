class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String str:strs){
            s.append(str.length()+"#"+str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j = i;

        // Find '#'
        while (str.charAt(j) != '#') {
            j++;
        }

        // Get length
        int length = Integer.parseInt(str.substring(i, j));

        // Move past '#'
        j++;

        // Get the actual string
        String word = str.substring(j, j + length);

        result.add(word);

        // Move to the next encoded string
        i = j + length;
        }
        return result;
    }
}
