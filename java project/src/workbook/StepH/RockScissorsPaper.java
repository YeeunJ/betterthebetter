package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class RockScissorsPaper {
	private int com_finger; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)
	private int my_finger; //사용자가 낸 가위(1), 바위(2), 보(3)
	private int score[][] = new int[2][3];//결과 횟수 리스트 [[컴퓨터의 승, 무, 패], [사용자의 승, 무, 패]]
	private int count;
	private String RSP_name[] = {"가위", "바위", "보", "컴퓨터 승!", "비김~", "사용자 승!"};
	
	public RockScissorsPaper() {
		countWin();
	}
	
	public void printWin() {
		//컴퓨터가 이기고 지고 비긴 횟수
		System.out.printf("컴퓨터 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d 입니다.\n", score[0][0], score[0][2], score[0][1]);
		//사용자가 이기고 지고 비긴 횟수
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d 입니다.\n", score[1][0], score[1][2], score[1][1]);
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		//랜덤으로 가위바위보 만들고
		com_finger = r.nextInt(3)+1;
		//사용자에게 입력받고
		System.out.printf("가위(1), 바위(2), 보(3)를 입력하세요.");
		my_finger = s.nextInt();	
	}
	
	void countWin() {
		//계속 반복
		while(true) {
			//input()
			input();
			//받은게 0이면 종료
			if(my_finger == 0) break;
			//두개가 같거나
			else if(com_finger == my_finger)
				//count = 1
				count = 1;
			//(사용자-컴퓨터+1)%3이 0이거나 0
			else if((my_finger - com_finger+1) % 3 == 0)
				//count =0
				count = 0;
			//둘다 아니거나
			else
				//count = 2
				count = 2;
			//++하고 출력
			score[0][count]++;
			score[1][2-count]++;
			System.out.printf("컴퓨터가 낸 것은 %s입니다. -----> %s\n", RSP_name[com_finger-1], RSP_name[count+3]);
		}
		
	}
}
