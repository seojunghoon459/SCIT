package MC.UI;

import java.util.ArrayList;
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

	private void order() {
		mcs.ShoppingBasketorder();

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
			System.out.print("> �޴��� ������ �ּ��� : ");
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
		String hamburger_name, Dessert_name, snacksandside_name, Drink_name, Sauce_name;
		int price;
		int setprice;
		int popularity;
		int reorder;
		HamburgerVO hvo = null;
		DessertVO dvo = null;
		SnacksAndSideVO sasvo = null;
		DrinkVO dkvo = null;
		SauceVO sacvo = null;
		while (true) {
			switch (adminchoice) {
			case "1":
				System.out.println("====Hamburger Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				hamburger_name = sc.nextLine();
				hvo = mcs.SearchHamburger(hamburger_name);
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
				hvo.setHamburger_name(hamburger_name);
				hvo.setPrice(price);
				hvo.setSetprice(setprice);
				hvo.setPopularity(popularity);
				hvo.setReorder(reorder);
				mcs.HamburgerUpdate(hvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				Dessert_name = sc.nextLine();
				dvo = mcs.SearchDessert(Dessert_name);
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
				dvo.setDessert_name(Dessert_name);
				dvo.setPrice(price);
				dvo.setSetprice(setprice);
				dvo.setPopularity(popularity);
				dvo.setReorder(reorder);
				mcs.DessertUpdate(dvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				snacksandside_name = sc.nextLine();
				sasvo = mcs.SearchSnacksAndSide(snacksandside_name);
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
				sasvo.setSnacksandside_name(snacksandside_name);
				sasvo.setPrice(price);
				sasvo.setSetprice(setprice);
				sasvo.setPopularity(popularity);
				sasvo.setReorder(reorder);
				mcs.SnacksAndSideUpdate(sasvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "4":
				System.out.println("====Drink Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				Drink_name = sc.nextLine();
				dkvo = mcs.SearchDrink(Drink_name);
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
				dkvo.setDrink_name(Drink_name);
				dkvo.setPrice(price);
				dkvo.setSetprice(setprice);
				dkvo.setPopularity(popularity);
				dkvo.setReorder(reorder);
				mcs.DrinkUpdate(dkvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				System.out.print("> ��ǰ���� �Է��ϼ��� : ");
				Sauce_name = sc.nextLine();
				sacvo = mcs.SearchSauce(Sauce_name);
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
				sacvo.setSauce_name(Sauce_name);
				sacvo.setPrice(price);
				sacvo.setSetprice(setprice);
				sacvo.setPopularity(popularity);
				sacvo.setReorder(reorder);
				mcs.SauceUpdate(sacvo);
				System.out.println("> �ش� ��ǰ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "6":
				return;

			}
		}
	}

	public void addmenu(String adminchoice) {
		String hamburger_name, Dessert_name, snacksandside_name, Drink_name, Sauce_name;
		int price;
		int setprice;
		int ssize;
		while (true) {
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
				System.out.print("> ");
				ssize = sc.nextInt();
				sc.nextLine();
				HamburgerVO hvo = new HamburgerVO(hamburger_name, price, setprice, ssize);
				mcs.HamburgerAdd(hvo);
				System.out.println("> ��ǰ����� �Ϸ�Ǿ����ϴ�.");
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
				DessertVO dvo = new DessertVO(Dessert_name, price, setprice, ssize);
				mcs.DessertAdd(dvo);
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
				SnacksAndSideVO sasvo = new SnacksAndSideVO(snacksandside_name, price, setprice, ssize);
				mcs.SnacksAndSideAdd(sasvo);
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
				DrinkVO dkvo = new DrinkVO(Drink_name, price, setprice, ssize);
				mcs.DrinkAdd(dkvo);
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
				SauceVO sacvo = new SauceVO(Sauce_name, price, setprice, ssize);
				mcs.SauceAdd(sacvo);
				break;
			case "6":
				return;

			}
		}
	}

	private void systemMacmorning() {

	}

	private void deletemenu() {
		System.out.println("==========Delete==========");
		System.out.println("1. �ܹ��� ����");
		System.out.println("2. ����Ʈ ����");
		System.out.println("3. �����ػ��̵� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. �ҽ� ����");
		System.out.println("6. �����޴� ������");
	}

	private void updatemenu() {
		System.out.println("==========Update==========");
		System.out.println("1. �ܹ��� ����");
		System.out.println("2. ����Ʈ ����");
		System.out.println("3. �����ػ��̵� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. �ҽ� ����");
		System.out.println("6. �����޴� ������");
	}

	private void addmenu() {
		System.out.println("==========Add==========");
		System.out.println("1. �ܹ��� �߰�");
		System.out.println("2. ����Ʈ �߰�");
		System.out.println("3. �����ػ��̵� �߱�");
		System.out.println("4. ���� �߰�");
		System.out.println("5. �ҽ� �߰�");
		System.out.println("6. �߰��޴� ������");

	}

	private void administrateMenu() {
		System.out.println("========AdministrateMode========");
		System.out.println("1. Menu Add");
		System.out.println("2. Menu Update");
		System.out.println("3. Menu Delete");
		System.out.println("4. System Macmornig");
		System.out.println("5. AdministrateMode Exit");
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
				changeNum = result1;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				Hamburgerlist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 <= result2) {
				changeNum = result2;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				SnacksAndSidelist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 <= result3) {
				changeNum = result3;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				Drinklist.get(changeNum - 1).setCount(cNum);
				return;
			}

			if (changeNum - result1 - result2 - result3 <= result4) {
				changeNum = result4;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				System.out.println(Setlist.get(changeNum - 1));
				Dessertlist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 <= result5) {
				changeNum = result5;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				Setlist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 - result5 <= result6) {
				changeNum = result6;
				System.out.print("���ڸ� �������ּ��� : ");
				cNum = sc.nextInt();
				HappyMeallist.get(changeNum - 1).setCount(cNum);
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
				System.out.println("0" + cnt++ + "." + svo);
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
				System.out.println("0" + cnt++ + "." + dvo);
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
				System.out.println("0" + cnt++ + "." + dvo);
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
				System.out.println("0" + cnt++ + "." + hvo);
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