package workbook.StepC;

import java.util.Scanner;
public class MaxMin {
	int num1, num2, num3; // 첫 번째 숫자, 두 번째 숫자, 세 번째 숫자 
	int max_num, min_num;
	
	public MaxMin() {
		input();
	}
	
	public void printMaxMin() {
		getMaxMin();
		System.out.printf("가장 큰 수는 %d이고, 가장 작은 수는 %d 입니다.\n", max_num, min_num);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하세요");
		this.num1 = s.nextInt();
		System.out.printf("두번째 숫자를 입력하세요");
		this.num2 = s.nextInt();
		System.out.printf("세번째 숫자를 입력하세요");
		this.num3 = s.nextInt();
	}
	
	void getMaxMin() {
		//1,2비교
		//1이 크면
		if(num1 > num2) {
			//3이 1보다 크면
			if(num3>num1) {
				//3이 가장 크고 2가 가장 작고
				max_num = num3;
				min_num = num2;
			}
			//아니면
			else {
				//1이 최고
				max_num = num1;
				//2가 3보다 크면
				if(num2>num3)
					// 3이 최소
					min_num = num3;
				//아니면 2가 최소
				else
					min_num = num2;
			}
		}
		else {
		//2가 크면
			//3이 2보다 크면
			if(num3>num2) {
				//3이 가장 크고 1이 가장 작고
				max_num = num3;
				min_num = num1;
			}
			//아니면
			else {
				//2이 최고
				max_num = num2;
				//1이 3보다 크면
				if(num1>num3)
					// 3이 최소
					min_num = num3;
				//아니면 1이 최소
				else
					min_num = num1;
			}
		}
	}
}
