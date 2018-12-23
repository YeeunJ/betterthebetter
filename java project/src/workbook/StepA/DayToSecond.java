package workbook.StepA;

import java.util.Scanner;
public class DayToSecond {
	
	private int days; // 날 수
	private int seconds; // 초 단위 시간
	
	public DayToSecond() {
		input();
	}
	public void printSecond() {
		System.out.printf("날 수에 해당되는 시간은 모두 %d초입니다.\n", getSecond());
	}
	
	void input() {
		//스캐너 선언
		Scanner s = new Scanner(System.in);
		//묻고
		System.out.printf("날 수를 입력하세요.");
		//입력받기
		this.days = s.nextInt();
		s.close();
	}
	
	int getSecond() {
		//계산
		seconds = days * 24 * 60 * 60;
		//리턴
		return this.seconds;
	}
}
