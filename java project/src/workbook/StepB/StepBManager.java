package workbook.StepB;

import java.util.Scanner;

import workbook.StepB.CalculateArea;
import workbook.StepB.ConvertTem;
import workbook.StepB.DayToSecond;
import workbook.StepB.FindRectArea;
import workbook.StepB.GigaToOther;
import workbook.StepB.TotalAndAverage;



public class StepBManager {
	public StepBManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 미성년자 판정\n");
			printf("2. 온도 상호 변환\n");
			printf("3. 직사각형 넓이 계산 및 정사각형 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2:
				ConvertTem ct = new ConvertTem();
				ct.PrintTem();
				break;
			case 3:
				FindRectArea fra = new FindRectArea();
				fra.printArea();
				break;
			case 4:
				CalculateArea ca = new CalculateArea();
				ca.printArea();
				break;
			case 5:
				DayToSecond dts = new DayToSecond();
				dts.printSecond();
				break;
			case 6:
				TotalAndAverage taa = new TotalAndAverage();
				taa.printTA();
				break;
			case 7:
				GigaToOther gto = new GigaToOther();
				gto.printOther();
				break;
			case 8:
				JudgeCondition jc = new JudgeCondition();
				jc.printCondition();
				break;
			case 9:
				JudgeObesity jo = new JudgeObesity ();
				jo.printObesity();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
