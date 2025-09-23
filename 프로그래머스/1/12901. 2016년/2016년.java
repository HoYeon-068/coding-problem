import java.util.Calendar;
import java.util.GregorianCalendar;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Calendar c=new GregorianCalendar(2016,a-1,b);
        String date=c.getTime()+"";
        answer=date.substring(0, 3);
        return answer.toUpperCase();
    }
}