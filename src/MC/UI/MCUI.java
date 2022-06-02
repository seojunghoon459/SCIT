package MC.UI;

import java.util.List;
import java.util.Scanner;

import MC.Service.MCService;
import MC.VO.HamburgerVO;

public class MCUI {
	// Scanner 변수 예약어 sc
	Scanner sc = new Scanner(System.in);
	// MCService 변수 예약어 mcs
	MCService mcs = new MCService();

	public MCUI() {
		menu();
		System.out.print("> 메뉴를 선택해 주세요 : ");
		String firstChoice = sc.nextLine();

		switch (firstChoice) {
		case "1":
			HamburgerMenu();
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

	private void HamburgerMenu() {
		List<HamburgerVO> hlist = mcs.getHamburger();
		int HamburgerNum = 1;
		for (HamburgerVO hvo : hlist) {
			System.out.println(HamburgerNum + " " + hvo);
		}

		System.out.print("버거를 선택해주세요 (숫자) >. ");
		String pickburger = sc.nextLine();

		HamburgerVO hvo = hlist.get(HamburgerNum);

		System.out.println("1.단품 \t2.세트");
		String setTF = sc.nextLine();

		int setCnt = 1;

		if (setTF.equals("1")) {
			System.out.println("수량을 입력하세요");

			setCnt = Integer.parseInt(sc.nextLine());

		}

		String size = "m";
		if (setTF.equals("2")) {
			System.out.println("미디엄(M) / 라지(L)");
			size = sc.nextLine().toLowerCase();

			if (size.equals("미디엄"))
				size = "m";
			if (size.equals("라지"))
				size = "l";
		}

		switch (setTF) {
		case "1":
			mcs.shopping_basket(hvo, setCnt);
			break;
		case "2":
			mcs.BugerSet(hvo, size);
			break;
		default:
			return;
		}

	}

	public void menu() {
		System.out.println("==========MCdonalds==========");
		System.out.println("	  1 > 햄  버  거");
		System.out.println("	  2 > 스낵&사이드");
		System.out.println("	  3 > 디  저  트");
		System.out.println("	  4 > 음      료");
		System.out.println("	  5 > 해  피  밀");
		System.out.println("	  6 > 장 바 구 니");
		System.out.println("	  7 > 주 문 하 기");
		System.out.println("	  0 > 취      소");
		System.out.println("=============================");
	}

}
