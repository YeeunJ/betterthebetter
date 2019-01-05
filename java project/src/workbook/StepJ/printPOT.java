package workbook.StepJ;

import java.util.Scanner;

public class printPOT {
	int num;
	
	public printPOT() {
		input();
	}
	
	void input(){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("숫자를 입력하시오. (0.종료) : ");
			num = s.nextInt();
			poweroftwo(num);
			if(num == 0) break;
			System.out.printf("2의 %d승은 :%d\n ", num, poweroftwo(num));
		}
	}
	
	int poweroftwo(int n) {
		if(n==0) return 1;
		else return 2 * poweroftwo(n-1);
	}
}
