package workbook.StepB;

import java.util.Scanner;
	public class FindRectArea {
	private int width; // 가로크기
	private int height; // 세로크기
	private int area; // 직사각형의 넓이
	
	public FindRectArea() {
		input();
	}
	public void printArea() {
		//만약 가로 세로 크기가 같으면 정사각형이라고 말해주고
		if(width == height)
			System.out.printf("직사각형의 넓이는 %d이고\n정사각형입니다.\n", getArea());
		//아니면 정사각형이 아니라고 말해주기
		else
			System.out.printf("직사각형의 넓이는 %d이고\n정사각형이 아닙니다.\n", getArea());
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하시오.");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하시오.");
		this.height = s.nextInt();
	}
	
	int getArea() {
		area = width * height;
		return this.area;
	}
}
