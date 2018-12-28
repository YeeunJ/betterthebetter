package workbook.StepI;

import java.util.Scanner;

public class MaxNumber {
	private int number[] = new int[10];
	private int max;
	
	public MaxNumber() {
		input();
	}
	
	public void printMax() {
		System.out.printf("최댓값은 %d입니다.\n", MaxOfTen());
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10번 반복하고
		for(int i = 0; i< number.length; i++) {
			//입력받기
			System.out.printf("%d번 수를 입력하시오.",i+1);
			number[i] = s.nextInt();
		}
	}
	
	int MaxOfTen() {
		for(int i = 0; i< number.length; i++) {
			if(i == 0) max = number[i];
			else if(max < number[i])
				max = number[i];
		}
		return this.max;
	}
}
