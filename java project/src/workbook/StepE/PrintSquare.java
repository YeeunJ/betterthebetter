package workbook.StepE;

import java.util.Scanner;

public class PrintSquare {
	int length; // 입력받은 정사각형 한 변의 길이
	int i, j; // 반복문 사용을 위한 변수
	
	public PrintSquare() {
		input();
	}
	public void Square() {
		getSquare();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("정사각형의 크기를 입력하시오.");
		length = s.nextInt();
	}
	
	void getSquare() {
		for(i = 0; i < length; i++) {
			for(j = 0; j < length; j++)
				System.out.printf("#");
			System.out.println();
		}
	}
}
