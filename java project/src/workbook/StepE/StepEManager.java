package workbook.StepE;

import java.util.Scanner;


public class StepEManager {
	public StepEManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 입력한 숫자 크기의 정사각형 출력하기\n");
			printf("2. 입력한 숫자 크기의 높이를 갖는 우직각 삼각형 출력하기\n");
			printf("3. 입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
			printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
			printf("5. 홀수단 또는 짝수단의 구구단을 열의 개수를 맞추어 출력하기\n");
			printf("6. 2차원 숫자 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				PrintSquare ps = new PrintSquare();
				ps.Square();
				break;
			case 2: 				
				PrintTriangle1 pt1 = new PrintTriangle1();
				pt1.Triangle1();
				break;
			case 3: 				
				PrintTriangle2 pt2 = new PrintTriangle2();
				pt2.Triangle2();
				break;
			case 4: 				
				gugudan1 ggd1 = new gugudan1();
				ggd1.printGGD1();
				break;
			case 5: 				
				gugudan2 ggd2 = new gugudan2();
				ggd2.printGGD2();
				break;
			case 6: 				
				twoDNumber td = new twoDNumber();
				td.Print2D();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
