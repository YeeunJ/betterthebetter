package workbook.StepC;

import java.util.Scanner;
public class CalculateArea {
	private double m2_area; // 면적 (제곱미터) 
	private double pyung_area; // 면적 (평수)
	public CalculateArea() {
		input();
	}
	public void printArea() {
		getArea();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오.");
		this.m2_area = s.nextDouble();
	}
	
	void getArea() {
		pyung_area = m2_area/3.305;
		
		//아니고 30평 미만 : 중소형
		if(pyung_area < 30)
			System.out.println("중소형 아파트 입니다.");
		//아니고 50평 미만 : 중형
		else if(pyung_area < 50)
			System.out.println("중형 아파트 입니다.");
		//아니면 대형
		else
			System.out.println("대형 아파트 입니다.");
	}
}
