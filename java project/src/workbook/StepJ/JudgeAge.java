package workbook.StepJ;

import java.util.Scanner;

public class JudgeAge {
	private String name[] = {"유아", "어린이", "청소년", "청년", "중년", "노년"};
	private int age;
	private int judge[]=new int[6];
	
	public JudgeAge() {
		input();
	}
	
	public void printJudge() {
		//결과 출력
		for(int i = 0; i< judge.length; i++)
			System.out.printf("%s는 %d명 입니다.\n", name[i], judge[i]);
	}
	void input() {
		int year;
		int num;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//count보다 100보다 작으면 계속 반복
		for(int i = 1; i <= 100; i++) {
			//년도를 입력받고
			System.out.printf("%d번째 사람의 태어난 년도를 입력하시오.", i);
			year = s.nextInt();
			if(year > 2012) break;
			num = AskAge(year);
			judge[num]++;
		}
	}
	
	int AskAge(int birthyear) {
		//나이 계산해서 출력
		age = 2019 - birthyear + 1;
		System.out.printf("나이는 %d 입니다.\n", age);
		//분석하고 리턴
		if(age < 7)
			return 0;
		else if(age < 13)
			return 1;
		else if(age < 20)
			return 2;
		else if(age < 30)
			return 3;
		else if(age < 60)
			return 4;
		else return 5;
	}
}
