package workbook.StepA;

import java.util.Scanner;

public class FindRectArea {
	private int width; // 가로크기
	private int height; // 세로크기
	private int area; // 직사각형의 넓이
	
	public FindRectArea() {
		input();
	}
	public void printArea() {
		System.out.printf("직사각형의 넓이는 %d입니다.\n", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하시오.");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하시오.");
		this.height = s.nextInt();
		s.close();
	}
	
	int getArea() {
		area = width * height;
		return this.area;
	}
}
