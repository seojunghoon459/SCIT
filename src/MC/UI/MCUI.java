package MC.UI;

import java.util.List;
import java.util.Scanner;

import MC.Service.MCService;
import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

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
			SnacksAndSideMenu();
			break;
		case "3":
			DessertMenu();
			break;
		case "4":
			DrinkMenu();
			break;
		case "5":
			mcs.HappyMeal();
			break;
		case "6":
			mcs.shopping_basket();
			break;
		case "7":
			mcs.order();
			break;
		case "0":
			mcs.cancel();
			break;
		}
	}

	private void SnacksAndSideMenu() {
		List<SnacksAndSideVO> slist = mcs.getSnaksandSides();
		int cnt = 1;
		for (SnacksAndSideVO ssvo : slist) {
			System.out.println(cnt++ + "." + ssvo);
		}
		System.out.print("디저트를 선택해 주세요 : ");
		int SnacksAndSideNum = Integer.parseInt(sc.nextLine());

		SnacksAndSideVO pickSnacksAndSide = slist.get(SnacksAndSideNum - 1);

		System.out.print("수량 입력해 주세요 : ");
		int SnacksAndSideCnt = Integer.parseInt(sc.nextLine());

		System.out.print("1.장바구니 / 2.주문하기 : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickSnacksAndSide, SnacksAndSideCnt);
	}

	private void DessertMenu() {
		List<DessertVO> dist = mcs.getDessert();
		int cnt = 1;
		for (DessertVO dvo : dist) {
			System.out.println(cnt++ + "." + dvo);
		}
		System.out.print("디저트를 선택해 주세요 : ");
		int DessertNum = Integer.parseInt(sc.nextLine());

		DessertVO pickDessert = dist.get(DessertNum - 1);

		System.out.print("수량 입력해 주세요 : ");
		int DessertCnt = Integer.parseInt(sc.nextLine());

		System.out.print("1.장바구니 / 2.주문하기 : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickDessert, DessertCnt);

	}

	private void DrinkMenu() {
		List<DrinkVO> dist = mcs.getDrink();
		int cnt = 1;
		for (DrinkVO dvo : dist) {
			System.out.println(cnt++ + "." + dvo);
		}
		System.out.print("디저트를 선택해 주세요 : ");
		int DrinkNum = Integer.parseInt(sc.nextLine());

		DrinkVO pickDrink = dist.get(DrinkNum - 1);

		System.out.print("수량 입력해 주세요 : ");
		int DrinkCnt = Integer.parseInt(sc.nextLine());

		System.out.print("1.장바구니 / 2.주문하기 : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickDrink, DrinkCnt);
	}

	private void HamburgerMenu() {
		List<HamburgerVO> hlist = mcs.getHamburger();
		System.out.println(hlist.size());

		int HamburgerNum = 1;
		for (HamburgerVO hvo : hlist) {
			System.out.println(HamburgerNum++ + "." + hvo);
		}

		System.out.print("버거를 선택해주세요 (숫자) : ");
		int pickburger = Integer.parseInt(sc.nextLine());

		HamburgerVO hvo = hlist.get(pickburger - 1);

		System.out.println("1.단품 \t2.세트");
		String setTF = sc.nextLine();

		int setCnt = 1;

		if (setTF.equals("1")) {
			System.out.print("수량을 입력하세요 : ");
			setCnt = Integer.parseInt(sc.nextLine());
		}

		String size = "m";
		if (setTF.equals("2")) {
			System.out.print("미디엄(M) / 라지(L) : ");
			size = sc.nextLine().toLowerCase();

			if (size.equals("미디엄"))
				size = "m";
			if (size.equals("라지"))
				size = "l";
		}

		switch (setTF) {
		case "1":
			System.out.println("1.장바구니 / 2.주문하기");
			int shoppingNum = Integer.parseInt(sc.nextLine());

			mcs.SDDOrderORHhoppingBasket(shoppingNum, hvo, setCnt);
			break;
		case "2":
			BugerSet(hvo, size);
			break;
		default:
			return;
		}

	}

	public SetVO BugerSet(HamburgerVO Hamburger, String str) {
		System.out.println(Hamburger.getHamburger_name() + "세트");

		SnacksAndSideVO ssvo = selectSnacksAndSide(str);
		DrinkVO dvo = selectDrink(str);

		SetVO setVO = new SetVO(Hamburger, ssvo, dvo);
		System.out.println("수량 : ");
		int setNum = Integer.parseInt(sc.nextLine());

		System.out.println("1.장바구니 / 2.주문하기");
		int shoppingNum = Integer.parseInt(sc.nextLine());

		mcs.SDDOrderORHhoppingBasket(shoppingNum, setVO, setNum);

		return setVO;
	}

	private SnacksAndSideVO selectSnacksAndSide(String str) {
		int sNum = 1;
		int pickSnacksAndSideNum;
		SnacksAndSideVO pickSnacksAndSide = null;

		switch (str) {
		case "m":
			List<SnacksAndSideVO> sMlist = mcs.getMSnaksandSides();
			for (SnacksAndSideVO svo : sMlist) {
				System.out.println(sNum++ + "." + svo);
			}

			System.out.print("사이드 선택 : ");
			pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
			pickSnacksAndSide = sMlist.get(pickSnacksAndSideNum - 1);
			break;

		case "l":
			List<SnacksAndSideVO> sLlist = mcs.getMSnaksandSides();
			for (SnacksAndSideVO svo : sLlist) {
				System.out.println(sNum++ + "." + svo);
			}

			System.out.print("사이드 선택 : ");
			pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
			pickSnacksAndSide = sLlist.get(pickSnacksAndSideNum - 1);
			break;

		default:
			return null;
		}
		return pickSnacksAndSide;
	}

	private DrinkVO selectDrink(String str) {
		int dNum = 1;
		int pickDrinkNum;
		DrinkVO pickDrink = null;

		switch (str) {
		case "m":
			List<DrinkVO> dMlist = mcs.getMDrink();
			for (DrinkVO svo : dMlist) {
				System.out.println(dNum++ + "." + svo);
			}

			System.out.print("드링크 선택 : ");
			pickDrinkNum = Integer.parseInt(sc.nextLine());
			pickDrink = dMlist.get(pickDrinkNum - 1);
			break;

		case "l":
			List<DrinkVO> dLlist = mcs.getLDrink();
			for (DrinkVO svo : dLlist) {
				System.out.println(dNum++ + "." + svo);
			}

			System.out.print("드링크 선택 : ");
			pickDrinkNum = Integer.parseInt(sc.nextLine());
			pickDrink = dLlist.get(pickDrinkNum - 1);
			break;

		default:
			return null;
		}
		return pickDrink;
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
