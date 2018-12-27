package workbook.StepH;

import java.util.Scanner;


public class StepHManager {
	public StepHManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 알아 맞추기\n");
			printf("2. 로또 번호 만들기\n");
			printf("3. 로또 번호 당첨 확인하기\n");
			printf("4. 가위바위보 게임하기\n");
			printf("5. 슬롯머신 만들기\n");
			printf("6. 5개 숫자의 제곱수 조합 구하기\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				guessNumber gn = new guessNumber();
				gn.printNumber();
				break;
			case 2:
				lottoNumber ln = new lottoNumber();
				ln.printLotto();
				break;
			case 3:
				winLottery wl = new winLottery();
				wl.printLotto();
				break;
			case 4:
				RockScissorsPaper rsp = new RockScissorsPaper();
				rsp.printWin();
				break;
			case 5:
				SlotMachine sm = new SlotMachine();
				sm.Result();
				break;
			case 6:
				SquareNumber sn = new SquareNumber();
				sn.printNumber();
				break;
			case 7:
				onebyone obo = new onebyone();
				obo.printText();
				break;
			case 8:
				changeString cs = new changeString();
				cs.printChangeStr();
				break;
			case 9:
				userInfo ui = new userInfo();
				ui.printInfo();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);}
}
