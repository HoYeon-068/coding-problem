class Solution {
  public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		String answer = "";

		pos=checkOp(pos,op_start,op_end);
		pos=culCommands(video_len,pos,commands,op_start,op_end);
		


		return pos;
	}
	public static String culCommands(String video_len, String pos, String[] commands, String op_start, String op_end) {
		
		
		for (int i = 0; i < commands.length; i++) {
			switch (commands[i]) {
			case "next":
				pos=nextTime(pos,video_len);
				break;
			case "prev":
				pos=prevTime(pos);
				break;

			default:
				System.out.println("입력 오류");
				break;
			}
			
			pos=checkOp(pos, op_start, op_end);
		}
		
		return pos;
	}

	public static String nextTime(String pos,String video_len) {
		int posTime=changeIntTime(pos);
		int videoLen=changeIntTime(video_len);
//		posTime=changeSecondSixty(posTime,10);
		
		posTime+=10;
		if (posTime%100>=60) {
			posTime+=100;
			posTime-=60;
		}
		
		
		if (posTime>videoLen) {
			posTime=videoLen;
		}
		
		pos=changeStringTime(posTime);
		
		System.out.println("next 적용-"+pos);
		return pos; 
	}
	public static String prevTime(String pos) {
		int posTime=changeIntTime(pos);
//		posTime=changeSecondSixty(posTime,-10);
		posTime+=-10;
		
		if (posTime<0) {
			posTime=0;
		}
		
		if (posTime%100>=60) {
			posTime-=40;
		}
		
		pos=changeStringTime(posTime);

		System.out.println("prev 적용-"+pos);
		return pos; 
	}
//	public static int changeSecondSixty(int time,int n) {
//		
//		time+=n;
//		
//		if (n<0) {
//			if(time<0) {
//				time=0;
//			}
//			else if (time%100>=60) {
//				time-=40;
//			}
//		}else {
//			if (time%100>=50) {
//				time+=n;
//				time+=100;
//				time-=60;
//			}
//		}
//		
//		
//		return time;
//	}
	
	public static String checkOp(String pos,String op_start,String op_end) {
		int opStart,opEnd,posTime;
		posTime=changeIntTime(pos);
		opStart=changeIntTime(op_start);
		opEnd=changeIntTime(op_end);

		if (opStart<=posTime&&posTime<opEnd) {
			pos=op_end;
			System.out.println("오프닝 시간 적용-"+pos);
		}
		return pos;
	}
	public static int changeIntTime(String timeS) {
		int minute,second,time;
		minute=Integer.parseInt(timeS.substring(0, 2));
		second=Integer.parseInt(timeS.substring(3));
		time=(minute*100)+second;
		return time;
	}
	public static String changeStringTime(int time) {
		String pos;
		pos=String.format("%02d:%02d", time/100,time%100);
		return pos;
	}

}