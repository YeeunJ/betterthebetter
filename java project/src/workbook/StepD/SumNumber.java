package workbook.StepD;

import java.util.Scanner;

public class SumNumber {
	private int number; 
	private int totalsum = 0; 
	private int i;
	
	public SumNumber() {
		input();
	}
	
	public void printSum() {
		System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다.\n",getSum());
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자를 입력하시오.");
		number = s.nextInt();
	}
	
	int getSum() {
		for(i = 1; i <= number; i++) {
			totalsum += i;
		}
		
		return this.totalsum;
	}
}