package workbook.StepA;

import java.util.Scanner;

public class CalculateArea {
	
	private double m2_area; // 면적 (제곱미터)
	private double pyung_area; // 면적 (평수)
	
	public CalculateArea() {
		input();
	}
	public void printArea() {
		System.out.printf("아파트의 평형은 %.1f 입니다.\n", getArea());
	}
	
	void input() {
		//스캐너 선언하고
		Scanner s = new Scanner(System.in);
		//묻고
		System.out.printf("아파트의 분양 면적을 입력하시오.");
		//입력받고
		this.m2_area = s.nextDouble();
		s.close();
	}
	
	double getArea() {
		//계산하고
		pyung_area = m2_area/3.305;
		//리턴
		return this.pyung_area;
	}
}
