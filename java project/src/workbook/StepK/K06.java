package workbook.StepK;

import java.util.Scanner;

public class K06 {
	private int num;
	
	public K06() {
		count();
		inoutput();
	}
	void count() {
		Scanner s = new Scanner(System.in);
		//몇명 할 것인지 입력받고
		System.out.printf("등록할 학생의 명수는?");
		num = s.nextInt();
	}
	void inoutput() {
		UserInfo ui[] = new UserInfo[num];
		//그 수 만큼 입력받아서 출력해주기
		for(int i = 0; i<num; i++) {
			ui[i] = new UserInfo();
			System.out.printf("%d번 ", i+1);
			ui[i].input();
		}
		format();
		for(int i = 0;i<num; i++)
			ui[i].print(i+1);
	}
	
	void format() {
		System.out.println("===========================");
		System.out.println("등록된 학생 목록은 다음과 같습니다.");
		System.out.println("---------------------------");
		System.out.println("번호	아이디		비밀번호");
	}
}
