package workbook.StepH;

import java.util.Scanner;

public class changeString {
	private String input; 
	private String findStr; 
	private String replaceStr;
	
	changeString() {
		input();
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true)  {
			System.out.println("===========================================");
			System.out.println("=> 문자열을 입력하세요 (x: 종료) : ");
			input = s.nextLine();
			if(input.equalsIgnoreCase("X")) break;
			System.out.printf("=> 찾을 문자열을 입력하세요 : ");
			findStr = s.next();
			System.out.printf("=> 바꿀 문자열을 입력하세요 : ");
			replaceStr = s.next();
			s.nextLine();
			
			System.out.printf("=> 총 %d번 바뀌었습니다.", fix());
			//모두 바꾸기
			System.out.printf("=> %s\n\n", input);
		}
	}
	
	int fix() {
		int count = 0;
		String list[] = input.split(" ");
		for(int i = 0; i < list.length; i++)
			if(list[i].equals(findStr))
				count++;
		input = input.replace(findStr, replaceStr);
		return count;
	}
}
