package MC.Dao;

import java.util.List;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public interface MCMapper {
	public SetVO BugerSet(HamburgerVO Hamburger, String str);

	public SetVO HappyMeal();

	// 주문하기
	public List<SetVO> order();

	// 장바구니
	public List<SetVO> shopping_basket(Object obj, int count);

	// 취소
	public void cancel();

	public DessertVO SearchDDessert(String str);

	public DrinkVO SearchDrink(String str);

	public HamburgerVO SearchHamburger(String str);

	public SnacksAndSideVO SearchSnacksAndSideVO(String str);

	public List<HamburgerVO> getHamburgerVO();

	public List<SnacksAndSideVO> getMSnaksandSides();

	public List<SnacksAndSideVO> getLSnaksandSides();

	public List<SnacksAndSideVO> getSDrink();

	public List<SnacksAndSideVO> getMDrink();

	public List<SnacksAndSideVO> getLDrink();

	public List<SnacksAndSideVO> getSauce();
}
