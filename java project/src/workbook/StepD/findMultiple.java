package workbook.StepD;

import java.util.Scanner;
public class findMultiple {
	int num1, num2; // 입력받은 두 수
	int i; // 반복문을 위한 변수
	int flag = 0;
	
	public findMultiple() {
		input();
	}
	public void printMultiple() {
		findResult();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("2개의 숫자를 입력하시오.");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}
	
	void findResult() {
		for(i = 1; i <= 100; i++) {
			if((i%num1 == 0)&&(i%num2 == 0));
			else if ((i%num1 == 0)||(i%num2 == 0)) {
				if(flag == 0) {
					flag = 1;
					System.out.printf("%d", i);
				}
				else {
					System.out.printf(", %d", i);
				}
			}
			
		}
		System.out.println();
	}
}
