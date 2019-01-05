package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 심사점수 계산\n");
			printf("3. 물의 온도 구간 개수 판정\n");
			printf("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 세기\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수 구하기\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackermann 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 피보나치 수열로 황금비율 구하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				JudgeAge ja = new JudgeAge();
				ja.printJudge();
				break;
			case 2:
				JudgeScore js = new JudgeScore();
				js.printScore();
				break;
			case 3:
				JudgeDegree jd = new JudgeDegree();
				jd.printDegree();
				break;
			case 4:
				MonthToDays md = new MonthToDays();
				md.printDiffer();
				break;
			case 5:
				ParkingManagement pm = new ParkingManagement();
				pm.printTotal();
				break;	
			case 6:
				Getfibonacci gf = new Getfibonacci();
				break;
			case 7:
				printPOT pot = new printPOT();
				break;
			case 8:
				AckermannNumber an = new AckermannNumber();
				break;
			case 9:
				powMethod pow = new powMethod();
				pow.printResult();
				break;	
			case 10:
				GoldenRatio gr= new GoldenRatio();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);}
}
