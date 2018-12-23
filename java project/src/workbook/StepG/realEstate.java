package workbook.StepG;

import java.util.Scanner;
public class realEstate {
	private int kind;
	private int money;
	private int charge;
	private int total_charge;
	
	public realEstate() {
		input();
	}
	
	public void printTotal() {
		//마지막 총액 출력
		System.out.printf("지금까지의 수수료 총액은 %d원 입니다.\n", total_charge);
	}
	void input() {
		//선언
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			//부동산 거래 종류를 받고
			System.out.printf("부동산 거래종류(1:매매, 2:임대, 0:계산종료)를 입력하세요 : ");
			kind = s.nextInt();
			//0이면 break;
			if (kind == 0) break;
			//입력 받기
			System.out.printf("부동산 거래금액(원)을 입력하세요 : ");
			money = s.nextInt();
			//1이면
			if(kind == 1)
				//charge = 매매함수
				charge = deal(money);
			//2이면
			else if(kind == 2)
				//charge = 임대함수
				charge = rental(money);
			//중개수수료 출력해주고
			System.out.printf("이에 대한 중개 수수료는 %d입니다.\n", charge);
			//다 더해주기
			total_charge += charge;
		}
			
	}
	
	//매매 함수
	int deal(int money) {
		//5천만원 미만 0.6% 250,000
		if(money < 50000000) {
			charge = money*6/1000;
			if(charge > 250000)
				charge = 250000;
		}
		//아니면 2억원 미만 0.5% 800,000
		else if(money < 200000000) {
			charge = money/200;
			if(charge > 800000)
				charge = 800000;
		}
		//아니면 0.4% 없음
		else
			charge = money/250;
		
		return this.charge;
	}
	
	//임대 함수
	int rental(int money) {
		//2천만원 미만 0.5% 70,000
		if(money < 20000000) {
			charge = money / 200;
			if(charge > 70000)
				charge = 70000;
		}
		//아니고 5천만원 미만 0.5% 200,000
		else if(money < 50000000) {
			charge = money / 200;
			if(charge > 200000)
				charge = 200000;
		}
		//아니고 1억원 미만 0.4 300,000
		else if(money < 100000000) {
			charge = money / 250;
			if(charge > 300000)
				charge = 300000;
		}
		//아니면  0.3% 없음
		else
			charge = money / 1000 * 3;
		
		return this.charge;
	}
}
