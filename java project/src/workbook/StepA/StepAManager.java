package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산\n");
			printf("2. 온도변환\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			s.close();
			
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
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
