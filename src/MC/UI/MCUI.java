package MC.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MC.Service.MCService;
import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.HappyMealVO;
import MC.VO.KioskVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
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
				Administrate();
			}
		}
	}

	private void order() {
		KioskVO kvo = mcs.ShoppingBasketorder();
		System.out.println("�ֹ���ȣ" + kvo.getKnum() + "\n" + kvo.getKiosk_bill());
	}

	private void Administrate() {
		while (true) {
			administrateMenu();
			System.out.print("> �޴��� ������ �ּ��� : ");
			String adminchoice = sc.nextLine();
			switch (adminchoice) {
			case "1":
				addmenus();
				break;
			case "2":
				updatemenus();
				break;
			case "3":
				deletemenus();
				break;
			case "4":
				System.out.println("**������ ��带 �����մϴ�.");
				return;
			}
		}
	}

	private void deletemenus() {
		List<HamburgerVO> Hamburgerlist = mcs.getHamburger();
		List<SnacksAndSideVO> SnacksAndSidelist = mcs.getSnaksandSides();
		List<DrinkVO> Drinklist = mcs.getDrink();
		List<DessertVO> Dessertlist = mcs.getDessert();
		List<SauceVO> Saucelist = mcs.getSauce();
		int cnt = 0;
		String answer;
		HamburgerVO hvo = null;
		DessertVO dvo = null;
		SnacksAndSideVO sasvo = null;
		DrinkVO dkvo = null;
		SauceVO sacvo = null;
		while (true) {
			updatemenu();
			System.out.print("> �޴��� ������ �ּ��� : ");
			String adminchoice = sc.nextLine();
			switch (adminchoice) {
			case "1":
				System.out.println("====Hamburger Menu====");
				for (HamburgerVO hvos : Hamburgerlist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + hvos);
					else
						System.out.println(cnt++ + "." + hvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickburger = Integer.parseInt(sc.nextLine());
				hvo = Hamburgerlist.get(pickburger - 1);
				if (hvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.println("> ������ �����Ͻðڽ��ϱ�?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">���� �۾��� ����Ͽ����ϴ�");
					return;
				}
				mcs.deleteHamburger(hvo.getHamburger_name());
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				for (DessertVO dvos : Dessertlist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dvos);
					else
						System.out.println(cnt++ + "." + dvos);
				}
				System.out.print("����Ʈ�� �������ּ��� (����) : ");
				int pickDessert = Integer.parseInt(sc.nextLine());
				dvo = Dessertlist.get(pickDessert - 1);
				if (dvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.println("> ������ �����Ͻðڽ��ϱ�?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">���� �۾��� ����Ͽ����ϴ�");
					return;
				}
				mcs.deleteDessert(dvo.getDessert_name());
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				for (SnacksAndSideVO sasvos : SnacksAndSidelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sasvos);
					else
						System.out.println(cnt++ + "." + sasvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickSnacksAndSide = Integer.parseInt(sc.nextLine());

				sasvo = SnacksAndSidelist.get(pickSnacksAndSide - 1);
				if (sasvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.println("> ������ �����Ͻðڽ��ϱ�?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">���� �۾��� ����Ͽ����ϴ�");
					return;
				}
				mcs.deleteSnacksAndSide(sasvo.getSnacksandside_name());
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "4":
				System.out.println("====Drink Menu====");
				for (DrinkVO dkvos : Drinklist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dkvos);
					else
						System.out.println(cnt++ + "." + dkvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickDrink = Integer.parseInt(sc.nextLine());

				dkvo = Drinklist.get(pickDrink - 1);
				if (dkvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.println("> ������ �����Ͻðڽ��ϱ�?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">���� �۾��� ����Ͽ����ϴ�");
					return;
				}
				mcs.deleteDrink(dkvo.getDrink_name());
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				for (SauceVO sacvos : Saucelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sacvos);
					else
						System.out.println(cnt++ + "." + sacvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickSauce = Integer.parseInt(sc.nextLine());

				sacvo = Saucelist.get(pickSauce - 1);
				if (sacvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.println("> ������ �����Ͻðڽ��ϱ�?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">���� �۾��� ����Ͽ����ϴ�");
					return;
				}
				mcs.deleteSauce(sacvo.getSauce_name());
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "6":
				return;
			}
		}

	}

	private void updatemenus() {
		List<HamburgerVO> Hamburgerlist = mcs.getHamburger();
		List<SnacksAndSideVO> SnacksAndSidelist = mcs.getSnaksandSides();
		List<DrinkVO> Drinklist = mcs.getDrink();
		List<DessertVO> Dessertlist = mcs.getDessert();
		List<SauceVO> Saucelist = mcs.getSauce();
		int price;
		int setprice;
		int popularity;
		int reorder;
		int cnt = 0;
		HamburgerVO hvo = null;
		DessertVO dvo = null;
		SnacksAndSideVO sasvo = null;
		DrinkVO dkvo = null;
		SauceVO sacvo = null;
		while (true) {
			updatemenu();
			System.out.print("> �޴��� ������ �ּ��� : ");
			String adminchoice = sc.nextLine();
			switch (adminchoice) {
			case "1":
				System.out.println("====Hamburger Menu====");
				for (HamburgerVO hvos : Hamburgerlist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + hvos);
					else
						System.out.println(cnt++ + "." + hvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickburger = Integer.parseInt(sc.nextLine());

				hvo = Hamburgerlist.get(pickburger - 1);
				if (hvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> �α�޴� ǥ�ø� �Ͻðڽ��ϱ�? 0) ǥ�þ���  1) ǥ��  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> ���ֹ� ǥ�ø� �Ͻðڽ��ϱ�?  0) ǥ�þ���  1) ǥ��  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				hvo.setPrice(price);
				hvo.setSetprice(setprice);
				hvo.setPopularity(popularity);
				hvo.setReorder(reorder);
				mcs.updateHamburger(hvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				for (DessertVO dvos : Dessertlist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dvos);
					else
						System.out.println(cnt++ + "." + dvos);
				}
				System.out.print("����Ʈ�� �������ּ��� (����) : ");
				int pickDessert = Integer.parseInt(sc.nextLine());
				dvo = Dessertlist.get(pickDessert - 1);
				if (dvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> �α�޴� ǥ�ø� �Ͻðڽ��ϱ�? 0) ǥ�þ���  1) ǥ��  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> ���ֹ� ǥ�ø� �Ͻðڽ��ϱ�?  0) ǥ�þ���  1) ǥ��  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				dvo.setPrice(price);
				dvo.setSetprice(setprice);
				dvo.setPopularity(popularity);
				dvo.setReorder(reorder);
				mcs.updateDessert(dvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				for (SnacksAndSideVO sasvos : SnacksAndSidelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sasvos);
					else
						System.out.println(cnt++ + "." + sasvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickSnacksAndSide = Integer.parseInt(sc.nextLine());

				sasvo = SnacksAndSidelist.get(pickSnacksAndSide - 1);
				if (sasvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> �α�޴� ǥ�ø� �Ͻðڽ��ϱ�? 0) ǥ�þ���  1) ǥ��  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> ���ֹ� ǥ�ø� �Ͻðڽ��ϱ�?  0) ǥ�þ���  1) ǥ��  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				sasvo.setPrice(price);
				sasvo.setSetprice(setprice);
				sasvo.setPopularity(popularity);
				sasvo.setReorder(reorder);
				mcs.updateSnacksAndSide(sasvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "4":
				System.out.println("====Drink Menu====");
				for (DrinkVO dkvos : Drinklist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dkvos);
					else
						System.out.println(cnt++ + "." + dkvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickDrink = Integer.parseInt(sc.nextLine());

				dkvo = Drinklist.get(pickDrink - 1);
				if (dkvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> �α�޴� ǥ�ø� �Ͻðڽ��ϱ�? 0) ǥ�þ���  1) ǥ��  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> ���ֹ� ǥ�ø� �Ͻðڽ��ϱ�?  0) ǥ�þ���  1) ǥ��  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				dkvo.setPrice(price);
				dkvo.setSetprice(setprice);
				dkvo.setPopularity(popularity);
				dkvo.setReorder(reorder);
				mcs.updateDrink(dkvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				for (SauceVO sacvos : Saucelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sacvos);
					else
						System.out.println(cnt++ + "." + sacvos);
				}
				System.out.print("���Ÿ� �������ּ��� (����) : ");
				int pickSauce = Integer.parseInt(sc.nextLine());

				sacvo = Saucelist.get(pickSauce - 1);
				if (sacvo == null) {
					System.out.println("> ��ϵ��� ���� ��ǰ�Դϴ�.");
				}
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> �α�޴� ǥ�ø� �Ͻðڽ��ϱ�? 0) ǥ�þ���  1) ǥ��  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> ���ֹ� ǥ�ø� �Ͻðڽ��ϱ�?  0) ǥ�þ���  1) ǥ��  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				sacvo.setPrice(price);
				sacvo.setSetprice(setprice);
				sacvo.setPopularity(popularity);
				sacvo.setReorder(reorder);
				mcs.updateSauce(sacvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "6":
				return;
			}
		}
	}

	public void addmenus() {
		String hamburger_name, Dessert_name, snacksandside_name, Drink_name, Sauce_name;
		int price;
		int setprice;
		int ssize;
		while (true) {
			addmenu();
			System.out.print("> �޴��� ������ �ּ��� : ");
			String adminchoice = sc.nextLine();
			switch (adminchoice) {
			case "1":
				System.out.println("====Hamburger Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				hamburger_name = sc.nextLine();
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				HamburgerVO hvo = new HamburgerVO(hamburger_name, price, setprice);
				mcs.addHamburger(hvo);
				System.out.println("> ��ǰ����� �Ϸ�Ǿ����ϴ�.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				Dessert_name = sc.nextLine();
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				DessertVO dvo = new DessertVO(Dessert_name, price, setprice);
				mcs.addDessert(dvo);
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				snacksandside_name = sc.nextLine();
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				SnacksAndSideVO sasvo = new SnacksAndSideVO(snacksandside_name, price, setprice);
				mcs.addSnacksAndSide(sasvo);
				break;
			case "4":
				System.out.println("====Drink Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				Drink_name = sc.nextLine();
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				System.out.println("> ����� ���ÿ� ");
				System.out.println("1) S   2) M   3) L ");
				ssize = sc.nextInt();
				DrinkVO dkvo = new DrinkVO(Drink_name, price, setprice, ssize);
				mcs.addDrink(dkvo);
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				Sauce_name = sc.nextLine();
				System.out.print("> ��ǰ������ �Է��ϼ��� : ");
				price = sc.nextInt();
				System.out.print("> ��ǰ ��Ʈ������ �Է��ϼ��� : ");
				setprice = sc.nextInt();
				SauceVO sacvo = new SauceVO(Sauce_name, price, setprice);
				mcs.addSauce(sacvo);
				break;
			case "6":
				return;
			}
		}
	}

	private void deletemenu() {
		System.out.println("==========Delete==========");
		System.out.println("1. �ܹ��� ����");
		System.out.println("2. ����Ʈ ����");
		System.out.println("3. �����ػ��̵� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. �ҽ� ����");
		System.out.println("6. ���� �޴� ������");
	}

	private void updatemenu() {
		System.out.println("==========Update==========");
		System.out.println("1. �ܹ��� ����");
		System.out.println("2. ����Ʈ ����");
		System.out.println("3. �����ػ��̵� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. �ҽ� ����");
		System.out.println("6. ���� �޴� ������");
	}

	private void addmenu() {
		System.out.println("==========Add==========");
		System.out.println("1. �ܹ��� �߰�");
		System.out.println("2. ����Ʈ �߰�");
		System.out.println("3. �����ػ��̵� �߰�");
		System.out.println("4. ���� �߰�");
		System.out.println("5. �ҽ� �߰�");
		System.out.println("6. �߰� �޴� ������");

	}

	private void administrateMenu() {
		System.out.println("========AdministrateMode========");
		System.out.println("1. �޴� �߰�");
		System.out.println("2. �޴� ����");
		System.out.println("3. �޴� ����");
		System.out.println("4. �����޴� ������");
	}

	// �����ʿ�
	private void shopping_basket() {
		int totPrice = 0;
		int sbNum = 1;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		int result6 = 0;

		List<HamburgerVO> Hamburgerlist = mcs.getHamburgerlist();
		List<SnacksAndSideVO> SnacksAndSidelist = mcs.getSnacksAndSidelist();
		List<DrinkVO> Drinklist = mcs.getDrinklist();
		List<DessertVO> Dessertlist = mcs.getDessertlist();
		List<SetVO> Setlist = mcs.getSetlist();
		List<HappyMealVO> HappyMeallist = mcs.getHappyMeallist();

		if (Hamburgerlist.size() > 0) {
			for (HamburgerVO vo : Hamburgerlist) {

				System.out.println("[" + sbNum++ + "]" + vo.getHamburger_name());
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "��");

				totPrice += (vo.getPrice() * vo.getCount());
				result1++;
			}
		}
		if (SnacksAndSidelist.size() > 0) {
			for (SnacksAndSideVO vo : SnacksAndSidelist) {

				System.out.println("[" + sbNum++ + "]" + vo.getSnacksandside_name());
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "��");

				totPrice += (vo.getPrice() * vo.getCount());
				result2++;
			}
		}
		if (Drinklist.size() > 0) {
			for (DrinkVO vo : Drinklist) {

				System.out.println("[" + sbNum++ + "]" + vo.getDrink_name());
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "��");

				totPrice += (vo.getPrice() * vo.getCount());
				result3++;
			}
		}

		if (Dessertlist.size() > 0) {
			for (DessertVO vo : Dessertlist) {

				System.out.println("[" + sbNum++ + "]" + vo.getDessert_name());
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "��");

				totPrice += (vo.getPrice() * vo.getCount());
				result4++;
			}
		}

		if (Setlist.size() > 0) {
			for (SetVO vo : Setlist) {

				System.out.println("[" + sbNum++ + "]" + vo.getHamburger().getHamburger_name() + "��Ʈ");
				System.out.println(vo.getSnacksAndSide().getSnacksandside_name() + "," + vo.getDrink().getDrink_name());

				int setPrice = (vo.getHamburger().getPrice() + vo.getSnacksAndSide().getSetprice()
						+ vo.getDrink().getSetprice()) * vo.getCount();

				System.out.println(setPrice + "\t\t\t" + vo.getCount() + "��");

				totPrice += setPrice;
				result5++;
			}
		}

		if (HappyMeallist.size() > 0) {
			for (HappyMealVO vo : HappyMeallist) {

				System.out.print("[" + sbNum++ + "]" + "���ǹ� ");

				if (vo.getHamburger() != null) {
					System.out.println(vo.getHamburger().getHamburger_name());
					System.out.println(vo.getSnacksAndSide2().getSnacksandside_name() + ",���ǹ� ���� ����"
							+ vo.getDrink().getDrink_name());

					int HappyMealPrice = (vo.getHamburger().getPrice() + vo.getDrink().getPrice()) * vo.getCount();

					System.out.println(HappyMealPrice + "\t\t\t" + vo.getCount() + "��");

					totPrice += HappyMealPrice;
					result6++;
				}

				if (vo.getHamburger() == null) {
					System.out.println(vo.getSnacksAndSide().getSnacksandside_name());
					System.out.println(vo.getSnacksAndSide2().getSnacksandside_name() + ","
							+ vo.getSauce().getSauce_name() + ',' + "���ǹ� ���� ����" + vo.getDrink().getDrink_name());

					int HappyMealPrice = (vo.getSnacksAndSide().getPrice() + vo.getSnacksAndSide2().getSetprice()
							+ vo.getSauce().getSetprice() + vo.getDrink().getSetprice()) * vo.getCount();

					System.out.println(HappyMealPrice + "\t\t\t" + vo.getCount() + "��");

					totPrice += HappyMealPrice;
					result6++;
				}

			}
		}

		if (totPrice == 0) {
			System.out.println("��ٱ��Ͽ� ��ǰ�� �����ϴ�.");
			return;
		}

		System.out.println("���� : " + totPrice);

		String shoppingchoice;
		System.out.println("1) ��ǰ���� ���� 2) ��ü��� 3) �ֹ��ϱ� 4) ������");
		System.out.print("> ");
		shoppingchoice = sc.nextLine();
		int changeNum;
		switch (shoppingchoice) {
		case "1":
			System.out.print("�ٲٰ� ������ �޴��� �������ּ��� : ");
			changeNum = sc.nextInt();
			shoppingchange(changeNum, sbNum, result1, result2, result3, result4, result5, result6);
			sc.nextLine();

			break;
		case "2":
			Hamburgerlist.clear();
			SnacksAndSidelist.clear();
			Drinklist.clear();
			Dessertlist.clear();
			Setlist.clear();
			HappyMeallist.clear();
			System.out.println("��ü ��� �Ǿ����ϴ�.");
			break;
		case "3":
			order();
			break;
		case "4":
			return;
		}
	}

	private void shoppingchange(int changeNum, int sbNum, int result1, int result2, int result3, int result4,
			int result5, int result6) {
		List<HamburgerVO> Hamburgerlist = mcs.getHamburgerlist();
		List<SnacksAndSideVO> SnacksAndSidelist = mcs.getSnacksAndSidelist();
		List<DrinkVO> Drinklist = mcs.getDrinklist();
		List<DessertVO> Dessertlist = mcs.getDessertlist();
		List<SetVO> Setlist = mcs.getSetlist();
		List<HappyMealVO> HappyMeallist = mcs.getHappyMeallist();
		int cNum = 0;
		if (changeNum <= sbNum) {
			if (changeNum <= result1) {
				changeNum = result1 - 1;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				Hamburgerlist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 <= result2) {
				changeNum = (changeNum - result1) - result2 - 1;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				SnacksAndSidelist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 <= result3) {
				changeNum = (changeNum - result1 - result2) - result3 - 1;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				Drinklist.get(changeNum).setCount(cNum);
				return;
			}

			if (changeNum - result1 - result2 - result3 <= result4) {
				changeNum = (changeNum - result1 - result2 - result3) - result4 - 1;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				System.out.println(Setlist.get(changeNum - 1));
				Dessertlist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 <= result5) {
				changeNum = (changeNum - result1 - result2 - result3 - result4) - result5 - 1;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				Setlist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 - result5 <= result6) {
				changeNum = (changeNum - result1 - result2 - result3 - result4 - result5) - result6 - 1;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				HappyMeallist.get(changeNum).setCount(cNum);
				return;

			}
		}
		sc.nextLine();
	}

	private void SnacksAndSideMenu() {
		List<SnacksAndSideVO> slist = mcs.getSnaksandSides();
		int cnt = 1;
		for (SnacksAndSideVO svo : slist) {
			if (cnt < 10)
				System.out.println("0" + "" + cnt++ + "." + svo);
			else
				System.out.println(cnt++ + "." + svo);
		}
		System.out.print("�����ػ��̵带 ������ �ּ��� : ");

		int SnacksAndSideNum = Integer.parseInt(sc.nextLine());

		SnacksAndSideVO pickSnacksAndSide = slist.get(SnacksAndSideNum - 1);

		System.out.print("���� �Է��� �ּ��� : ");
		int SnacksAndSideCnt = Integer.parseInt(sc.nextLine());

		pickSnacksAndSide.setCount(SnacksAndSideCnt);

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ� : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickSnacksAndSide);
	}

	private void DessertMenu() {
		List<DessertVO> dist = mcs.getDessert();
		int cnt = 1;
		for (DessertVO dvo : dist) {
			if (cnt < 10)
				System.out.println("0" + "" + cnt++ + "." + dvo);
			else
				System.out.println(cnt++ + "." + dvo);
		}

		System.out.print("����Ʈ�� ������ �ּ��� : ");
		int DessertNum = Integer.parseInt(sc.nextLine());

		DessertVO pickDessert = dist.get(DessertNum - 1);

		System.out.print("���� �Է��� �ּ��� : ");
		int DessertCnt = Integer.parseInt(sc.nextLine());

		pickDessert.setCount(DessertCnt);

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ� : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickDessert);
	}

	private void DrinkMenu() {
		List<DrinkVO> dist = mcs.getDrink();
		int cnt = 1;
		for (DrinkVO dvo : dist) {
			if (cnt < 10)
				System.out.println("0" + "" + cnt++ + "." + dvo);
			else
				System.out.println(cnt++ + "." + dvo);
		}
		System.out.print("���Ḧ ������ �ּ��� : ");
		int DrinkNum = Integer.parseInt(sc.nextLine());

		DrinkVO pickDrink = dist.get(DrinkNum - 1);

		System.out.print("���� �Է��� �ּ��� : ");
		int DrinkCnt = Integer.parseInt(sc.nextLine());

		pickDrink.setCount(DrinkCnt);

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ� : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());
		mcs.SDDOrderORHhoppingBasket(shoppingNum, pickDrink);
	}

	private void HamburgerMenu() {
		List<HamburgerVO> hlist = mcs.getHamburger();

		int cnt = 1;
		for (HamburgerVO hvo : hlist) {
			if (cnt < 10)
				System.out.println("0" + "" + cnt++ + "." + hvo);
			else
				System.out.println(cnt++ + "." + hvo);
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

			hvo.setCount(setCnt);
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

			mcs.SDDOrderORHhoppingBasket(shoppingNum, hvo);
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

		setVO.setCount(setNum);

		System.out.print("1.��ٱ��� / 2.�ֹ��ϱ� : ");
		int shoppingNum = Integer.parseInt(sc.nextLine());

		mcs.SDDOrderORHhoppingBasket(shoppingNum, setVO);
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

	private void HappyMeal() {
		HappyMealVO HappyMeal = null;
		String HappyMealChoice = null;
		HamburgerVO Hamburger = null;
		DrinkVO pickDrink = null;
		SauceVO pickSauce = null;
		SnacksAndSideVO pickSnacksAndSide = null;
		SnacksAndSideVO pickSnacksAndSide2 = null;
		int dNum = 1, sNum = 1, cNum = 1, HappyMealCnt = 1, shoppingNum;
		int pickDrinkNum, pickSauceNum, pickSnacksAndSideNum;
		List<SnacksAndSideVO> sslist = mcs.gethappySnaksandSides();
		List<DrinkVO> dslist = mcs.getSDrink();
		List<HamburgerVO> hlist = mcs.getHamburger();
		System.out.println("==========HappyMeal==========");
		System.out.println("1. ���ǹ� ��ʰ� 4����  5100��");
		System.out.println("2. ���ǹ� ġ�����      5100��");
		System.out.println("3. ���ǹ� �ܹ���       5100��");
		System.out.println("4. ���ǹ� �Ұ�����    5100��");
		System.out.print("> �޴��� ������ �ּ��� : ");
		HappyMealChoice = sc.nextLine();
		while (true) {
			switch (HappyMealChoice) {
			case "1":
				String tmp = "��ʰ� 4����";
				pickSnacksAndSide = mcs.oneSnacksAndSide(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("���̵� ���� : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);
				List<SauceVO> slist = mcs.getSauce();
				for (SauceVO sacucevo : slist) {
					System.out.println(cNum++ + "." + sacucevo);
				}
				System.out.print("�ҽ� ���� : ");
				pickSauceNum = Integer.parseInt(sc.nextLine());
				pickSauce = slist.get(pickSauceNum - 1);
				System.out.println("���ǹ� ���� ���� : ���ǹ� ���� ����");
				HappyMeal = new HappyMealVO(pickSnacksAndSide, pickSnacksAndSide2, pickDrink, pickSauce, "���ǹ� ���� ����",
						5100, 1); // �߰��ʿ�
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt);// ���� �Ϸ�

				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;
			case "2":
				tmp = "ġ�����";
				Hamburger = mcs.oneHamburger(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("���̵� ���� : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);

				System.out.println("���ǹ� ���� ���� : ���ǹ� ���� ����");
				HappyMeal = new HappyMealVO(Hamburger, pickSnacksAndSide2, pickDrink, "���ǹ� ���� ����", 5100, 1);
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt);// ���� �Ϸ�

				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;
			case "3":
				tmp = "�ܹ���";
				Hamburger = mcs.oneHamburger(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("���̵� ���� : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);
				System.out.println("���ǹ� ���� ���� : ���ǹ� ���� ����");
				HappyMeal = new HappyMealVO(Hamburger, pickSnacksAndSide2, pickDrink, "���ǹ� ���� ����", 5100, 1);
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt); // ���� �Ϸ�

				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;
			case "4":
				tmp = "�Ұ�����";
				Hamburger = mcs.oneHamburger(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("���̵� ���� : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("�帵ũ ���� : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);
				System.out.println("���ǹ� ���� ���� : ���ǹ� ���� ����");
				HappyMeal = new HappyMealVO(Hamburger, pickSnacksAndSide2, pickDrink, "���ǹ� ���� ����", 5100, 1);
				System.out.print("������ �Է��ϼ��� : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt); // ���� �Ϸ�

				System.out.print("1.��ٱ��� / 2.�ֹ��ϱ�");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;

			}
		}

	}

	public void menu() {
		System.out.println("==========MCdonalds==========");
		System.out.println("     1 > ��  ��  ��");
		System.out.println("     2 > ����&���̵�");
		System.out.println("     3 > ��  ��  Ʈ");
		System.out.println("     4 > ��      ��");
		System.out.println("     5 > ��  ��  ��");
		System.out.println("     6 > �� �� �� ��");
		System.out.println("     7 > �� �� �� ��");
		System.out.println("     0 > ��      ��");
		System.out.println("=============================");
	}

}