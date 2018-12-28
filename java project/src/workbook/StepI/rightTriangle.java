package workbook.StepI;

import java.util.Scanner;

public class rightTriangle {
	private int blank;
	private int height;
	private char c;
	private int c_size;
	
	public rightTriangle() {
		input();
	}
	
	public void printChar() {
		getChar();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//사용할 문자, 빈칸 높이 입력받기
		System.out.printf("직각 삼각형을 그리는데 사용할 문자를 입력하시오.");
		c = s.next().charAt(0);
		System.out.printf("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		height = s.nextInt();
		blank = s.nextInt();
	}
	
	void getChar() {
		//빈칸은 빈칸 + 높이 - 1
		blank += height - 1;
		c_size = 1;
		//높이 만큼 반복
		for(int i = 0; i < height; i++) {
			//빈칸, 문자 출력 함수
			PrintCharWithBlank(blank, c_size, c);
			//빈칸은--, 문자는++
			blank--;
			c_size++;
		}
	}
	
	void PrintCharWithBlank(int blanks, int size, char ch) {
		for(int i = 0; i < blank;i++)
			System.out.printf(" ");
		for(int i = 0; i < size; i++)
			System.out.printf("%c", ch);
		System.out.println();
	}
}
