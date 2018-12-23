package workbook.StepF;

import java.util.Scanner;

public class calculateSubject {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private String name[] = {"국어", "영어", "수학"};
	public calculateSubject() {
		input();
	}
	public void printSubject() {
		getSubject();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//5번 반복
		for(int i = 0; i < 5; i++) {
			//물어보고
			System.out.printf("%d번 학생 국어, 영어, 수학 점수를 입력하시오.", i+1);
			//3번 반복
			for(int j = 0; j < 3; j++)
				//입력받고
				jumsu[i][j] = s.nextInt();
			//각자 더하고
			for(int j = 0; j < 3; j++)
				sum[j] += jumsu[i][j];
		}
	}
	
	void getSubject() {
		for(int i = 0; i < 3; i++){
			average[i] = (double)sum[i]/5;
			System.out.printf("%s의 총점은 %d이고, 평균 %.1f 입니다.\n", name[i], sum[i], average[i]);
		}
	}
}
