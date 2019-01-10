package workbook.StepM;

import java.io.IOException;
import java.util.Scanner;

public class StepMManager {
	public StepMManager() throws IOException {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기(파일 저장 기능 추가)\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				MenuPan mp = new MenuPan();
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);}
}
