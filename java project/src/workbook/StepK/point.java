package workbook.StepK;

import java.util.Scanner;
public class point {
	private double x, y;
	private int place;
	
	int input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("좌표의 X,Y 값을 입력하시오 --> ");
		x = s.nextDouble();
		y = s.nextDouble();
		place = get_area(x,y);
		return place;
	}
	
	int get_area(double x, double y) {
		if((x > 0)&&(y > 0)) return 1;
		else if((x < 0)&&(y > 0)) return 2;
		else if((x < 0)&&(y < 0)) return 3;
		else if((x > 0)&&(y < 0)) return 4;
		else return 0;
	}
	
	void output() {
		System.out.printf("좌표는 %d사분면에 위치합니다.\n", place);
	}
}
