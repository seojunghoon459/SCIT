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
	// Scanner ���� ����� sc
	Scanner sc = new Scanner(System.in);
	// MCService ���� ����� mcs
	MCService mcs = new MCService();

	public MCUI() {
		menu();
		System.out.print("> �޴��� ������ �ּ��� : ");
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
		System.out.print("����Ʈ�� ������ �ּ��� : ");
		int SnacksAndSideNum = Integer.parseInt(sc.nextLine());

		SnacksAndSideVO pickSnacksAndSide = slist.get(SnacksAndSideNum - 1);

		System.out.print("���� �Է��� �ּ��� : ");
		int SnacksAndSideCnt = Integer.parseInt(sc.nextLine());

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ� : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickSnacksAndSide, SnacksAndSideCnt);
	}

	private void DessertMenu() {
		List<DessertVO> dist = mcs.getDessert();
		int cnt = 1;
		for (DessertVO dvo : dist) {
			System.out.println(cnt++ + "." + dvo);
		}
		System.out.print("����Ʈ�� ������ �ּ��� : ");
		int DessertNum = Integer.parseInt(sc.nextLine());

		DessertVO pickDessert = dist.get(DessertNum - 1);

		System.out.print("���� �Է��� �ּ��� : ");
		int DessertCnt = Integer.parseInt(sc.nextLine());

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ� : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickDessert, DessertCnt);

	}

	private void DrinkMenu() {
		List<DrinkVO> dist = mcs.getDrink();
		int cnt = 1;
		for (DrinkVO dvo : dist) {
			System.out.println(cnt++ + "." + dvo);
		}
		System.out.print("����Ʈ�� ������ �ּ��� : ");
		int DrinkNum = Integer.parseInt(sc.nextLine());

		DrinkVO pickDrink = dist.get(DrinkNum - 1);

		System.out.print("���� �Է��� �ּ��� : ");
		int DrinkCnt = Integer.parseInt(sc.nextLine());

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ� : ");
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

		System.out.print("���Ÿ� �������ּ��� (����) : ");
		int pickburger = Integer.parseInt(sc.nextLine());

		HamburgerVO hvo = hlist.get(pickburger - 1);

		System.out.println("1.��ǰ \t2.��Ʈ");
		String setTF = sc.nextLine();

		int setCnt = 1;

		if (setTF.equals("1")) {
			System.out.print("������ �Է��ϼ��� : ");
			setCnt = Integer.parseInt(sc.nextLine());
		}

		String size = "m";
		if (setTF.equals("2")) {
			System.out.print("�̵��(M) / ����(L) : ");
			size = sc.nextLine().toLowerCase();

			if (size.equals("�̵��"))
				size = "m";
			if (size.equals("����"))
				size = "l";
		}

		switch (setTF) {
		case "1":
			System.out.println("1.��ٱ��� / 2.�ֹ��ϱ�");
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
		System.out.println(Hamburger.getHamburger_name() + "��Ʈ");

		SnacksAndSideVO ssvo = selectSnacksAndSide(str);
		DrinkVO dvo = selectDrink(str);

		SetVO setVO = new SetVO(Hamburger, ssvo, dvo);
		System.out.println("���� : ");
		int setNum = Integer.parseInt(sc.nextLine());

		System.out.println("1.��ٱ��� / 2.�ֹ��ϱ�");
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

			System.out.print("���̵� ���� : ");
			pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
			pickSnacksAndSide = sMlist.get(pickSnacksAndSideNum - 1);
			break;

		case "l":
			List<SnacksAndSideVO> sLlist = mcs.getMSnaksandSides();
			for (SnacksAndSideVO svo : sLlist) {
				System.out.println(sNum++ + "." + svo);
			}

			System.out.print("���̵� ���� : ");
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

			System.out.print("�帵ũ ���� : ");
			pickDrinkNum = Integer.parseInt(sc.nextLine());
			pickDrink = dMlist.get(pickDrinkNum - 1);
			break;

		case "l":
			List<DrinkVO> dLlist = mcs.getLDrink();
			for (DrinkVO svo : dLlist) {
				System.out.println(dNum++ + "." + svo);
			}

			System.out.print("�帵ũ ���� : ");
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
		System.out.println("	  1 > ��  ��  ��");
		System.out.println("	  2 > ����&���̵�");
		System.out.println("	  3 > ��  ��  Ʈ");
		System.out.println("	  4 > ��      ��");
		System.out.println("	  5 > ��  ��  ��");
		System.out.println("	  6 > �� �� �� ��");
		System.out.println("	  7 > �� �� �� ��");
		System.out.println("	  0 > ��      ��");
		System.out.println("=============================");
	}

}
