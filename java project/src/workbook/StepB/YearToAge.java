package workbook.StepB;

import java.util.Scanner;

public class YearToAge {
	private int year;
	private int age;
	
	public YearToAge(){
		input();
	}
	public void printAge() {
		System.out.printf("당신의 나이는 %d살 입니다.\n", getAge());
		JudgeMinor();
	}	
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도는?");
		this.year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - year + 1;
		return this.age;
	}
	void JudgeMinor() {
		//20보다 작으면 미성년자
		if(this.age < 20) {
			System.out.printf("미성년자입니다.\n");
		}
		//아니면 미성년자 아님
		else {
			System.out.printf("미성년자가 아닙니다.\n");
		}
	}
}
