package MC.UI;

import java.util.List;
import java.util.Scanner;

import MC.Service.MCService;
import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.HappyMealVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.ShoppingBasketVO;
import MC.VO.SnacksAndSideVO;

public class MCUI {
	// Scanner ���� ����� sc
	Scanner sc = new Scanner(System.in);
	// MCService ���� ����� mcs
	MCService mcs = new MCService();

	public MCUI() {
		while (true) {
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
				HappyMeal();
				break;
			case "6":
				shopping_basket();
				break;
			case "7":
				order();
				break;
			case "0":
				mcs.cancel();
				break;
			case "1972":
				administrateMenu();
				System.out.print("> �޴��� ������ �ּ��� : ");
				firstChoice = sc.nextLine();
				Administrate(firstChoice);
			}
		}
	}

	private void Administrate(String firstChoice) {
		String adminchoice;
		switch (firstChoice) {
		case "1":
			addmenu();
			System.out.print("> �޴��� ������ �ּ��� : ");
			adminchoice = sc.nextLine();
			addmenu(adminchoice);
			break;
		case "2":
			updatemenu();
			adminchoice = sc.nextLine();
			updatemenu(adminchoice);
			break;
		case "3":
			deletemenu();
			adminchoice = sc.nextLine();
			deletemenu(adminchoice);
			break;
		case "4":
			systemMacmorning();
			adminchoice = sc.nextLine();
			systemMacmoring(adminchoice);
			break;
		case "5":
			System.out.println("**������ ��带 �����մϴ�.");
			return;
		}

	}

	private void systemMacmoring(String adminchoice) {
		// TODO Auto-generated method stub

	}

	private void deletemenu(String adminchoice) {
		// TODO Auto-generated method stub

	}

	private void updatemenu(String adminchoice) {
		// TODO Auto-generated method stub

	}

	public void addmenu(String adminchoice) {
		HamburgerVO hvo = null;
		DessertVO dvo = null;
		SnacksAndSideVO sasvo = null;
		DrinkVO dkvo = null;
		SauceVO sacvo = null;
		String hamburger_name, Drink_name, Sauce_name, snacksandside_name, Dessert_name;
		int price;
		int setprice;
		int ssize;
		switch (adminchoice) {
		case "1":
			System.out.println("====Hamburger Menu====");
			System.out.print("> ��ǰ���� �Է��ϼ��� : ");
			hamburger_name = sc.nextLine();
			System.out.print("> ��ǰ������ �Է��ϼ��� : ");
			price = sc.nextInt();
			sc.nextLine();
			System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
			setprice = sc.nextInt();
			sc.nextLine();
			System.out.println("> ����� ���ÿ� ");
			System.out.println("1) S   2) M   3) L ");
			ssize = sc.nextInt();
			sc.nextLine();
			hvo.setHamburger_name(hamburger_name);
			hvo.setPrice(price);
			hvo.setSetprice(setprice);
			hvo.setSsize(ssize);
			mcs.HamburgerAdd(hamburger_name);
			break;
		case "2":
			System.out.println("====Dessert Menu====");
			System.out.print("> ��ǰ���� �Է��ϼ��� : ");
			Dessert_name = sc.nextLine();
			System.out.print("> ��ǰ������ �Է��ϼ��� : ");
			price = sc.nextInt();
			sc.nextLine();
			System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
			setprice = sc.nextInt();
			sc.nextLine();
			System.out.println("> ����� ���ÿ� ");
			System.out.println("1) S   2) M   3) L ");
			ssize = sc.nextInt();
			sc.nextLine();
			dvo.setDessert_name(Dessert_name);
			dvo.setPrice(price);
			dvo.setSetprice(setprice);
			dvo.setSsize(ssize);
			mcs.DessertAdd(Dessert_name);
			break;
		case "3":
			System.out.println("====SnacksAndSide Menu====");
			System.out.print("> ��ǰ���� �Է��ϼ��� : ");
			snacksandside_name = sc.nextLine();
			System.out.print("> ��ǰ������ �Է��ϼ��� : ");
			price = sc.nextInt();
			sc.nextLine();
			System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
			setprice = sc.nextInt();
			sc.nextLine();
			System.out.println("> ����� ���ÿ� ");
			System.out.println("1) S   2) M   3) L ");
			ssize = sc.nextInt();
			sc.nextLine();
			sasvo.setSnacksandside_name(snacksandside_name);
			sasvo.setPrice(price);
			sasvo.setSetprice(setprice);
			sasvo.setSsize(ssize);
			mcs.SnacksAndSideAdd(snacksandside_name);
			break;
		case "4":
			System.out.println("====Drink Menu====");
			System.out.print("> ��ǰ���� �Է��ϼ��� : ");
			Drink_name = sc.nextLine();
			System.out.print("> ��ǰ������ �Է��ϼ��� : ");
			price = sc.nextInt();
			sc.nextLine();
			System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
			setprice = sc.nextInt();
			sc.nextLine();
			System.out.println("> ����� ���ÿ� ");
			System.out.println("1) S   2) M   3) L ");
			ssize = sc.nextInt();
			sc.nextLine();
			dkvo.setDrink_name(Drink_name);
			dkvo.setPrice(price);
			dkvo.setSetprice(setprice);
			dkvo.setSsize(ssize);
			mcs.DrinkAdd(Drink_name);
			break;
		case "5":
			System.out.println("====Sauce Menu====");
			System.out.print("> ��ǰ���� �Է��ϼ��� : ");
			Sauce_name = sc.nextLine();
			System.out.print("> ��ǰ������ �Է��ϼ��� : ");
			price = sc.nextInt();
			sc.nextLine();
			System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
			setprice = sc.nextInt();
			sc.nextLine();
			System.out.println("> ����� ���ÿ� ");
			System.out.println("1) S   2) M   3) L ");
			ssize = sc.nextInt();
			sc.nextLine();
			sacvo.setSauce_name(Sauce_name);
			sacvo.setPrice(price);
			sacvo.setSetprice(setprice);
			sacvo.setSsize(ssize);
			mcs.SauceAdd(Sauce_name);
			break;
		case "6":
			return;

		}
	}

	private void systemMacmorning() {

	}

	private void deletemenu() {
		System.out.print("==========Delete==========");
		System.out.print("1. Hamburger Menu");
		System.out.print("2. Dessert Menu");
		System.out.print("3. SnacksAndSide Menu");
		System.out.print("4. Drink Menu");
		System.out.print("5. Sauce Menu");
		System.out.print("6. DeleteMode Exit");
	}

	private void updatemenu() {
		System.out.print("==========Update==========");
		System.out.print("1. Hamburger Menu");
		System.out.print("2. Dessert Menu");
		System.out.print("3. SnacksAndSide Menu");
		System.out.print("4. Drink Menu");
		System.out.print("5. Sauce Menu");
		System.out.print("6. UpdateMode Exit");
	}

	private void addmenu() {
		System.out.print("==========Add==========");
		System.out.print("1. Hamburger Menu");
		System.out.print("2. Dessert Menu");
		System.out.print("3. SnacksAndSide Menu");
		System.out.print("4. Drink Menu");
		System.out.print("5. Sauce Menu");
		System.out.print("6. AddMode Exit");

	}

	private void administrateMenu() {
		System.out.print("========AdministrateMode========");
		System.out.print("1. Menu Add");
		System.out.print("2. Menu Update");
		System.out.print("3. Menu Delete");
		System.out.print("4. System Macmornig");
		System.out.print("5. AdministrateMode Exit");
	}

	private void order() {

	}

	private void shopping_basket() {
		List<ShoppingBasketVO> slist = mcs.shopping_basket();
		for (ShoppingBasketVO sbVO : slist) {
			System.out.println(sbVO.kioskOutPut());
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
		System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, pickSnacksAndSide, SnacksAndSideCnt));
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
		System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, pickDessert, DessertCnt));
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
		System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, pickDrink, DrinkCnt));
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

			System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, hvo, setCnt));
			return;
		case "2":
			BugerSet(hvo, size);
			return;
		default:
			return;
		}

	}

	public SetVO BugerSet(HamburgerVO Hamburger, String str) {
		System.out.println(Hamburger.getHamburger_name() + "��Ʈ");

		SnacksAndSideVO ssvo = selectSnacksAndSide(str);
		DrinkVO dvo = selectDrink(str);

		SetVO setVO = new SetVO(Hamburger, ssvo, dvo);
		System.out.print("���� : ");
		int setNum = Integer.parseInt(sc.nextLine());

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
		int shoppingNum = Integer.parseInt(sc.nextLine());

		System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, setVO, setNum));
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
				System.out.println(sNum++ + "." + svo.setOutPut());
			}

			System.out.print("���̵� ���� : ");
			pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
			pickSnacksAndSide = sMlist.get(pickSnacksAndSideNum - 1);
			break;

		case "l":
			List<SnacksAndSideVO> sLlist = mcs.getMSnaksandSides();
			for (SnacksAndSideVO svo : sLlist) {
				System.out.println(sNum++ + "." + svo.setOutPut());
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
				System.out.println(dNum++ + "." + svo.setOutPut());
			}

			System.out.print("�帵ũ ���� : ");
			pickDrinkNum = Integer.parseInt(sc.nextLine());
			pickDrink = dMlist.get(pickDrinkNum - 1);
			break;

		case "l":
			List<DrinkVO> dLlist = mcs.getLDrink();
			for (DrinkVO svo : dLlist) {
				System.out.println(dNum++ + "." + svo.setOutPut());
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

	private HappyMealVO HappyMeal() {
		HappyMealVO HappyMeal = null;
		String HappyMealChoice = null;
		DrinkVO pickDrink = null;
		SauceVO pickSauce = null;
		SnacksAndSideVO pickSnacksAndSide = null;
		int dNum = 1, sNum = 1, cNum = 1, HappyMealCnt = 1, shoppingNum;
		;
		int pickDrinkNum, pickSauceNum, pickSnacksAndSideNum;
		List<SnacksAndSideVO> saslist = mcs.getMSnaksandSides();
		List<SnacksAndSideVO> sslist = mcs.getSSnaksandSides();
		List<DrinkVO> dSlist = mcs.getSDrink();
		List<HamburgerVO> hlist = mcs.getHamburger();
		System.out.println("==========HappyMeal==========");
		System.out.println("1. ���ǹ� ��ʰ� 4����" + " " + "5100��");
		System.out.println("2. ���ǹ� ġ�����" + " " + "5100��");
		System.out.println("3. ���ǹ� �ܹ���" + " " + "5100��");
		System.out.println("4. ���ǹ� �Ұ�����" + " " + "5100��");
		System.out.print("> �޴��� ������ �ּ��� : ");
		HappyMealChoice = sc.nextLine();
		while (true) {
			switch (HappyMealChoice) {
			case "1":

				for (DrinkVO svo : dSlist) {
					System.out.println(dNum++ + "." + svo.setOutPut());
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dSlist.get(pickDrinkNum - 1);
				List<SauceVO> slist = mcs.getSauce();
				for (SauceVO sacucevo : slist) {
					System.out.println(sNum++ + "." + sacucevo);
				}
				System.out.print("�ҽ� ���� : ");
				pickSauceNum = Integer.parseInt(sc.nextLine());
				pickSauce = slist.get(pickSauceNum - 1);
				System.out.print("���ǹ� ���� ���� : ���ǹ� ���� ����");
				System.out.println();
				HappyMeal = new HappyMealVO(saslist.get(4), pickDrink, pickSauce, "���ǹ� ���� ����", 5100);
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());
				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal, HappyMealCnt));
				return HappyMeal;
			case "2":
				for (DrinkVO svo : dSlist) {
					System.out.println(dNum++ + "." + svo.setOutPut());
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dSlist.get(pickDrinkNum - 1);
				for (SnacksAndSideVO ssvo : saslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("���̵� ���� : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide = saslist.get(pickSnacksAndSideNum - 1);
				System.out.print("���ǹ����� ���� : ���ǹ� ���� ����");
				HappyMeal = new HappyMealVO(hlist.get(16), pickSnacksAndSide, pickDrink, "���ǹ� ���� ����", 5100);
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());
				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal, HappyMealCnt));
				return HappyMeal;
			case "3":
				for (DrinkVO svo : dSlist) {
					System.out.println(dNum++ + "." + svo.setOutPut());
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dSlist.get(pickDrinkNum - 1);
				for (SnacksAndSideVO ssvo : saslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("�ҽ� ���� : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide = saslist.get(pickSnacksAndSideNum - 1);
				System.out.print("���ǹ����� ���� : ���ǹ� ���� ����");
				HappyMeal = new HappyMealVO(hlist.get(16), pickSnacksAndSide, pickDrink, "���ǹ� ���� ����", 5100);
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());
				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal, HappyMealCnt));
				return HappyMeal;
			case "4":
				for (DrinkVO svo : dSlist) {
					System.out.println(dNum++ + "." + svo.setOutPut());
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dSlist.get(pickDrinkNum - 1);
				for (SnacksAndSideVO ssvo : saslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("�ҽ� ���� : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide = saslist.get(pickSnacksAndSideNum - 1);
				System.out.print("���ǹ����� ���� : ���ǹ� ���� ����");
				HappyMeal = new HappyMealVO(hlist.get(11), pickSnacksAndSide, pickDrink, "���ǹ� ���� ����", 5100);
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());
				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				System.out.println(mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal, HappyMealCnt));
				return HappyMeal;

			}
		}

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
