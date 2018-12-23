package workbook.StepD;

import java.util.Scanner;

public class countRect {
	private int width, height; 
	private int count1;
	private int count2;
	private int count3;
	private int count4; 
	private int count5;
	// 가로크기, 세로크기
	// "정사각형"의 개수
	// "좌우로 길쭉한 직사각형"의 개수 // "위아래로 길쭉한 직사각형"의 개수 // "일반적인 가로형 직사각형"의 개수 // "일반적인 세로형 직사각형"의 개수
	
	public countRect() {
		input();
	}
	public void printRect() {
		System.out.printf("\"정사각형\"의 개수는 %d 입니다.\n",count1);
		System.out.printf("\"좌우로 길쭉한 직사각형\"의 개수는 %d 입니다.\n",count2);
		System.out.printf("\"위아래로 길쭉한 직사각형\"의 개수는 %d 입니다.\n",count3);
		System.out.printf("\"일반적인 가로형 직사각형\"의 개수는 %d 입니다.\n",count4);
		System.out.printf("\"일반적인 세로형 직사각형\"의 개수는 %d 입니다.\n",count5);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("직사각형의 가로크기와 세로크기를 입력하시오.");
			width = s.nextInt();
			height = s.nextInt();
			if((width <= 0)||(height <= 0))
				break;
			//가로 크기가 세로크기의 2배 이상 : "좌우로 길쭉한 직사각형입니다." 
			if(width >= height*2)
				count2++;
			//가로 크기가 세로크기보다 크면 : "일반적인 가로형 직사각형입니다" 
			else if(width > height)
				count4++;
			//가로 크기와 세로크기가 동일 : "정사각형입니다."
			else if(width == height)
				count1++;
			//세로 크기가 가로크기의 2배 이상 : "위아래로 길쭉한 직사각형입니다." 
			else if(height >= width *2)
				count3++;
			//세로 크기가 가로크기보다 크면 : "일반적인 세로형 직사각형입니다"
			else
				count5++;
		}
	}
}
