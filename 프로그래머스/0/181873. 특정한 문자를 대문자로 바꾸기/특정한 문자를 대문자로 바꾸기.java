class Solution {
    public String solution(String my_string, String alp) {
        
        char c=alp.charAt(0);
        return my_string.replace(c, (char)(c-32));
    }
}