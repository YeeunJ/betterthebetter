package workbook.StepC;

import java.util.Scanner;

public class YearToAge {
	private int birth_year; // 태어난 년도 
	private int age; // 나이
	
	public YearToAge() {
		input();
	}
	
	public void printAge() {
		getAge();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 연도를 입력하세요");
		this.birth_year = s.nextInt();
		
	}
	
	void getAge() {
		age = 2018 - birth_year + 1;
		
		//7세 미만 : 유아,
		if(age < 7)
			System.out.println("유아입니다.");
		//아니고 13세미만 : 어린이, 
		else if(age < 13)
			System.out.println("어린이입니다.");
		//아니고 20세 미만 : 청소년
		else if(age < 20)
			System.out.println("청소년입니다.");
		//아니고 30세 미만 : 청년
		else if(age < 30)
			System.out.println("청년입니다.");
		//아니고 60세 미만 : 중년
		else if(age < 60)
			System.out.println("중년입니다.");
		//아니면 노년
		else
			System.out.println("노년입니다.");
	}
}
