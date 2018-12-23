package workbook.StepD;

import java.util.Scanner;

public class gugudan {
	int dan; // 출력하려는 구구단의 단 수
	int i;
	
	public gugudan() {
		input();
	}
	
	public void printGugudan() {
		getGugudan();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속반복
		while(true) {
			//입력받고 값이 2~9이면 나가기
			System.out.printf("출력하고 싶은 구구단의 단 수를 입력하시오(2~9).");
			dan = s.nextInt();
			if((dan >= 2)&&(dan <= 9))
				break;
			else
				System.out.println("잘못 입력하였습니다.");
		}
	}
	
	void getGugudan() {
		for(i = 1; i <= 9; i++)
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
	}
}
