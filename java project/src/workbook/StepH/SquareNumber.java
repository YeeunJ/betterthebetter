package workbook.StepH;

import java.util.Scanner;

public class SquareNumber {
	private int number[] = new int[5];
	private double pow_value[][] = new double[5][5];
	private double max, min;
	private int max_a, max_b;
	private int min_a, min_b;
	
	public SquareNumber() {
		input();
	}
	
	public void printNumber() {
		//출력
		getSquare();
		System.out.println("입력하신 5개의 제곱수를 만들면...");
		System.out.printf("가장 큰 수는 %d의 %d승인 %.0f입니다.\n", max_a, max_b, max);
		System.out.printf("가장 작은 수는 %d의 %d승인 %.0f입니다.\n", min_a, min_b, min);
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//묻고 5번 반복
		System.out.printf("2에서 9사이의 숫자 5개를 입력하세요.");
		for(int i = 0; i < 5; i++)
			//입력받고
			number[i] = s.nextInt();
		
	}
	
	void getSquare() {
		max = Math.pow(number[0], number[1]);
		min = Math.pow(number[0], number[1]);
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++) {
				if(i == j) {
					continue;
				}
				pow_value[i][j] = Math.pow(number[i], number[j]);
				if(pow_value[i][j] >= max) {
					max = pow_value[i][j];
					max_a = number[i];
					max_b = number[j];
				}
				if(pow_value[i][j] <= min) {
					min = pow_value[i][j];
					min_a = number[i];
					min_b = number[j];
				}
			}
	}
}
