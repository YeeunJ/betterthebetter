package workbook.StepF;

import java.util.Scanner;

public class calculateApart2 {
	private int number[][] = new int[5][3];
	private int total = 0;
	private int floor_total[] = new int[5]; 
	private int line_total[] = new int[3];
	
	public calculateApart2() {
		input();
	}
	public void printTotal2() {
		sum();
		for(int i = 0; i<5;i++) {
			System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다.\n",i+1, floor_total[i]);
		}
		System.out.println();
		for(int j = 0; j < 3; j++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다.\n",j+1, line_total[j]);
		}
		System.out.println();
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
				floor_total[i] += number[i][j];
			}
		}
	}
	
	void sum() {
		//5번 반복
		for(int j = 0; j < 3; j++) {
			//3번 반복
			for(int i = 0; i < 5; i++)
				//3개를 더하기
				line_total[j] += number[i][j];
		}
	}
	
}
