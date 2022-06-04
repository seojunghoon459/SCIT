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
	// Scanner 변수 예약어 sc
	Scanner sc = new Scanner(System.in);
	// MCService 변수 예약어 mcs
	MCService mcs = new MCService();

	public MCUI() {
		while (true) {
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
		System.out.println("주문번호" + kvo.getKnum() + "\n" + kvo.getKiosk_bill());
	}

	private void Administrate() {
		while (true) {
			administrateMenu();
			System.out.print("> 메뉴를 선택해 주세요 : ");
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
				System.out.println("**관리자 모드를 종료합니다.");
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
			System.out.print("> 메뉴를 선택해 주세요 : ");
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
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickburger = Integer.parseInt(sc.nextLine());
				hvo = Hamburgerlist.get(pickburger - 1);
				if (hvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.println("> 정말로 삭제하시겠습니까?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">삭제 작업을 취소하였습니다");
					return;
				}
				mcs.deleteHamburger(hvo.getHamburger_name());
				System.out.println("> 해당 상품의 정보 삭제가 완료되었습니다.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				for (DessertVO dvos : Dessertlist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dvos);
					else
						System.out.println(cnt++ + "." + dvos);
				}
				System.out.print("디저트를 선택해주세요 (숫자) : ");
				int pickDessert = Integer.parseInt(sc.nextLine());
				dvo = Dessertlist.get(pickDessert - 1);
				if (dvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.println("> 정말로 삭제하시겠습니까?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">삭제 작업을 취소하였습니다");
					return;
				}
				mcs.deleteDessert(dvo.getDessert_name());
				System.out.println("> 해당 상품의 정보 삭제가 완료되었습니다.");
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				for (SnacksAndSideVO sasvos : SnacksAndSidelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sasvos);
					else
						System.out.println(cnt++ + "." + sasvos);
				}
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickSnacksAndSide = Integer.parseInt(sc.nextLine());

				sasvo = SnacksAndSidelist.get(pickSnacksAndSide - 1);
				if (sasvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.println("> 정말로 삭제하시겠습니까?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">삭제 작업을 취소하였습니다");
					return;
				}
				mcs.deleteSnacksAndSide(sasvo.getSnacksandside_name());
				System.out.println("> 해당 상품의 정보 삭제가 완료되었습니다.");
				break;
			case "4":
				System.out.println("====Drink Menu====");
				for (DrinkVO dkvos : Drinklist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dkvos);
					else
						System.out.println(cnt++ + "." + dkvos);
				}
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickDrink = Integer.parseInt(sc.nextLine());

				dkvo = Drinklist.get(pickDrink - 1);
				if (dkvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.println("> 정말로 삭제하시겠습니까?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">삭제 작업을 취소하였습니다");
					return;
				}
				mcs.deleteDrink(dkvo.getDrink_name());
				System.out.println("> 해당 상품의 정보 삭제가 완료되었습니다.");
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				for (SauceVO sacvos : Saucelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sacvos);
					else
						System.out.println(cnt++ + "." + sacvos);
				}
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickSauce = Integer.parseInt(sc.nextLine());

				sacvo = Saucelist.get(pickSauce - 1);
				if (sacvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.println("> 정말로 삭제하시겠습니까?(y/n) : ");
				answer = sc.nextLine().toLowerCase();
				if (answer != "y") {
					System.out.println(">삭제 작업을 취소하였습니다");
					return;
				}
				mcs.deleteSauce(sacvo.getSauce_name());
				System.out.println("> 해당 상품의 정보 삭제가 완료되었습니다.");
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
			System.out.print("> 메뉴를 선택해 주세요 : ");
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
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickburger = Integer.parseInt(sc.nextLine());

				hvo = Hamburgerlist.get(pickburger - 1);
				if (hvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> 인기메뉴 표시를 하시겠습니까? 0) 표시안함  1) 표시  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> 재주문 표시를 하시겠습니까?  0) 표시안함  1) 표시  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				hvo.setPrice(price);
				hvo.setSetprice(setprice);
				hvo.setPopularity(popularity);
				hvo.setReorder(reorder);
				mcs.updateHamburger(hvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				for (DessertVO dvos : Dessertlist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dvos);
					else
						System.out.println(cnt++ + "." + dvos);
				}
				System.out.print("디저트를 선택해주세요 (숫자) : ");
				int pickDessert = Integer.parseInt(sc.nextLine());
				dvo = Dessertlist.get(pickDessert - 1);
				if (dvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> 인기메뉴 표시를 하시겠습니까? 0) 표시안함  1) 표시  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> 재주문 표시를 하시겠습니까?  0) 표시안함  1) 표시  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				dvo.setPrice(price);
				dvo.setSetprice(setprice);
				dvo.setPopularity(popularity);
				dvo.setReorder(reorder);
				mcs.updateDessert(dvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				for (SnacksAndSideVO sasvos : SnacksAndSidelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sasvos);
					else
						System.out.println(cnt++ + "." + sasvos);
				}
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickSnacksAndSide = Integer.parseInt(sc.nextLine());

				sasvo = SnacksAndSidelist.get(pickSnacksAndSide - 1);
				if (sasvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> 인기메뉴 표시를 하시겠습니까? 0) 표시안함  1) 표시  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> 재주문 표시를 하시겠습니까?  0) 표시안함  1) 표시  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				sasvo.setPrice(price);
				sasvo.setSetprice(setprice);
				sasvo.setPopularity(popularity);
				sasvo.setReorder(reorder);
				mcs.updateSnacksAndSide(sasvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "4":
				System.out.println("====Drink Menu====");
				for (DrinkVO dkvos : Drinklist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + dkvos);
					else
						System.out.println(cnt++ + "." + dkvos);
				}
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickDrink = Integer.parseInt(sc.nextLine());

				dkvo = Drinklist.get(pickDrink - 1);
				if (dkvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> 인기메뉴 표시를 하시겠습니까? 0) 표시안함  1) 표시  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> 재주문 표시를 하시겠습니까?  0) 표시안함  1) 표시  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				dkvo.setPrice(price);
				dkvo.setSetprice(setprice);
				dkvo.setPopularity(popularity);
				dkvo.setReorder(reorder);
				mcs.updateDrink(dkvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				for (SauceVO sacvos : Saucelist) {
					if (cnt < 10)
						System.out.println("0" + "" + cnt++ + "." + sacvos);
					else
						System.out.println(cnt++ + "." + sacvos);
				}
				System.out.print("버거를 선택해주세요 (숫자) : ");
				int pickSauce = Integer.parseInt(sc.nextLine());

				sacvo = Saucelist.get(pickSauce - 1);
				if (sacvo == null) {
					System.out.println("> 등록되지 않은 상품입니다.");
				}
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.print("> 인기메뉴 표시를 하시겠습니까? 0) 표시안함  1) 표시  : ");
				popularity = sc.nextInt();
				sc.nextLine();
				System.out.print("> 재주문 표시를 하시겠습니까?  0) 표시안함  1) 표시  : ");
				reorder = sc.nextInt();
				sc.nextLine();
				sacvo.setPrice(price);
				sacvo.setSetprice(setprice);
				sacvo.setPopularity(popularity);
				sacvo.setReorder(reorder);
				mcs.updateSauce(sacvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
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
			System.out.print("> 메뉴를 선택해 주세요 : ");
			String adminchoice = sc.nextLine();
			switch (adminchoice) {
			case "1":
				System.out.println("====Hamburger Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				hamburger_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				HamburgerVO hvo = new HamburgerVO(hamburger_name, price, setprice);
				mcs.addHamburger(hvo);
				System.out.println("> 상품등록이 완료되었습니다.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Dessert_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				DessertVO dvo = new DessertVO(Dessert_name, price, setprice);
				mcs.addDessert(dvo);
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				snacksandside_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				SnacksAndSideVO sasvo = new SnacksAndSideVO(snacksandside_name, price, setprice);
				mcs.addSnacksAndSide(sasvo);
				break;
			case "4":
				System.out.println("====Drink Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Drink_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				System.out.println("> 사이즈를 고르시오 ");
				System.out.println("1) S   2) M   3) L ");
				ssize = sc.nextInt();
				DrinkVO dkvo = new DrinkVO(Drink_name, price, setprice, ssize);
				mcs.addDrink(dkvo);
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Sauce_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
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
		System.out.println("1. 햄버거 삭제");
		System.out.println("2. 디저트 삭제");
		System.out.println("3. 스낵앤사이드 삭제");
		System.out.println("4. 음료 삭제");
		System.out.println("5. 소스 삭제");
		System.out.println("6. 삭제 메뉴 나가기");
	}

	private void updatemenu() {
		System.out.println("==========Update==========");
		System.out.println("1. 햄버거 수정");
		System.out.println("2. 디저트 수정");
		System.out.println("3. 스낵앤사이드 수정");
		System.out.println("4. 음료 수정");
		System.out.println("5. 소스 수정");
		System.out.println("6. 수정 메뉴 나가기");
	}

	private void addmenu() {
		System.out.println("==========Add==========");
		System.out.println("1. 햄버거 추가");
		System.out.println("2. 디저트 추가");
		System.out.println("3. 스낵앤사이드 추가");
		System.out.println("4. 음료 추가");
		System.out.println("5. 소스 추가");
		System.out.println("6. 추가 메뉴 나가기");

	}

	private void administrateMenu() {
		System.out.println("========AdministrateMode========");
		System.out.println("1. 메뉴 추가");
		System.out.println("2. 메뉴 수정");
		System.out.println("3. 메뉴 삭제");
		System.out.println("4. 관리메뉴 나가기");
	}

	// 수정필요
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
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "개");

				totPrice += (vo.getPrice() * vo.getCount());
				result1++;
			}
		}
		if (SnacksAndSidelist.size() > 0) {
			for (SnacksAndSideVO vo : SnacksAndSidelist) {

				System.out.println("[" + sbNum++ + "]" + vo.getSnacksandside_name());
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "개");

				totPrice += (vo.getPrice() * vo.getCount());
				result2++;
			}
		}
		if (Drinklist.size() > 0) {
			for (DrinkVO vo : Drinklist) {

				System.out.println("[" + sbNum++ + "]" + vo.getDrink_name());
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "개");

				totPrice += (vo.getPrice() * vo.getCount());
				result3++;
			}
		}

		if (Dessertlist.size() > 0) {
			for (DessertVO vo : Dessertlist) {

				System.out.println("[" + sbNum++ + "]" + vo.getDessert_name());
				System.out.println(vo.getPrice() * vo.getCount() + "\t\t\t" + vo.getCount() + "개");

				totPrice += (vo.getPrice() * vo.getCount());
				result4++;
			}
		}

		if (Setlist.size() > 0) {
			for (SetVO vo : Setlist) {

				System.out.println("[" + sbNum++ + "]" + vo.getHamburger().getHamburger_name() + "세트");
				System.out.println(vo.getSnacksAndSide().getSnacksandside_name() + "," + vo.getDrink().getDrink_name());

				int setPrice = (vo.getHamburger().getPrice() + vo.getSnacksAndSide().getSetprice()
						+ vo.getDrink().getSetprice()) * vo.getCount();

				System.out.println(setPrice + "\t\t\t" + vo.getCount() + "개");

				totPrice += setPrice;
				result5++;
			}
		}

		if (HappyMeallist.size() > 0) {
			for (HappyMealVO vo : HappyMeallist) {

				System.out.print("[" + sbNum++ + "]" + "해피밀 ");

				if (vo.getHamburger() != null) {
					System.out.println(vo.getHamburger().getHamburger_name());
					System.out.println(vo.getSnacksAndSide2().getSnacksandside_name() + ",해피밀 랜덤 토이"
							+ vo.getDrink().getDrink_name());

					int HappyMealPrice = (vo.getHamburger().getPrice() + vo.getDrink().getPrice()) * vo.getCount();

					System.out.println(HappyMealPrice + "\t\t\t" + vo.getCount() + "개");

					totPrice += HappyMealPrice;
					result6++;
				}

				if (vo.getHamburger() == null) {
					System.out.println(vo.getSnacksAndSide().getSnacksandside_name());
					System.out.println(vo.getSnacksAndSide2().getSnacksandside_name() + ","
							+ vo.getSauce().getSauce_name() + ',' + "해피밀 랜덤 토이" + vo.getDrink().getDrink_name());

					int HappyMealPrice = (vo.getSnacksAndSide().getPrice() + vo.getSnacksAndSide2().getSetprice()
							+ vo.getSauce().getSetprice() + vo.getDrink().getSetprice()) * vo.getCount();

					System.out.println(HappyMealPrice + "\t\t\t" + vo.getCount() + "개");

					totPrice += HappyMealPrice;
					result6++;
				}

			}
		}

		if (totPrice == 0) {
			System.out.println("장바구니에 상품이 없습니다.");
			return;
		}

		System.out.println("총합 : " + totPrice);

		String shoppingchoice;
		System.out.println("1) 상품수량 변경 2) 전체취소 3) 주문하기 4) 나가기");
		System.out.print("> ");
		shoppingchoice = sc.nextLine();
		int changeNum;
		switch (shoppingchoice) {
		case "1":
			System.out.print("바꾸고 싶으신 메뉴를 선택해주세요 : ");
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
			System.out.println("전체 취소 되었습니다.");
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
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				Hamburgerlist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 <= result2) {
				changeNum = (changeNum - result1) - result2 - 1;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				SnacksAndSidelist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 <= result3) {
				changeNum = (changeNum - result1 - result2) - result3 - 1;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				Drinklist.get(changeNum).setCount(cNum);
				return;
			}

			if (changeNum - result1 - result2 - result3 <= result4) {
				changeNum = (changeNum - result1 - result2 - result3) - result4 - 1;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				System.out.println(Setlist.get(changeNum - 1));
				Dessertlist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 <= result5) {
				changeNum = (changeNum - result1 - result2 - result3 - result4) - result5 - 1;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				Setlist.get(changeNum).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 - result5 <= result6) {
				changeNum = (changeNum - result1 - result2 - result3 - result4 - result5) - result6 - 1;
				System.out.print("숫자를 변경해주세요 : ");
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
		System.out.print("스낵앤사이드를 선택해 주세요 : ");

		int SnacksAndSideNum = Integer.parseInt(sc.nextLine());

		SnacksAndSideVO pickSnacksAndSide = slist.get(SnacksAndSideNum - 1);

		System.out.print("수량 입력해 주세요 : ");
		int SnacksAndSideCnt = Integer.parseInt(sc.nextLine());

		pickSnacksAndSide.setCount(SnacksAndSideCnt);

		System.out.print("1.장바구니 / 2.주문하기 : ");
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

		System.out.print("디저트를 선택해 주세요 : ");
		int DessertNum = Integer.parseInt(sc.nextLine());

		DessertVO pickDessert = dist.get(DessertNum - 1);

		System.out.print("수량 입력해 주세요 : ");
		int DessertCnt = Integer.parseInt(sc.nextLine());

		pickDessert.setCount(DessertCnt);

		System.out.print("1.장바구니 / 2.주문하기 : ");
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
		System.out.print("음료를 선택해 주세요 : ");
		int DrinkNum = Integer.parseInt(sc.nextLine());

		DrinkVO pickDrink = dist.get(DrinkNum - 1);

		System.out.print("수량 입력해 주세요 : ");
		int DrinkCnt = Integer.parseInt(sc.nextLine());

		pickDrink.setCount(DrinkCnt);

		System.out.print("1.장바구니 / 2.주문하기 : ");
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

		System.out.print("버거를 선택해주세요 (숫자) : ");
		int pickburger = Integer.parseInt(sc.nextLine());

		HamburgerVO hvo = hlist.get(pickburger - 1);

		System.out.println("1.단품 \t2.세트");
		String setTF = sc.nextLine();

		int setCnt = 1;

		if (setTF.equals("1")) {
			System.out.print("수량을 입력하세요 : ");
			setCnt = Integer.parseInt(sc.nextLine());

			hvo.setCount(setCnt);
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
		System.out.println(Hamburger.getHamburger_name() + "세트");

		SnacksAndSideVO ssvo = selectSnacksAndSide(str);
		DrinkVO dvo = selectDrink(str);

		SetVO setVO = new SetVO(Hamburger, ssvo, dvo);
		System.out.print("수량 : ");
		int setNum = Integer.parseInt(sc.nextLine());

		setVO.setCount(setNum);

		System.out.print("1.장바구니 / 2.주문하기 : ");
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

			System.out.print("사이드 선택 : ");
			pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
			pickSnacksAndSide = sMlist.get(pickSnacksAndSideNum - 1);
			break;

		case "l":
			List<SnacksAndSideVO> sLlist = mcs.getMSnaksandSides();
			for (SnacksAndSideVO svo : sLlist) {
				System.out.println(sNum++ + "." + svo.setOutPut());
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
				System.out.println(dNum++ + "." + svo.setOutPut());
			}

			System.out.print("드링크 선택 : ");
			pickDrinkNum = Integer.parseInt(sc.nextLine());
			pickDrink = dMlist.get(pickDrinkNum - 1);
			break;

		case "l":
			List<DrinkVO> dLlist = mcs.getLDrink();
			for (DrinkVO svo : dLlist) {
				System.out.println(dNum++ + "." + svo.setOutPut());
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
		System.out.println("1. 해피밀 멧너겟 4조각  5100원");
		System.out.println("2. 해피밀 치즈버거      5100원");
		System.out.println("3. 해피밀 햄버거       5100원");
		System.out.println("4. 해피밀 불고기버거    5100원");
		System.out.print("> 메뉴를 선택해 주세요 : ");
		HappyMealChoice = sc.nextLine();
		while (true) {
			switch (HappyMealChoice) {
			case "1":
				String tmp = "멧너겟 4조각";
				pickSnacksAndSide = mcs.oneSnacksAndSide(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("사이드 선택 : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("드링크 선택 : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);
				List<SauceVO> slist = mcs.getSauce();
				for (SauceVO sacucevo : slist) {
					System.out.println(cNum++ + "." + sacucevo);
				}
				System.out.print("소스 선택 : ");
				pickSauceNum = Integer.parseInt(sc.nextLine());
				pickSauce = slist.get(pickSauceNum - 1);
				System.out.println("해피밀 토이 선택 : 해피밀 랜덤 토이");
				HappyMeal = new HappyMealVO(pickSnacksAndSide, pickSnacksAndSide2, pickDrink, pickSauce, "해피밀 랜덤 토이",
						5100, 1); // 추가필요
				System.out.print("수량을 입력하세요 : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt);// 수정 완료

				System.out.print("1.장바구니 / 2.주문하기");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;
			case "2":
				tmp = "치즈버거";
				Hamburger = mcs.oneHamburger(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("사이드 선택 : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("드링크 선택 : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);

				System.out.println("해피밀 토이 선택 : 해피밀 랜덤 토이");
				HappyMeal = new HappyMealVO(Hamburger, pickSnacksAndSide2, pickDrink, "해피밀 랜덤 토이", 5100, 1);
				System.out.print("수량을 입력하세요 : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt);// 수정 완료

				System.out.print("1.장바구니 / 2.주문하기");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;
			case "3":
				tmp = "햄버거";
				Hamburger = mcs.oneHamburger(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("사이드 선택 : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("드링크 선택 : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);
				System.out.println("해피밀 토이 선택 : 해피밀 랜덤 토이");
				HappyMeal = new HappyMealVO(Hamburger, pickSnacksAndSide2, pickDrink, "해피밀 랜덤 토이", 5100, 1);
				System.out.print("수량을 입력하세요 : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt); // 수정 완료

				System.out.print("1.장바구니 / 2.주문하기");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;
			case "4":
				tmp = "불고기버거";
				Hamburger = mcs.oneHamburger(tmp);
				for (SnacksAndSideVO ssvo : sslist) {
					System.out.println(sNum++ + "." + ssvo);
				}
				System.out.print("사이드 선택 : ");
				pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
				pickSnacksAndSide2 = sslist.get(pickSnacksAndSideNum - 1);
				for (DrinkVO svo : dslist) {
					System.out.println(dNum++ + "." + svo);
				}
				System.out.print("드링크 선택 : ");
				pickDrinkNum = Integer.parseInt(sc.nextLine());
				pickDrink = dslist.get(pickDrinkNum - 1);
				System.out.println("해피밀 토이 선택 : 해피밀 랜덤 토이");
				HappyMeal = new HappyMealVO(Hamburger, pickSnacksAndSide2, pickDrink, "해피밀 랜덤 토이", 5100, 1);
				System.out.print("수량을 입력하세요 : ");
				HappyMealCnt = Integer.parseInt(sc.nextLine());

				HappyMeal.setCount(HappyMealCnt); // 수정 완료

				System.out.print("1.장바구니 / 2.주문하기");
				shoppingNum = Integer.parseInt(sc.nextLine());
				mcs.SDDOrderORHhoppingBasket(shoppingNum, HappyMeal);
				return;

			}
		}

	}

	public void menu() {
		System.out.println("==========MCdonalds==========");
		System.out.println("     1 > 햄  버  거");
		System.out.println("     2 > 스낵&사이드");
		System.out.println("     3 > 디  저  트");
		System.out.println("     4 > 음      료");
		System.out.println("     5 > 해  피  밀");
		System.out.println("     6 > 장 바 구 니");
		System.out.println("     7 > 주 문 하 기");
		System.out.println("     0 > 취      소");
		System.out.println("=============================");
	}

}