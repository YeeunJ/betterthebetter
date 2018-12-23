package workbook.StepF;

import java.util.Scanner;
public class calculateScore {
	private double score[] = new double[10]; // 심사점수 리스트
	private double maxscore, minscore; 
	private double total;
	private double average;
	
	public calculateScore() {
		input();
	}
	
	public void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n", getScore());
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10개 반복해서 
		for(int i = 0; i< 10; i++) {
			//입력받기
			System.out.printf("%d번 심사점수를 입력하시오.", i+1);
			score[i] = s.nextDouble();
			//첫번째면 max min을 첫번째 수로 하고
			if(i == 0) {
				maxscore = score[i];
				minscore = score[i];
			}
			//아니고 max보다 크면 바꾸고
			else if(score[i] > maxscore)
				maxscore = score[i];
			//아니고 min보다 작으면 바꾸고
			else if(score[i] < minscore)
				minscore = score[i];
			//다 더하기
			total += score[i];
		}
	}
	
	double getScore() {
		//총합에 max min빼고 나누어서 리턴
		average = (total - maxscore-minscore)/8;
		return this.average;
	}
}
