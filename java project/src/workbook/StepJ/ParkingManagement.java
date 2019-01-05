package workbook.StepJ;

import java.util.Scanner;

public class ParkingManagement {
	private int num = 0; 
	private int total = 0;
	private int date[][] = new int[2][2];
	public ParkingManagement() {
		input();
	}
	
	public void printTotal() {
		System.out.printf("주차차량 %d대의 총 주차요금은 %d입니다.\n", num, total);
	}
	
	void input() {
		int charge;
		String name[] = {"시작", "종료"};
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			//시작 종료 시간 받고
			for(int i = 0; i < 2; i ++) {
				System.out.printf("%d번 차량 주차 %s 시각 (시 분) : ", num+1, name[i]);
				for(int j = 0; j < 2; j++)
					date[i][j] = s.nextInt();
			}
			//요금 계산
			charge = CalcParking(date[0][0], date[0][1], date[1][0], date[1][1]);
			//출력
			System.out.printf("주차 요금 : %d원\n", charge);
			total += charge;
			num++;
			if(one_more() == 0) break;
			
		}
	}
	
	int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int sum;
		sum = 60*(end_h - start_h)+end_m-start_m;
		if(sum%10 == 0)
			return sum/10*500;
		else
			return sum/10*500 + 500;
	}
	int one_more() {
		String more;
		@SuppressWarnings("resource")
		Scanner ns = new Scanner(System.in);
		System.out.printf("더 입력하시겠습니까?(Y/N)");
		more = ns.next();
		if(more.equalsIgnoreCase("N")) return 0;
		else return 1;
	}
}
