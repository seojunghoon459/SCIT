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
				administrateMenu();
				System.out.print("> 메뉴를 선택해 주세요 : ");
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
			System.out.print("> 메뉴를 선택해 주세요 : ");
			adminchoice = sc.nextLine();
			addmenu(adminchoice);
			break;
		case "2":
			updatemenu();
			System.out.print("> 메뉴를 선택해 주세요 : ");
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
			System.out.println("**관리자 모드를 종료합니다.");
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
				System.out.print("> 제품명을 입력하세요 : ");
				hamburger_name = sc.nextLine();
				hvo = mcs.SearchHamburger(hamburger_name);
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
				hvo.setHamburger_name(hamburger_name);
				hvo.setPrice(price);
				hvo.setSetprice(setprice);
				hvo.setPopularity(popularity);
				hvo.setReorder(reorder);
				mcs.HamburgerUpdate(hvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Dessert_name = sc.nextLine();
				dvo = mcs.SearchDessert(Dessert_name);
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
				dvo.setDessert_name(Dessert_name);
				dvo.setPrice(price);
				dvo.setSetprice(setprice);
				dvo.setPopularity(popularity);
				dvo.setReorder(reorder);
				mcs.DessertUpdate(dvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				snacksandside_name = sc.nextLine();
				sasvo = mcs.SearchSnacksAndSide(snacksandside_name);
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
				sasvo.setSnacksandside_name(snacksandside_name);
				sasvo.setPrice(price);
				sasvo.setSetprice(setprice);
				sasvo.setPopularity(popularity);
				sasvo.setReorder(reorder);
				mcs.SnacksAndSideUpdate(sasvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "4":
				System.out.println("====Drink Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Drink_name = sc.nextLine();
				dkvo = mcs.SearchDrink(Drink_name);
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
				dkvo.setDrink_name(Drink_name);
				dkvo.setPrice(price);
				dkvo.setSetprice(setprice);
				dkvo.setPopularity(popularity);
				dkvo.setReorder(reorder);
				mcs.DrinkUpdate(dkvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Sauce_name = sc.nextLine();
				sacvo = mcs.SearchSauce(Sauce_name);
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
				sacvo.setSauce_name(Sauce_name);
				sacvo.setPrice(price);
				sacvo.setSetprice(setprice);
				sacvo.setPopularity(popularity);
				sacvo.setReorder(reorder);
				mcs.SauceUpdate(sacvo);
				System.out.println("> 해당 상품의 정보 수정이 완료되었습니다.");
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
				System.out.print("> 제품명을 입력하세요 : ");
				hamburger_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.println("> 사이즈를 고르시오 ");
				System.out.println("1) S   2) M   3) L ");
				System.out.print("> ");
				ssize = sc.nextInt();
				sc.nextLine();
				HamburgerVO hvo = new HamburgerVO(hamburger_name, price, setprice, ssize);
				mcs.HamburgerAdd(hvo);
				System.out.println("> 상품등록이 완료되었습니다.");
				break;
			case "2":
				System.out.println("====Dessert Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Dessert_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.println("> 사이즈를 고르시오 ");
				System.out.println("1) S   2) M   3) L ");
				ssize = sc.nextInt();
				sc.nextLine();
				DessertVO dvo = new DessertVO(Dessert_name, price, setprice, ssize);
				mcs.DessertAdd(dvo);
				break;
			case "3":
				System.out.println("====SnacksAndSide Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				snacksandside_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.println("> 사이즈를 고르시오 ");
				System.out.println("1) S   2) M   3) L ");
				ssize = sc.nextInt();
				sc.nextLine();
				SnacksAndSideVO sasvo = new SnacksAndSideVO(snacksandside_name, price, setprice, ssize);
				mcs.SnacksAndSideAdd(sasvo);
				break;
			case "4":
				System.out.println("====Drink Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Drink_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.println("> 사이즈를 고르시오 ");
				System.out.println("1) S   2) M   3) L ");
				ssize = sc.nextInt();
				sc.nextLine();
				DrinkVO dkvo = new DrinkVO(Drink_name, price, setprice, ssize);
				mcs.DrinkAdd(dkvo);
				break;
			case "5":
				System.out.println("====Sauce Menu====");
				System.out.print("> 제품명을 입력하세요 : ");
				Sauce_name = sc.nextLine();
				System.out.print("> 제품가격을 입력하세요 : ");
				price = sc.nextInt();
				sc.nextLine();
				System.out.print("> 제품 세트가격을 입력하세요 : ");
				setprice = sc.nextInt();
				sc.nextLine();
				System.out.println("> 사이즈를 고르시오 ");
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
		System.out.println("1. 햄버거 삭제");
		System.out.println("2. 디저트 삭제");
		System.out.println("3. 스낵앤사이드 삭제");
		System.out.println("4. 음료 삭제");
		System.out.println("5. 소스 삭제");
		System.out.println("6. 삭제메뉴 나가기");
	}

	private void updatemenu() {
		System.out.println("==========Update==========");
		System.out.println("1. 햄버거 수정");
		System.out.println("2. 디저트 수정");
		System.out.println("3. 스낵앤사이드 수정");
		System.out.println("4. 음료 수정");
		System.out.println("5. 소스 수정");
		System.out.println("6. 수정메뉴 나가기");
	}

	private void addmenu() {
		System.out.println("==========Add==========");
		System.out.println("1. 햄버거 추가");
		System.out.println("2. 디저트 추가");
		System.out.println("3. 스낵앤사이드 추기");
		System.out.println("4. 음료 추가");
		System.out.println("5. 소스 추가");
		System.out.println("6. 추가메뉴 나가기");

	}

	private void administrateMenu() {
		System.out.println("========AdministrateMode========");
		System.out.println("1. Menu Add");
		System.out.println("2. Menu Update");
		System.out.println("3. Menu Delete");
		System.out.println("4. System Macmornig");
		System.out.println("5. AdministrateMode Exit");
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
				changeNum = result1;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				Hamburgerlist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 <= result2) {
				changeNum = result2;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				SnacksAndSidelist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 <= result3) {
				changeNum = result3;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				Drinklist.get(changeNum - 1).setCount(cNum);
				return;
			}

			if (changeNum - result1 - result2 - result3 <= result4) {
				changeNum = result4;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				System.out.println(Setlist.get(changeNum - 1));
				Dessertlist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 <= result5) {
				changeNum = result5;
				System.out.print("숫자를 변경해주세요 : ");
				cNum = sc.nextInt();
				Setlist.get(changeNum - 1).setCount(cNum);
				return;
			}
			if (changeNum - result1 - result2 - result3 - result4 - result5 <= result6) {
				changeNum = result6;
				System.out.print("숫자를 변경해주세요 : ");
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
				System.out.println("0" + cnt++ + "." + dvo);
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
				System.out.println("0" + cnt++ + "." + dvo);
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
				System.out.println("0" + cnt++ + "." + hvo);
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