package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
	private int coins; // 사용자의 코인 수. (최초에 입력받음)
	private int number[] = new int[3]; // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트 
	private int g_count = 1;
	private int count = 0;
	private String name[] = {"꽝입니다... 아쉽군요..","숫자 2개 일치... 코인 2개 증정...", "", "숫자 3개 일치... 코인 4개 증정..."};
	public SlotMachine() {
		input();
	}
	
	public void GameOver() {
		Result();
		System.out.println("\n게임 종료!");
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//맨 처음 사용할 코인의 갯수 입력 받기(coin)
		System.out.printf("사용하실 코인의 개수를 입력하세요.");
		coins = s.nextInt();
		
	}
	
	void Result() {
		@SuppressWarnings("unused")
		int dummy;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		//coin이 0이 되기까지 반복
		while(coins > 0) {
			// 아무거나 수를 입력받고
			System.out.printf("게임 %d회 start!!! (아무 숫자나 입력하세요)", g_count);
			dummy = s.nextInt();
			count = 0;
			g_count++;
			coins--;
			//게임 결과
			System.out.printf("게임 결과 : ");
			//number만큼 반복(i)
			for(int i = 0; i< number.length; i++) {
				//랜덤으로 저장 출력
				number[i] = r.nextInt(9) + 1;
				System.out.printf("%d  ", number[i]);
				//i-1만큼 반복
				for(int j = 0; j < i; j++)
					//같으면 count++
					if(number[i] == number[j])
						count++;
			}
			//-->name불러서 출력,count가 0이 아니면 coin에 count+1더하기
			if(count != 0)
				coins += count+1;
			System.out.printf("-->%s\n", name[count]);
			//코인 갯수 출력해주기
			System.out.printf("남아있는 코인은 %d개입니다.\n", coins);
			
		}
	}
}
