package workbook.StepD;

import java.util.Scanner;

public class countMinor {
	private int count_all;
	private int count_young; 
	private int birth_year; 
	private int age;
	private int i;
	
	public countMinor() {
		input();
	}
	
	public void printMinor() {
		System.out.printf("가족들 중에 미성년자는 모두 %d명입니다.\n", count_young);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//몇명인지 입력받고
		System.out.printf("가족이 몇 명인지 입력하세요");
		count_all = s.nextInt();
		//그만큼 반복해서 
		for(i = 0; i < count_all; i++) {
			//태어난 년도 입력받고
			System.out.printf("태어난 년도를 입력하세요");
			birth_year = s.nextInt();
			//나이 계산해서 20세 미만이면++
			age = 2018 - birth_year + 1;
			if(age < 20)
				count_young++;
			
		}
	}
}
