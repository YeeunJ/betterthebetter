package workbook.StepF;

import java.util.Scanner;

public class calculateStudent {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double average[] = new double[5];
	
	public calculateStudent() {
		input();
	}
	public void printStudent() {
		for(int i = 0; i < 5; i++)
			System.out.printf("%d번 학생의 총점은 %d 이고, 평균 %.1f 입니다.\n", i+1, sum[i], average[i]);
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//5번 반복
		for(int i = 0; i < 5; i++) {
			//물어보고
			System.out.printf("%d번 학생 국어, 영어, 수학 점수를 입력하시오.", i+1);
			//3번 반복
			for(int j = 0; j < 3; j++) {
				//입력받고
				jumsu[i][j] = s.nextInt();
				//더하고
				sum[i] += jumsu[i][j];
			}
			//평균 내기
			average[i] = (double)sum[i]/3;
		}
	}
}
