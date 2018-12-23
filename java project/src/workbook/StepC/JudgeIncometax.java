package workbook.StepC;

import java.util.Scanner;

public class JudgeIncometax {
	int income; // 연봉 (원 단위) 
	int tax; // 소득세 (원 단위)
	
	public JudgeIncometax() {
		input();
	}
	public void printTax() {
		System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다.\n", getTax());
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("연봉(원 단위)을 숫자로 입력하세요");
		this.income = s.nextInt();
	}
	int getTax() {
		//연봉 1천만 원 미만 : 연봉의 9.5%
		if(income < 10000000)
			tax = income /1000 * 95;
		//아니고 4천만원미만 : 연봉의 19%
		else if(income < 40000000)
			tax = income /100 * 19;
		//아니고 8천만원미만 : 연봉의 28% 
		else if(income < 80000000)
			tax = income /100 * 28;
		//아니면 연봉의 37%
		else
			tax = income /100 * 37;
		
		return this.tax;
	}
}
