package MC.Service;

import java.util.ArrayList;
import java.util.List;

import MC.Dao.MCDAO;
import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.KioskVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.ShoppingBasketVO;
import MC.VO.SnacksAndSideVO;

public class MCService {
	MCDAO mdao = new MCDAO();
	List<ShoppingBasketVO> sblist = new ArrayList<ShoppingBasketVO>();
	int kioskNum = 0;

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

	public SetVO HappyMeal() {
		// 해야함
		return null;
	}

	public List<Object> order() {
		

		return null;
	}

	public KioskVO order(Object obj, int orderCnt) {
		String str = String.format("%s %d개", obj, orderCnt);
		KioskVO k = new KioskVO(kioskNum++, str, orderCnt);

		return k;
	}

	public List<ShoppingBasketVO> shopping_basket(Object product, int ordercnt) {
		sblist.add(sblist.size(), new ShoppingBasketVO(product, ordercnt));

		return sblist;
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
}
