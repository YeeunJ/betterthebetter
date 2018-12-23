package workbook.StepB;

import java.util.Scanner;

public class JudgeObesity {
	private int height, weight; // 신장(cm), 체중(kg)
	private float bmi; // 비만도 수치
	
	public JudgeObesity() {
		input();
	}
	public void printObesity() {
		getObesity();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("신장(cm단위)을 입력하세요");
		height = s.nextInt();
		System.out.printf("체중(kg단위)을 입력하세요");
		weight= s.nextInt();
	}
	void getObesity() {
		this.bmi = weight / (((float)height/100)*((float)height/100));
		//만약 비만도 수치가 25이상인 경우에 "비만"
				if(bmi >= 25)
					System.out.printf("당신은 비만이십니다.%f\n", bmi);
				//아니면 아님
				else
					System.out.printf("당신은 비만이 아니군요.%f\n", bmi);
	}
}
