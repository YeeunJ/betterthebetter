package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class guessNumber {
	private int answer;
	private int number_try; 
	private int count = 0;
	
	public guessNumber() {
		input();
	}
	
	public void printNumber() {
		System.out.printf("%d번 만에 숫자를 맞추셨습니다.\n", count);
	}
	
	void input() {
		Random r = new Random();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//랜덤으로 수 정하고
		answer = r.nextInt(100) + 1;
		//계속 반복
		while(true) {
			//입력받기
			System.out.printf("1부터 100까지의 숫자 하나를 맞춰보세요");
			number_try = s.nextInt();
			//count++;
			count++;
			//같으면 빠져나가고
			if(answer == number_try) break;
			//아닌데 더 크면 크다고 말하고
			else if(answer > number_try)
				System.out.println("좀 더 큰 수입니다.");
			//아니고 더 작으면 작다고 말하기
			else if(answer < number_try)
				System.out.println("좀 더 작은 수입니다.");
		}
	}
}
