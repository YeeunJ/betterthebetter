package workbook.StepA;

import java.util.Scanner;
public class TotalAndAverage {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public TotalAndAverage() {
		input();
	}
	
	public void printTA() {
		System.out.printf("입력하신 점수의 총점은 %d 이고, 평균은 %.1f 입니다.\n", getTotal(), getAverage());
	}
	
	void input() {
		//스캐너 선언
		Scanner s = new Scanner(System.in);
		//각자 묻고 입력받기
		System.out.printf("국어 점수를 입력하세요.");
		this.kor = s.nextInt();
		System.out.printf("영어 점수를 입력하세요.");
		this.eng = s.nextInt();
		System.out.printf("수학 점수를 입력하세요.");
		this.math = s.nextInt();
		s.close();
	}
	
	int getTotal() {
		//계산
		total = kor + eng + math;
		//리턴
		return this.total;
	}
	double getAverage() {
		//계산
		average = total/3.0;
		//리턴
		return this.average;
	}
	
}
