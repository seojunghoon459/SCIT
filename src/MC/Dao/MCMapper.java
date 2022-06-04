package MC.Dao;

import java.util.List;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.KioskVO;
import MC.VO.SauceVO;
import MC.VO.SnacksAndSideVO;

public interface MCMapper {

	public HamburgerVO searchHamburger(String str);

	public DessertVO searchDessert(String str);

	public SnacksAndSideVO searchSnacksAndSide(String str);

	public DrinkVO searchDrink(String str);

	public SauceVO searchSauce(String str);

	public int order(KioskVO kVO); // 장바구니 주문

	public List<HamburgerVO> getHamburger();

	public List<SnacksAndSideVO> getMSnaksandSides();

	public List<SnacksAndSideVO> getLSnaksandSides();

	public List<SnacksAndSideVO> getSnaksandSides();

	public List<SnacksAndSideVO> getHappySnacksAndSides();

	public List<DrinkVO> getDrink();

	public List<DrinkVO> getSDrink();

	public List<DrinkVO> getMDrink();

	public List<DrinkVO> getLDrink();

	public List<SauceVO> getSauce();

	public List<DessertVO> getDessert();

	public int addHamburger(HamburgerVO hamburger); //

	public int addDessert(DessertVO dessert); //

	public int addSnacksAndSide(SnacksAndSideVO snacksAndSide);//

	public int addDrink(DrinkVO drink); //

	public int addSauce(SauceVO sauce); //

	public int updateHamburger(HamburgerVO hamburger); //

	public int updateDessert(DessertVO dessert); //

	public int updateSnacksAndSide(SnacksAndSideVO snacksAndSide); //

	public int updateDrink(DrinkVO drink); //

	public int updateSauce(SauceVO sauce); //

	public int deleteHamburger(String str); //

	public int deleteDessert(String str); //

	public int deleteSnacksAndSide(String str); //

	public int deleteDrink(String str); //

	public int deleteSauce(String str); //

	public int getKioskCnt();

	public SnacksAndSideVO oneSnacksAndSide(String str);

	public HamburgerVO oneHamburger(String str);
}
