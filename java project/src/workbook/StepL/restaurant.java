package workbook.StepL;

import java.util.*;
import java.text.SimpleDateFormat;

public class restaurant {
	private int plate[] = new int[3];
	private String card, date;
	private int guest, t_costs;
	private int total = 0;
	private int cost[] = {25000, 15000, 17000};
	
	restaurant(int g, int p1, int p2, int p3, String c, int t, String d){
		this.guest = g;
		this.plate[0] = p1;
		this.plate[1] = p2;
		this.plate[2] = p3;
		this.card = c;
		this.date = d;
		this.t_costs = t;
	}
	ArrayList<restaurant> rt = new ArrayList<restaurant>();
	
	public restaurant() {
		ask();
	}
	
	void ask() {
		int menu = 0;
		//묻고
		while(menu != 4) {
			Scanner s = new Scanner(System.in);
			System.out.println("----------------------------------------------------------------------");
			System.out.printf("1)주문 2)결제 3)리스트 4)종료 ==> ");
			menu = s.nextInt();
			System.out.println("----------------------------------------------------------------------");
			//반복하면서 기능 수행하고
			switch(menu) {
			case 1:
				order();
				break;
			case 2:
				pay();
				break;
			case 3:
				list();
				break;
			case 4:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
		
	}
	
	//주문
	void order() {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat t = new SimpleDateFormat("YYYY년 M월 dd일 kk:mm", Locale.KOREA);
		//손님수 입력받고
		System.out.printf("손님 수를 입력하세요 :");
		guest = s.nextInt();
		//먹을 음식 수 입력받고
		System.out.printf("스테이크, 스파게티, 파스타의 개수를 입력하세요 :");
		total = 0;
		for(int i =0; i < plate.length; i++) {
			plate[i] = s.nextInt();
			total += plate[i]*cost[i];
		}
		//멤버쉽 카드 입력받고
		System.out.printf("멤버쉽 카드가 있습니까?(Y:있음)");
		card = s.next();
		//시간 정하고 출력
		date = t.format(new Date());
		System.out.printf("들어오신 시간은 %s입니다.\n", date);
		System.out.printf("총 금액은 %d 원입니다.\n", cal_cost());
		rt.add(new restaurant(guest, plate[0], plate[1], plate[2], card, t_costs, date));
	}
	//결제
	void pay() {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("번호	손님수	스테이크	스파게티	파스타	멤버쉽	결제금액	입장시간");
		for(int i = 0; i <rt.size(); i++)
			System.out.printf("[%d]	%d	%d	%d	%d	%s	%s	%s\n", i+1, rt.get(i).guest, rt.get(i).plate[0], rt.get(i).plate[1], rt.get(i).plate[2], rt.get(i).card, rt.get(i).t_costs, rt.get(i).date);
		System.out.printf("==> 결제하실 번호를 입력하세요 :");
		num = s.nextInt();
		rt.remove(num-1);
		System.out.println("==> 결제완료되었습니다.");
	}
	//리스트
	void list() {
		System.out.println("번호	손님수	스테이크	스파게티	파스타	멤버쉽	입장시간");
		for(int i = 0; i <rt.size(); i++)
			System.out.printf("[%d]	%d	%d	%d	%d	%s	%s\n", i+1, rt.get(i).guest, rt.get(i).plate[0], rt.get(i).plate[1], rt.get(i).plate[2], rt.get(i).card, rt.get(i).date);
	}
	
	int cal_cost() {
		if(card.equalsIgnoreCase("Y"))
			t_costs = total*90/100;
		else
			t_costs = total;
		if(t_costs >= 100000)
			t_costs = t_costs*11/10;
		else
			t_costs = t_costs*107/100;
		t_costs = t_costs*11/10;
		return this.t_costs;
	}
}
