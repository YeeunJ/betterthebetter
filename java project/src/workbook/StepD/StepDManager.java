package workbook.StepD;

import java.util.Scanner;



public class StepDManager {
	public StepDManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 1부터 숫자 더하기\n");
			printf("2. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기\n");
			printf("3. 입력 받은 숫자들의 총합계와 평균 값 구하기\n");
			printf("4. 미성년자 숫자 세기\n");
			printf("5. 직사각형 형태 개수 세기\n");
			printf("6. 아파트 평형 계산 및 종류 판정\n");
			printf("7. 1차 메소드의 좌표 구하기\n");
			printf("8. 2차 메소드의 좌표 구하기\n");
			printf("9. 원하는 구구단의 단 출력하기\n");
			printf("10. 두 수의 배타적 배수 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				SumNumber sn = new SumNumber();
				sn.printSum();
				break;
			case 2: 				
				GetMaxMin gmm = new GetMaxMin();
				gmm.printMaxMin();
				break;
			case 3: 				
				TotalAndAverage taa = new TotalAndAverage();
				taa.printTA();
				break;
			case 4: 				
				countMinor cm = new countMinor();
				cm.printMinor();
				break;
			case 5: 				
				countRect cr = new countRect();
				cr.printRect();
				break;
			case 6: 				
				countArea ca = new countArea();
				ca.printArea();
				break;
			case 7: 				
				primaryMethod pm = new primaryMethod();
				pm.printPResult();
				break;
			case 8: 				
				secondaryMethod sm = new secondaryMethod();
				sm.printSResult();
				break;
			case 9: 				
				gugudan ggd = new gugudan();
				ggd.printGugudan();
				break;
			case 10: 				
				findMultiple fm = new findMultiple();
				fm.printMultiple();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
