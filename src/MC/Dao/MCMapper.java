package MC.Dao;

import java.util.List;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.KioskVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public interface MCMapper {

	public DessertVO SearchDDessert(String str);

	public DrinkVO SearchDrink(String str);

	public HamburgerVO SearchHamburger(String str);

	public SnacksAndSideVO SearchSnacksAndSide(String str);

	public List<HamburgerVO> getHamburger();

	public List<SnacksAndSideVO> getMSnaksandSides();

	public List<SnacksAndSideVO> getLSnaksandSides();

	public List<SnacksAndSideVO> getSnaksandSides();

	public List<DrinkVO> getDrink();

	public List<DrinkVO> getSDrink();

	public List<DrinkVO> getMDrink();

	public List<DrinkVO> getLDrink();

	public List<SauceVO> getSauce();

	public List<DessertVO> getDessert();

	public int SaveOrder(KioskVO str);

}
