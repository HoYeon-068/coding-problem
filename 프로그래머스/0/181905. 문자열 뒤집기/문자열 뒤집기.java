class Solution {
    public String solution(String my_string, int s, int e) {
        char arr[]=my_string.toCharArray();
        
        char temp;
		
		for (int i = 0; i < (e-s+1)/2; i++) {
			temp=arr[s+i];
			arr[s+i]=arr[e-i];
			arr[e-i]=temp;
			
		}
        
        return String.valueOf(arr);
    }
}