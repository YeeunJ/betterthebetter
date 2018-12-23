package workbook.StepB;

import java.util.Scanner;

public class ConvertTem {
	private double input_degree; 
	private String kind;
	private double output_degree;
	
	//먼저 입력받고 계산하는 함수
	public ConvertTem() {
		input();
	}
	//그 다음에 출력하는 함수
	public void PrintTem() {
		//출력
		System.out.printf("변환된 온도는 %.1f입니다.\n", getDegree());
	}
	
	void input() {
		//먼저scanner 선언하고
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//묻고
		System.out.printf("온도를 입력하세요.");
		//입력받고
		this.input_degree =s.nextDouble();
		System.out.printf("입력하신 온도가 섭씨온도라면 C 를, 화씨 온도라면 F를 입력하세요 ");
		this.kind = s.next();
	}
	
	double getDegree() {
		//섭씨면 화씨를 계산하고 출력
		if(kind.equalsIgnoreCase("C")) {
			output_degree = input_degree * 1.8 + 32;
		}
		//화씨면 섭씨를 계산하고 출력
		else if(kind.equalsIgnoreCase("F")) {
			output_degree = (input_degree -32) / 1.8;
		}
		return this.output_degree;
	}
}
