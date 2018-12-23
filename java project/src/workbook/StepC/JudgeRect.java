package workbook.StepC;

import java.util.Scanner;

public class JudgeRect {
	private int width, height;
	public JudgeRect() {
		input();
	}
	
	public void printRect() {
		getTem();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하시오.");
		width = s.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하시오.");
		height = s.nextInt();
	}
	
	void getTem() {
		//가로 크기가 세로크기의 2배 이상 : "좌우로 길쭉한 직사각형입니다." 
		if(width >= height*2)
			System.out.println("좌우로 길쭉한 직사각형입니다.");
		//가로 크기가 세로크기보다 크면 : "일반적인 가로형 직사각형입니다" 
		else if(width > height)
			System.out.println("일반적인 가로형 직사각형입니다");
		//가로 크기와 세로크기가 동일 : "정사각형입니다."
		else if(width == height)
			System.out.println("정사각형입니다.");
		//세로 크기가 가로크기의 2배 이상 : "위아래로 길쭉한 직사각형입니다." 
		else if(height >= width *2)
			System.out.println("위아래로 길쭉한 직사각형입니다.");
		//세로 크기가 가로크기보다 크면 : "일반적인 세로형 직사각형입니다"
		else
			System.out.println("일반적인 세로형 직사각형입니다");
	}
}
