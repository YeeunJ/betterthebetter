package workbook.StepE;

import java.util.Scanner;
public class twoDNumber {
	private int rows, columns;
	private int i, j;
	
	public twoDNumber() {
		input();
	}
	
	public void Print2D() {
		get2D();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("출력하려는 행의 크기와 열의 크기를 입력하시오.");
		rows = s.nextInt();
		columns = s.nextInt();
	}
	
	void get2D() {
		for(i = 1; i <= rows; i++) {
			for(j = 1; j <= columns; j++)
				System.out.printf("%4d", i*j);
			System.out.println();
		}
	}
}
