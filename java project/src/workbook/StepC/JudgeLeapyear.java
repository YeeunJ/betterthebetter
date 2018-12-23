package workbook.StepC;

import java.util.Scanner;
public class JudgeLeapyear {
	private int year;
	
	public JudgeLeapyear() {
		input();
	}
	public void printLeapyear() {
		getLeapyear();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("년도를 입력하세요");
		this.year = s.nextInt();
	}
	
	void getLeapyear() {
		//400으로 나누어떨어지는 년도는 윤년이다.
		if(year % 400 == 0)
			System.out.println("입력하신 년도는 윤년입니다.");
		//아니고 100으로 나누어떨어지는 년도는 윤년아님
		else if(year % 100 == 0)
			System.out.println("입력하신 년도는 윤년이 아닙니다.");
		//아니고 4로 나누어떨어지는 경우에 윤년이다.
		else if(year % 4 == 0)
			System.out.println("입력하신 년도는 윤년입니다.");
		//아니면 윤년 아님
		else
			System.out.println("입력하신 년도는 윤년이 아닙니다.");
	}
}
