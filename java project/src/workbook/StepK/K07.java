package workbook.StepK;

import java.util.Scanner;

public class K07 {
	private int num;
	public K07() {
		count();
		inout();
	}
	
	void count() {
		Scanner s = new Scanner(System.in);
		System.out.printf("등록할 학생의 명수는?");
		num = s.nextInt();
	}
	
	
	void inout() {
		Student st[] = new Student[num];
		for(int i = 0; i<num; i++) {
			st[i] = new Student();
			System.out.printf("%d번 ", i+1);
			st[i].input();
		}
		format();
		for(int i = 0; i<num; i++) 
			st[i].print(i+1);
	}
	
	void format() {
		System.out.println("===========================");
		System.out.printf("등록된 %d명의 학생 목록은 다음과 같습니다.\n", num);
		System.out.println("---------------------------");
		System.out.println("번호	국어	영어	수학	총점	평균	학점");
	}
}
