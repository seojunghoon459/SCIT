package MC.UI;

import java.util.Scanner;

import DC.Service.MCService;

public class MCUI {
	// Scanner 변수 예약어 sc
	Scanner sc = new Scanner(System.in);
	// MCService 변수 예약어 mcs
	MCService mcs = new MCService();

	public MCUI() {
		menu();
		System.out.print(">메뉴를 선택해 주세요 : ");
		String firstChoice = sc.nextLine();

		switch (firstChoice) {
		case "1":
			mcs.pickHamburge();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;
		case "7":
			break;
		case "0":
			break;
		}
	}

	public void menu() {
		System.out.println("==========MCdonalds==========");
		System.out.println("	  1 > 햄  버  거");
		System.out.println("	  2 > 스낵&사이드");
		System.out.println("	  3 > 디  저  트");
		System.out.println("	  4 > 음	 	 료");
		System.out.println("	  5 > 해  피  밀");
		System.out.println("	  6 > 장 바 구 니");
		System.out.println("	  7 > 주 문 하 기");
		System.out.println("	  0 > 취		 소");
		System.out.println("=============================");
	}

}
