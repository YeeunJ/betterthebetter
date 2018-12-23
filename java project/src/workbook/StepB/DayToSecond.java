package workbook.StepB;

import java.util.Scanner;

public class DayToSecond {

	private int days; // 날 수
	private int seconds; // 초 단위 시간
	private int m_count;
	public DayToSecond() {
		input();
	}
	public void printSecond() {
		System.out.printf("날 수에 해당되는 시간은 모두 %d초입니다.\n", getSecond());
		//만약 초를 100만초보다 크다면 몇 번 들어갔는지 출력하기
		if(seconds > 1000000) {
			m_count = seconds / 1000000;
			System.out.printf("100만 초가 모두 %d 번이나 포함됩니다.\n", m_count);
		}
	}
	
	void input() {
		//스캐너 선언
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//묻고
		System.out.printf("날 수를 입력하세요.");
		//입력받기
		this.days = s.nextInt();
	}
	
	int getSecond() {
		//계산
		seconds = days * 24 * 60 * 60;
		//리턴
		return this.seconds;
	}
}
