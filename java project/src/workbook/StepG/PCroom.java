package workbook.StepG;

import java.util.Scanner;

public class PCroom {
	int hour, minute; 
	int charge;
	int total_charge = 0;
	
	public PCroom() {
		input();
	}
	public void printMoney() {
		//총액 출력
		System.out.printf("지금까지의 이용료 총금액은 %d원입니다.\n", total_charge);
	}
	
	void input(){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			//사용 시간 분 입력받기
			System.out.printf("사용한 시간을 시간과 분으로 입력하세요 : ", hour, minute);
			hour = s.nextInt();
			minute = s.nextInt();
			//둘 다 0이면 끝
			if((hour == 0)&&(minute == 0)) break;
			
			//분은 30초과면 돈은 (2+ 시간*2)*1000
			if(minute > 30)
				charge = (2 + hour * 2) * 1000;
			//아니고 분이 0초과면 돈은 (1+ 시간*2)*1000
			else if(minute > 0)
				charge = (1 + hour * 2) * 1000;
			//아니고 0이면 시간*2*1000
			else if(minute == 0)
				charge = hour * 2 * 1000;
			
			//시간이 5이상이면 20%할인
			if(hour >= 5)
				charge = charge/5*4;
			//아니고 3이상이면 10%를 할인받는다.
			else if(hour >= 3)
				charge = charge/10*9;
			//아니고 2시간 이상이면 5%를 할인
			else if(hour >= 2)
				charge = charge/20*19;
			
			//더하기
			System.out.printf("고객님의 이용료는 %d원입니다.\n", charge);
			total_charge += charge;
		}
	}
}
