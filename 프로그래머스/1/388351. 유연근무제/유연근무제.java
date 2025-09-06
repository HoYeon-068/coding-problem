class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
          int answer = 0;
        boolean isSuccess;
        int temp_startday;
        int hour,minute,shedule;
        for (int i = 0; i < schedules.length; i++) {
        	isSuccess=true;
        	temp_startday=startday;
        	shedule=schedules[i]+10;
        	hour=shedule/100;
        	minute=shedule%100;
        	
        	if (shedule%100>=60) {
        		hour++;
        		minute=minute-60;
                shedule=(hour*100)+minute;
			}
        	
        	for (int j = 0; j < timelogs[i].length; j++) {
        		if (temp_startday!=6&&temp_startday!=7) {
    				if (timelogs[i][j]>shedule) {
    					//실패 하고 브레이크
    					isSuccess=false;
    					break;
    				}
    			}
        		temp_startday=temp_startday==7?1:temp_startday+1;
        		
			}//j for문
        	if (isSuccess) {
				answer++;
			}
		}//i for문
        return answer;
    }
}