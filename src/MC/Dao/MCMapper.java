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

	public HamburgerVO SearchHamburger(String str);

	public DessertVO SearchDessert(String str);

	public SnacksAndSideVO SearchSnacksAndSide(String str);

	public DrinkVO SearchDrink(String str);

	public SauceVO SearchSauceVO(String str);

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

	public int HamburgerAdd(HamburgerVO hamburger); //

	public int DessertAdd(DessertVO dessert); //

	public int SnacksAndSideAdd(SnacksAndSideVO snacksAndSide);//

	public int DrinkAdd(DrinkVO drink); //

	public int SauceAdd(SauceVO sauce); //

	public int HamburgerUpdate(HamburgerVO hamburger); //

	public int DessertUpdate(DessertVO dessert); //

	public int SnacksAndSideUpdate(SnacksAndSideVO snacksAndSide); //

	public int DrinkUpdate(DrinkVO drink); //

	public int SauceUpdate(SauceVO sauce); //

	public int HamburgerDelete(String str); //

	public int DessertDelete(String str); //

	public int SnacksAndSideDelete(String str); //

	public int DrinkDelete(String str); //

	public int SauceDeletee(String str); //
	
	public int getKioskCnt();

}
