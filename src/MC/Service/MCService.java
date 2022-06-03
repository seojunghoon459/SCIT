package MC.Service;

import java.util.List;

import MC.Dao.MCDAO;
import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public class MCService {
	MCDAO mdao = new MCDAO();

	public void SDDOrderORHhoppingBasket(int shoppingNum, Object obj, int ordercnt) {
		switch (shoppingNum) {
		case 1:
			shopping_basket(obj, ordercnt);
			break;
		case 2:
			order(obj, ordercnt);
			break;
		}
	}

	public SetVO HappyMeal() {
		// �ؾ���
		return null;
	}

	public List<SetVO> order() {
		// Ű����ũ �ֹ�â
		return null;
	}

	public Object order(Object obj, int setNum) {
		// ��ǰ �ֹ�â
		return null;
	}

	public List<SetVO> shopping_basket(Object obj, int count) {
		// �� �󸶳�
		return null;
	}

	public List<SetVO> shopping_basket() {
		// ��ٱ��� ��ü ���
		return null;
	}

	public void cancel() {
		// ��ٱ��� ����ֱ�
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