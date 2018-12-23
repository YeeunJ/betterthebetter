package workbook.StepC;

import java.util.Scanner;

public class JudgeTem {
	private double input_degree;
	
	public JudgeTem() {
		input();
	}
	
	public void printTem() {
		getTem();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("물의 온도를 입력하세요");
		this.input_degree = s.nextDouble();
	}
	
	void getTem() {
		//음수값 (0미만) : 잘못입력
		if(input_degree < 0)
			System.out.println("잘못입력하셨습니다.");
		//아니고 25도 미만 : 냉수
		else if(input_degree < 25)
			System.out.println("냉수입니다.");
		//아니고 40도 미만 : 미온수
		else if(input_degree < 40)
			System.out.println("미온수입니다.");
		//아니고 80도 미만 : 온수
		else if(input_degree < 80)
			System.out.println("온수입니다.");
		//아니면 끓는 물
		else
			System.out.println("끓는물입니다.");
	}
}
