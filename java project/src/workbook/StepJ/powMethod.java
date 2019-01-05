package workbook.StepJ;

import java.util.Scanner;

public class powMethod {
	int num[] = new int[2];
	public powMethod() {
		input();
	}
	
	public void printResult() {
		System.out.printf("%d의 %d승은 %d 입니다.\n", num[0], num[1], power(num[0], num[1]));
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자 2개를 입력하시오.");
		for(int i = 0; i < 2; i++)
			num[i] = s.nextInt();
	}
	
	int power( int num1, int num2 ) {
		if(num2 == 0) 
			return 1;
		else if(num2 == 1) 
			return num1;
		else if((num2 > 1)&&(num2%2 == 0)) 
			return power(num1,num2/2) * power(num1,num2/2);
		else
			return power(num1,num2/2) * power(num1,num2/2) * num1;
	}
}
