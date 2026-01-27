class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int index=0;
        int length=0;
        while(index<num_list.length){
            index+=n;
            length++;
        }
        
        int[] answer = new int[length];
        
        index=0;
        for(int i=0;i<answer.length;i++){
            answer[i]=num_list[index];
            index+=n;
        }
        
        return answer;
    }
}