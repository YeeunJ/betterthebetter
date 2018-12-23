package workbook.StepC;

import java.util.Scanner;



public class StepCManager {
	public StepCManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 직사각형 형태 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 연중 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 3개의 수 중 최댓값과 최솟값 구하기\n");
			printf("9. 소득세 계산\n");
			printf("10. 간단한 사칙연산 계산기\n");
			printf("11. 윤년 판정하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2:
				JudgeTem jt = new JudgeTem();
				jt.printTem();
				break;
			case 3:
				JudgeRect jr = new JudgeRect();
				jr.printRect();
				break;
			case 4:
				CalculateArea ca = new CalculateArea();
				ca.printArea();
				break;
			case 5:
				MonthToDay mtd = new MonthToDay();
				mtd.printDay();
				break;
			case 6:
				TotalAndAverage taa = new TotalAndAverage();
				taa.printGrade();
				break;
			case 7:
				MegaToTime mtt = new MegaToTime();
				mtt.printTime();
				break;
			case 8:
				MaxMin mm = new MaxMin();
				mm.printMaxMin();
				break;
			case 9:
				JudgeIncometax jit = new JudgeIncometax ();
				jit.printTax();
				break;
			case 10:
				Calculator ccl = new Calculator ();
				ccl.printResult();
				break;
			case 11:
				JudgeLeapyear jly = new JudgeLeapyear ();
				jly.printLeapyear();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
