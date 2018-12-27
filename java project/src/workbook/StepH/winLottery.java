package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class winLottery {
	private int lotto_com[] = new int[6]; 
	private int lotto_user[] = new int[6]; 
	private boolean same = true;
	private int count = 0;
	private int match_count = 0;
	
	public winLottery() {
		c_input();
		user_input();
	}
	
	public void printLotto() {
		//6번 반복해서 이번주 로또 번호 출력
		System.out.printf("이번 주의 로또 당첨 번호는 ");
		for(int j = 0; j < lotto_com.length; j++)
			System.out.printf("%d  ", lotto_com[j]);
		System.out.println("입니다.");
		//맞춘 갯수 출력
		System.out.printf("일치하는 로또 번호는 %d개 입니다.\n", printSame());
	}
	//computer로또번호 만들기
	void c_input() {
		count = 0;
		Random r = new Random();
		
		//계속 반복
		while(count < lotto_com.length) {
			//random으로 만들고
			lotto_com[count] = r.nextInt(45) + 1;
			//count보다 작은 만큼 반복
			same = true;
			for(int i = 0; i < count-1; i++) {
				//같으면
				if(lotto_com[count] == lotto_com[i]) {
					//same = false break
					same = false;
					break;
				}
			}
			//만약 same = true 이면
			if(same == true)
				//count++;
				count++;
		}
	}
	//user로또번호 만들기
	void user_input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		count = 0;
		//count가 6이 될때까지 반복
		while(count < lotto_user.length) {
			//입력받고
			System.out.printf("원하는 %d번째 로또 숫자를 입력하세요", count+1);
			lotto_user[count] = s.nextInt();
			if((lotto_user[count] > 45)||(lotto_user[count] < 1))
				same = false;
			//count-1번 반복
			for(int i = 0; i < count; i++) {
				//같은지 비교해서 같으면
				if(lotto_user[count] == lotto_user[i]) {
					//false
					same = false;
					break;
				}
			}
			//same이 false이면
			if(same == false) {
				//잘못입력
				System.out.println("=> 잘못 입력하셨습니다.");
				//다시 true로 바꿔주기
				same = true;
			}
			//same이 true이면
			else
				//count++;
				count++;
		}	
	}
	
	
	//몇개가 같은지 출력
	int printSame() {
		//6번 반복
		for(int i = 0; i < 6; i++)
			//6번 반복
			for(int j = 0; j < 6; j++)
				//같으면 count++
				if(lotto_com[i] == lotto_user[j])
					match_count++;
		
		//리턴 해주기
		return this.match_count;
	}
}
