package workbook.StepB;

import java.util.Scanner;

public class GigaToOther {
	private int megabytes;
	private long bytes; 
	private String usb2; 
	private long time;
	
	public GigaToOther() {
		input();
	}
	public void printOther() {
		System.out.printf("파일 전송 시간은 %d 초 입니다.\n", getTime());
	}
	void input() {
		@SuppressWarnings("resource")
		//스캐너를 선언하고
		Scanner s = new Scanner(System.in);
		//두 개 다 입력받고
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요");
		this.megabytes = s.nextInt();
		System.out.printf("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요");
		this.usb2 = s.next();
	}
	long getTime() {
		//바이트로 고치고
		bytes = megabytes * 1024 * 1024;
		//만약 Y라면 
		if(usb2.equalsIgnoreCase("Y")) {
			//USB 2.0 전송 속도 = 60,000,000바이트 / 초
			time = bytes / 60000000;
		}
		//아니면 N이라면 
		else if(usb2.equalsIgnoreCase("N")) {
			//USB 1.1 전송 속도 = 1,500,000바이트 / 초
			time = bytes / 60000000;
		}
		return this.time;	
	}
	
	
}
