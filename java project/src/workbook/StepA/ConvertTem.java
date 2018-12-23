package workbook.StepA;

import java.util.Scanner;

public class ConvertTem {
	private double c_degree; //섭씨 온도
	private double f_degree; //화씨 온도
	//먼저 입력받고 계산하는 함수
	public ConvertTem() {
		input();
	}
	//그 다음에 출력하는 함수
	public void PrintTem() {
		//출력
		System.out.printf("화씨 온도는 %.1f도 입니다.\n", getFdegree());
	}
	
	void input() {
		//먼저scanner 선언하고
		Scanner s = new Scanner(System.in);
		//묻고
		System.out.printf("섭씨 온도를 입력하시오.");
		//입력받고
		this.c_degree =s.nextDouble();
		s.close();
	}

	double getFdegree() {
		//계산하고
		f_degree = c_degree * 1.8 + 32;
		//화씨온도 리턴
		return this.f_degree;
	}
}

