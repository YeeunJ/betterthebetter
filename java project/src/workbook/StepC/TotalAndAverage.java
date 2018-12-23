package workbook.StepC;

import java.util.Scanner;

public class TotalAndAverage {
	private int kor, eng, math;
	private int total;
	private double average;
	
	public TotalAndAverage() {
		input();
	}
	
	public void printGrade() {
		getGrade();
		System.out.printf("입력하신 점수의 총점은 %d이고,\n평균은 %.1f입니다.\n", total, average);
		//평균 90이상 : 수
		if(average >= 90)
			System.out.println("수 입니다.");
		//평균 80이상 : 우 
		else if(average >= 80)
			System.out.println("우 입니다.");
		//평균 70이상: 미 
		else if(average >= 70)
			System.out.println("미 입니다.");
		//평균 60이상: 양 
		else if(average >= 60)
			System.out.println("양 입니다.");
		//아니면 가
		else
			System.out.println("가 입니다.");
		getGrade();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요");
		kor = s.nextInt();
		System.out.printf("영어 점수를 입력하세요");
		eng = s.nextInt();
		System.out.printf("수학 점수를 입력하세요");
		math = s.nextInt();
	}
	
	void getGrade() {
		//총점 계산
		this.total = kor + eng + math;
		//평균 계산
		this.average = total/3;
		
	}
}
