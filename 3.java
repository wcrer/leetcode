class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> c=new HashSet<>();
        int length=0,max_length=0;
        for(int i=0;i < s.length();i++){
            c.add(s.charAt(i));
            length++;
            for(int j=i+1;j<s.length();j++){
                if(c.contains(s.charAt(j))){
                    c.clear();
                    break;
                }else{
                    c.add(s.charAt(j));
                    length++;
                }
            }
            if(length>max_length){
                max_length=length;
            }
            length=0;
        }
        return max_length;
    }
}