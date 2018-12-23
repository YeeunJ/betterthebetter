package workbook.StepD;

import java.util.Scanner;

public class secondaryMethod {
	int a, b, c; // 2차 메소드의 계수 a, b, c
	int x_begin, x_end; // x좌표의 시작 값과 끝 값 
	int x, y; // x좌표, y좌표
	
	public secondaryMethod() {
		input();
	}
	
	public void printSResult() {
		getResult();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("2차 함수 y=ax^2+bx+c의 계수 a와 b, c를 입력하시오.");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.printf("x값의 시작 값과 끝 값을 입력하시오.");
		x_begin= s.nextInt();
		x_end = s.nextInt();
	}
	
	void getResult() {
		for(x = x_begin; x <= x_end; x++) {
			y = a*x*x+b*x+c;
			System.out.printf("좌표 (%d, %d)\n", x, y);
		}
	}
}
