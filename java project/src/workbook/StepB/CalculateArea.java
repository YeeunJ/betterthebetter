package workbook.StepB;

import java.util.Scanner;

public class CalculateArea {

	private double m2_area; // 면적 (제곱미터)
	private double pyung_area; // 면적 (평수)
	
	public CalculateArea() {
		input();
	}
	public void printArea() {
		//만약 30평 미만이면 작은 아파트
		if(pyung_area < 30)
			System.out.printf("아파트의 평형은 %.1f 이고,\n30평 미만이므로 작은 아파트입니다.\n", getArea());
		//아니면 큰 아파트
		else
			System.out.printf("아파트의 평형은 %.1f 이고,\n30평 이상이므로 큰 아파트입니다.\n", getArea());
	}
	
	void input() {
		//스캐너 선언하고
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//묻고
		System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오.");
		//입력받고
		this.m2_area = s.nextDouble();
	}
	
	double getArea() {
		//계산하고
		pyung_area = m2_area/3.305;
		//리턴
		return this.pyung_area;
	}
}
