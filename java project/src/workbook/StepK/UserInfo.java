package workbook.StepK;

import java.util.Scanner;

public class UserInfo {
	private String id,ps;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("학생의 아이디, 비밀번호를 입력하시오 -->");
		id = s.next();
		ps = s.next();
	}
	
	void print(int index) {
		System.out.printf("%d	%s		%s\n", index, id, ps);
	}
}
