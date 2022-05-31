package DC.Service;

import java.util.List;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public class MCService {
	// 햄버거 세트 만들기
	// str = m l
	public SetVO BugerSet(HamburgerVO Hamburger, String str) {

		/*
		 * ㅁ = new SetVO(햄버거 , 음료 , 사이드); 몇개 할거냐 숫자입력 ㄴ.shopping_basket(ㅁ , 수);
		 */

		return null;
	}

	public SetVO HappyMeal() {
		return null;
	}

	// 주문하기
	public List<SetVO> order() {
		// 장바구니에 있는 내역들 주문 -> sql있는 키오스크 bill에 스트링으로 변환 저장후 sql로 보내기
		return null;
	}

	// 장바구니
	public List<SetVO> shopping_basket(Object obj, int count) {
		// 총 얼마냐
		return null;
	}

	// 취소
	public void cancel() {
		// 장바구니 비워주기
	}

	public DessertVO SearchDDessert(String str) {
		// 객체 받아와서 장바구니에 추가 가능 (수량선택후)
		return null;
	}

	public DrinkVO SearchDrink(String str) {
		return null;
	}

	public HamburgerVO SearchHamburger(String str) {
		return null;
	}

	public SnacksAndSideVO SearchSnacksAndSideVO(String str) {
		return null;
	}
	
	public HamburgerVO pickHamburge() {
		
		
		
		return null;
	}

	public List<HamburgerVO> getHamburger() {
		List<HamburgerVO> hlist = dao.getHamburger
		
		
		return hlist;
	}

	public List<SnacksAndSideVO> getMSnaksandSides() {
		return null;
	}

	public List<SnacksAndSideVO> getLSnaksandSides() {
		return null;
	}

	public List<DrinkVO> getSDrink() {
		return null;
	}

	public List<DrinkVO> getMDrink() {
		return null;
	}

	public List<DrinkVO> getLDrink() {
		return null;
	}

	public List<SauceVO> getSauce() {
		return null;
	}

	public List<DessertVO> getDessert() {
		return null;
	}
}
