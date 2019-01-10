package workbook.StepL;

import java.util.*;

public class MenuPan {
	private String name, origin;
	private int charge, menu;
	MenuPan(String n, String o, int c){
		this.name = n;
		this.origin = o;
		this.charge = c;
	}
	ArrayList<MenuPan> mi = new ArrayList<MenuPan>();
	
	public MenuPan() {
		ask();
	}
	
	//어떤 기능을 수행할 것인지 묻는 기능(switch써서 해당하는 함수로 가게끔하기, 계속 반복하고 6누르면 종료)
	void ask() {
		Scanner s = new Scanner(System.in);
		while(menu != 6) {
			System.out.printf("1)추가2)수정3)삭제4)리스트5)총개수6)종료 ==>");
			menu = s.nextInt();
			System.out.println("--------------------------------------------");
			switch(menu) {
			case 1:
				add();
				break;
			case 2:
				list();
				change();
				break;
			case 3:
				list();
				remove();
				break;
			case 4:
				list();
				break;
			case 5:
				count();
				break;
			case 6:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
			System.out.println();
			
		}
	}
	//추가
	void add() {
		Scanner s = new Scanner(System.in);
		System.out.printf("메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
		name = s.next();
		origin = s.next();
		charge = s.nextInt();
		mi.add(new MenuPan(name, origin, charge));
		System.out.println("입력되었습니다.");
	}
	//수정
	void change() {
		int c_num;
		Scanner s = new Scanner(System.in);
		System.out.printf("==> 수정할 번호를 입력하세요 : ");
		c_num = s.nextInt();
		System.out.printf("==> 메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
		name = s.next();
		origin = s.next();
		charge = s.nextInt();
		mi.set(c_num-1, new MenuPan(name, origin, charge));
		System.out.println("추가되었습니다.");
	}
	//삭제
	void remove() {
		int r_num;
		Scanner s = new Scanner(System.in);
		System.out.printf("==> 삭제할 번호를 입력하세요 : ");
		r_num = s.nextInt();
		mi.remove(r_num-1);
		System.out.println("삭제되었습니다.");
	}
	//리스트
	void list() {
		System.out.println("메뉴번호	메뉴이름	원산지	1인분가격");
		for(int i = 0; i < mi.size(); i++)
			mi.get(i).print(i+1);
	}
	//총 갯수
	void count() {
		System.out.printf("%d개의 메뉴가 등록되어 있습니다.\n", mi.size());
	}
	
	void print(int i) {
		System.out.printf("%d	%s	%s	%d\n",i,this.name, this.origin, this.charge);
	}
}
