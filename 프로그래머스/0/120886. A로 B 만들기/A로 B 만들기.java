class Solution {
    public int solution(String before, String after) {
        
        for(int i=0;i<before.length();i++){
            String temp=before.charAt(i)+"";
            if(after.contains(temp)){
                after=after.replaceFirst(temp," ");
            }else{
                return 0;
            }
        }
        
        return 1;
    }
}