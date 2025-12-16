class Solution {
    public int solution(int[] array) {
        String all="";
        String edit="";
        
        for(int i=0;i<array.length;i++){
            all+=array[i];
        }
        
        
        edit=all.replaceAll("7","");
        
        return all.length()-edit.length();
    }
}