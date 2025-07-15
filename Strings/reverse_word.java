class Solution {
    public String reverseWords(String s) {
        String sChar[]=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();

        for(int i=sChar.length-1;i>=0;i--){
            sb.append(sChar[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}
