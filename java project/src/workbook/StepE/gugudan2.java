package workbook.StepE;

import java.util.Scanner;

public class gugudan2 {
	private int mode; // 출력모드(1: 홀수단, 2: 짝수단)
	private int i, j; // 반복문 사용을 위한 변수
	private int column;
	
	public gugudan2() {
		input();
	}
	
	public void printGGD2() {
		getGGD();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("구구단의 출력모드(1: 홀수단, 2: 짝수단)를 입력하시오.");
		mode = s.nextInt();
		System.out.printf("한 줄에 출력할 갯수를 입력하시오.");
		column = s.nextInt();
	}
	
	void getGGD() {
		//mode부터 시작해서 9까지 2씩 커지면서 반복
		for(i = mode; i<=9;i+=2) {
			//9번 반복
			for(j = 1; j<=9; j++) {
				//출력
				System.out.printf("%d X %d = %d\t", i, j, i*j);
				//만약 j가 3으로 나누었을때 0이면 \n
				if(j % column == 0)
					System.out.println();
			}
			System.out.println();
		}
	}
}
