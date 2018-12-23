package workbook.StepG;

import java.util.Scanner;

public class calculateScore {
	private int jumsu[][]=new int[5][3];
	private String class_name[] = {"국어", "영어", "수학"};
	private int sum = 0;
	private double average;
	
	public calculateScore() {
		input();
	}
	public void printScore() {
		getScore();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//5번 반복
		for(int i = 0; i < 5; i++) {
			//묻고
			System.out.printf("%d번 학생의 국어, 영어, 수학 점수는?", i+1);
			//3번 반복
			for(int j = 0; j < 3; j++)
				//입력받기
				jumsu[i][j] = s.nextInt();
		}
	}
	
	void getScore() {
		//과목별 출력
		System.out.println("1) 각 과목별 총점과 평균 점수");
		//3번 반복
		for(int j = 0; j< 3; j++) {
			sum = 0;
			//5번 반복
			for(int i = 0; i < 5; i++)
				//더하기
				sum += jumsu[i][j];
			//나누고 출력
			System.out.printf("%s 과목 총점은 %d 평균은 %.1f입니다.\n", class_name[j], sum, (double)sum/5);
		}
		System.out.println();
		//학생별 출력
		System.out.println("1) 각 학생별 총점과 평균 점수");
		//5번 반복
		for(int i = 0; i < 5; i++) {
			//3번 반복
			sum = 0;
			for(int j = 0; j < 3; j++)
				//더하고
				sum += jumsu[i][j];
			//나누고 저장
			average =(double)sum / 3;
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 ", i+1, sum, average);
			//평균 90이상 : A
			if(average >= 90)
				System.out.printf("A\n");
			//아니고 평균 80이상 : B
			else if(average >= 80)
				System.out.printf("B\n");
			//아니고 평균 70이상  : C
			else if(average >= 70)
				System.out.printf("C\n");
			//아니고 평균 60이상 : D
			else if(average >= 60)
				System.out.printf("D\n");
			//아니면 F
			else
				System.out.printf("F\n");
		}
	}
	
}
