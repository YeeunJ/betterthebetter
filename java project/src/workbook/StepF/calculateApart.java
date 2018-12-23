package workbook.StepF;

import java.util.Scanner;

public class calculateApart {
	private int number[][] = new int[5][3];
	private int total = 0;
	
	public calculateApart() {
		input();
	}
	public void printTotal() {
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.\n", total);
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//5번 반복
		for(int i = 0; i < 5; i++) {
			//3번 반복
			for(int j = 0; j < 3; j++) {
				//입력받고
				System.out.printf("%d0%d호에 살고 있는 사람의 숫자를 입력하시오.", i+1, j+1);
				number[i][j] = s.nextInt();
				//다 더하기
				total += number[i][j];
			}
		}
	}
}
