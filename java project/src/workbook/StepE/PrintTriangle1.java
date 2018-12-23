package workbook.StepE;

import java.util.Scanner;

public class PrintTriangle1 {
	private int height; 
	private int blank, star; 
	private int i, j;
	
	public PrintTriangle1() {
		input();
	}
	
	public void Triangle1() {
		getTriangle();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		height = s.nextInt();
		blank = s.nextInt();
	}
	
	void getTriangle() {
		//blank += height - 1, star = 1
		blank += height - 1;
		star = 1;
		for(i = 0; i < height;i++) {
			//blank만큼 반복하고 찍기
			for(j = 0 ;j < blank; j++)
				System.out.printf(" ");
			//star만큼 반복하고 찍기
			for(j = 0 ;j < star; j++)
				System.out.printf("*");
			//\n
			System.out.printf("\n");
			//blank--, star++
			blank--;
			star++;
		}
	}
}
