package workbook.StepK;


public class K03 {
	private int quadrant[] = {0,0,0,0};
	private int place;
	
	public K03() {
		input();
		output();
	}
	
	void input() {
		point p = new point();
		place = p.input();
		if(place != 0)
			quadrant[place-1]++;
		System.out.println("====================================");
		System.out.printf("1번째 ");
		p.output();
	}
	
	void output() {
		for(int i = 0; i<4; i++)
			System.out.printf("%d사분면의 좌표는 모두 %d개입니다.\n", i+1, quadrant[i]);
	}
}
