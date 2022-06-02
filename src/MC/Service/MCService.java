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
		return null;
	}

	// 주문하기
	public List<SetVO> order() {
		// 장바구니에 있는 내역들 주문 -> sql있는 키오스크 bill에 스트링으로 변환 저장후 sql로 보내기
		return null;
	}

	public Object order(Object obj, int setNum) {
		System.out.println(obj + " 주문창입니다. " + setNum);
		return null;
	}

	// 장바구니
	public List<SetVO> shopping_basket(Object obj, int count) {
		// 총 얼마냐
		return null;
	}

	// 전체 출력
	public List<SetVO> shopping_basket() {
		// 총 얼마냐
		return null;
	}

	// 취소
	public void cancel() {
		// 장바구니 비워주기
	}

	public DessertVO SearchDDessert(int i) {
		// 객체 받아와서 장바구니에 추가 가능 (수량선택후)
		return null;
	}

	public List<HamburgerVO> getHamburger() {
		List<HamburgerVO> hlist = mdao.getHamburger();
		return hlist;
	}

	public List<SnacksAndSideVO> getSnaksandSides() {
//		List<SnacksAndSideVO> slist = mdao.getSnaksandSides();
//		return slist;
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
