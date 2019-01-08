package workbook.StepK;

public class K05 {
	public K05() {
		UserInfo ui = new UserInfo();
		ui.input();
		format();
		ui.print(1);

	}
	
	void format() {
		System.out.println("===========================");
		System.out.println("등록된 학생 목록은 다음과 같습니다.");
		System.out.println("---------------------------");
		System.out.println("번호	아이디		비밀번호");
	}
}
