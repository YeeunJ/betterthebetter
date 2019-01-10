package workbook.StepG;

import java.util.Scanner;
public class judgeAge {
	private int birth_year; // 입력받은 태어난 년도
	private int age[] = new int[10];
	// 각 사람들의 나이 (최대 100명)
	private int count[] = new int[6];
	private String name[] = {"유아", "어린이", "청소년", "청년", "중년", "노년"};
	
	public judgeAge() {
		input();
	}
	public void printAge() {
		int i;
		//10번 반복
		for(i = 0; i < 10; i++)
			//출력
			System.out.printf("%d번째 사람의 나이는 %d 입니다.\n",i+1, age[i]);
		//6번 반복
		for(i = 0; i < 6; i++)
			//출력
			System.out.printf("%s는 %d명 입니다.\n",name[i], count[i]);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//10번 반복
		for(int i = 0; i < 10; i++) {
			//입력받기
			System.out.printf("%d번째 사람의 태어난 년도를 입력하시오.",i+1);
			birth_year = s.nextInt();
			age[i] = 2018 - birth_year + 1;
			//7세 미만 : 유아
			if(age[i] < 7)
				count[0]++;
			//아니고 13세미만 : 어린이
			else if(age[i] < 13)
				count[1]++;
			//아니고 20세 미만 : 청소년,
			else if(age[i] < 20)
				count[2]++;
			//아니고 30세 미만 : 청년
			else if(age[i] < 30)
				count[3]++;
			//아니고 60세 미만 : 중년
			else if(age[i] < 60)
				count[4]++;
			//아니면 노년
			else
				count[5]++;
		}
	}
}
