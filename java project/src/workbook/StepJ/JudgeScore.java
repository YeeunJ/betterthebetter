package workbook.StepJ;

import java.util.Scanner;

public class JudgeScore {
	private double score[] = new double[10];
	private double average;
	private double total = 0;
	
	public JudgeScore() {
		input();
	}
	
	public void printScore() {
		average = (total- Max(score)-Min(score))/8.0;
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f입니다.\n", average);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10번 돌리면서 입력받기
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d번 심사점수를 입력하시오.", i+1);
			score[i] = s.nextDouble();
			total += score[i];
		}
	}
	
	double Max(double num[]) {
		double max = num[0];
		//파라미터) num : 숫자 리스트 리턴값) 숫자 리스트에서 가장 큰 값
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max)
				max = num[i];
		}
		return max;
	}
	double Min(double num[]) {
		double min = num[0];
		//파라미터) num : 숫자 리스트 리턴값) 숫자 리스트에서 가장 작은 값
		for(int i = 0; i < num.length; i++) {
			if(num[i] < min)
				min = num[i];
		}
		return min;
	}
}
