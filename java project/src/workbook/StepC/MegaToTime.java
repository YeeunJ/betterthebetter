package workbook.StepC;

import java.util.Scanner;

public class MegaToTime {
	private int megabytes; 
	private long bytes; 
	private byte kind; 
	private double time;
	
	public MegaToTime() {
		input();
	}
	
	public void printTime() {
		getTime();
		if(time == 0)
			System.out.println("잘 못 입력했습니다.");
		else
			System.out.printf("파일 전송 시간은 %.1f 초입니다.\n", getTime());
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요");
		this.megabytes = s.nextInt();
		
		System.out.printf("전송 방식을 1 : Wi-Fi, 2 : BluTooth, 3 : LTE, 4 : USB 에서 선택하여 입력하세요");
		this.kind = s.nextByte();
	}
	
	double getTime() {
		//바이트 수 = 메가바이트 수 * 1024 * 1024
		bytes = megabytes * 1024 * 1024;
		//만약 Wi-Fi이면 전송 속도 = 1,500,000바이트 / 초 
		if(kind == 1)
				time = bytes/1500000.0;
		//아니고 Bluetooth면 전송 속도 = 300,000바이트 / 초 
		else if(kind == 2)
			time = bytes/300000.0;
		//아니고 LTE면 전송 속도 = 1,000,000바이트 / 초 
		else if(kind == 3)
			time = bytes/1000000.0;
		//아니면 전송 속도 = 60,000,000바이트 / 초
		else if(kind == 4)
			time = bytes/60000000.0;
		else
			time = 0;
		
		return this.time;
	}
}
