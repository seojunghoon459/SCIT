package MC.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MC.Dao.MCDAO;
import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.HappyMealVO;
import MC.VO.KioskVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.ShoppingBasketVO;
import MC.VO.SnacksAndSideVO;

public class MCService {
	MCDAO mdao = new MCDAO();
	Scanner sc = new Scanner(System.in);
	int kioskNum = 0;

	List<HamburgerVO> HamburgerVOlist = new ArrayList<HamburgerVO>();
	List<SnacksAndSideVO> SnacksAndSideVOlist = new ArrayList<SnacksAndSideVO>();
	List<DrinkVO> DDrinkVOlist = new ArrayList<DrinkVO>();
	List<DessertVO> DessertVOlist = new ArrayList<DessertVO>();
	List<SetVO> SetVOlist = new ArrayList<SetVO>();
	List<HappyMealVO> HappyMealVOlist = new ArrayList<HappyMealVO>();

	public String SDDOrderORHhoppingBasket(int shoppingNum, Object obj, int ordercnt) {
		switch (shoppingNum) {
		case 1:
			shopping_basket(obj, ordercnt);
			return "장바구니에 담았습니다.";
		case 2:
			return order(obj, ordercnt).toString();
		}
		return null;
	}

	public KioskVO ShoppingBasketorder() {
		KioskVO k = new KioskVO();
		k.setKnum(kioskNum++);
		String str = "";
		for (ShoppingBasketVO sbVO : sblist) {
			str += String.format("%s %d개 , ", sbVO.getProduct(), sbVO.getSumprice());
		}

		return k;
	}

	public KioskVO order(Object obj, int orderCnt) {
		String str = String.format("%s %d개", obj, orderCnt);
		KioskVO k = new KioskVO(kioskNum++, str, orderCnt);

		return k;
	}

	public void shopping_basket(Object product, int ordercnt) {
		if (product instanceof HamburgerVO) {
			
		}
		if (product instanceof SnacksAndSideVO) {

		}
		if (product instanceof DrinkVO) {

		}
		if (product instanceof DessertVO) {

		}
		if (product instanceof SetVO) {

		}
		if (product instanceof HappyMealVO) {

		}

	}

	public List<ShoppingBasketVO> shopping_basket() {

		return sblist;
	}

	public void cancel() {
		sblist = new ArrayList<ShoppingBasketVO>();
	}

	public List<HamburgerVO> getHamburger() {
		List<HamburgerVO> hlist = mdao.getHamburger();
		return hlist;
	}

	public List<SnacksAndSideVO> getSnaksandSides() {
		List<SnacksAndSideVO> slist = mdao.getSnaksandSides();
		return slist;
	}

	// 작업 필요
	public List<SnacksAndSideVO> getSSnaksandSides() {
		return null;
	}

	public List<SnacksAndSideVO> getMSnaksandSides() {
		List<SnacksAndSideVO> slist = mdao.getMSnaksandSides();
		return slist;
	}

	public List<SnacksAndSideVO> getLSnaksandSides() {
		List<SnacksAndSideVO> slist = mdao.getMSnaksandSides();
		return slist;
	}

	public List<DrinkVO> getDrink() {
		List<DrinkVO> dlist = mdao.getDrink();
		return dlist;
	}

	public List<DrinkVO> getSDrink() {
		List<DrinkVO> dlist = mdao.getSDrink();
		return dlist;
	}

	public List<DrinkVO> getMDrink() {
		List<DrinkVO> dlist = mdao.getMDrink();
		return dlist;
	}

	public List<DrinkVO> getLDrink() {
		List<DrinkVO> dlist = mdao.getLDrink();
		return dlist;
	}

	public List<SauceVO> getSauce() {
		List<SauceVO> slist = mdao.getSauce();
		return slist;
	}

	public List<DessertVO> getDessert() {
		List<DessertVO> dlist = mdao.getDessert();
		return dlist;
	}

	public void HamburgerAdd(String hamburger_name) {
		mdao.HamburgerAdd(hamburger_name);

	}

	public void DessertAdd(String dessert_name) {
		mdao.DessertAdd(dessert_name);

	}

	public void SnacksAndSideAdd(String snacksandside_name) {
		mdao.SnacksAndSideAdd(snacksandside_name);

	}

	public void DrinkAdd(String drink_name) {
		mdao.DrinkAdd(drink_name);

	}

	public void SauceAdd(String sauce_name) {
		mdao.SauceAdd(sauce_name);

	}

}
