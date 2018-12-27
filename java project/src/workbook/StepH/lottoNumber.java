package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class lottoNumber {
	private int lotto[] = new int[6];
	private String onemore;
	private boolean same;
	
	public lottoNumber() {
		input();
	}
	
	public void printLotto() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			//로또 출력
			System.out.printf("생성된 로또 번호는 ");
			for(int j = 0; j < lotto.length; j++)
				System.out.printf("%d  ", lotto[j]);
			System.out.println("입니다.");
			//더 할건지 물어보고 받고
			System.out.printf("더 만드시겠습니까? (Y/N)");
			onemore = s.next();
			//n이면 break
			if(onemore.equalsIgnoreCase("N")) break;
			//y이면 다시
			else if(onemore.equalsIgnoreCase("Y")) 
				input();
		}
	}
	void input() {
		int count = 0;
		Random r = new Random();
		
		//계속 반복
		while(count < lotto.length) {
			//random으로 만들고
			lotto[count] = r.nextInt(45) + 1;
			//count보다 작은 만큼 반복
			same = true;
			for(int i = 0; i < count-1; i++) {
				//같으면
				if(lotto[count] == lotto[i]) {
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
}
