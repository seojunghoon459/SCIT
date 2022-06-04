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
import MC.VO.SnacksAndSideVO;

public class MCService {
	MCDAO mdao = new MCDAO();
	Scanner sc = new Scanner(System.in);
	int kioskNum = mdao.getKioskCnt();

	List<HamburgerVO> Hamburgerlist = new ArrayList<HamburgerVO>();
	List<SnacksAndSideVO> SnacksAndSidelist = new ArrayList<SnacksAndSideVO>();
	List<DrinkVO> Drinklist = new ArrayList<DrinkVO>();
	List<DessertVO> Dessertlist = new ArrayList<DessertVO>();
	List<SetVO> Setlist = new ArrayList<SetVO>();
	List<HappyMealVO> HappyMeallist = new ArrayList<HappyMealVO>();

	public void SDDOrderORHhoppingBasket(int shoppingNum, Object obj) {
		switch (shoppingNum) {
		case 1:
			shopping_basket(obj);
			break;
		case 2:
			order(obj);
			break;
		}
	}

	public void ShoppingBasketorder() {
		KioskVO k = new KioskVO();

		k.setKnum(kioskNum++);
		String str = "";
		int totPrice = 0;

		if (Hamburgerlist.size() > 0) {
			for (HamburgerVO vo : Hamburgerlist) {

				str += vo.getHamburger_name() + "\n";
				str += vo.getPrice() * vo.getCount() + "\t\t\t" + "[" + vo.getCount() + "개]\n";

				totPrice += (vo.getPrice() * vo.getCount());
			}
		}

		if (SnacksAndSidelist.size() > 0) {
			for (SnacksAndSideVO vo : SnacksAndSidelist) {

				str += vo.getSnacksandside_name() + "\n";
				str += vo.getPrice() * vo.getCount() + "\t\t\t" + "[" + vo.getCount() + "개]\n";

				totPrice += (vo.getPrice() * vo.getCount());
			}
		}

		if (Drinklist.size() > 0) {
			for (DrinkVO vo : Drinklist) {

				str += vo.getDrink_name() + "\n";
				str += vo.getPrice() * vo.getCount() + "\t\t\t" + "[" + +vo.getCount() + "개]\n";

				totPrice += (vo.getPrice() * vo.getCount());
			}
		}

		if (Dessertlist.size() > 0) {
			for (DessertVO vo : Dessertlist) {

				str += vo.getDessert_name() + "\n";
				str += vo.getPrice() * vo.getCount() + "\t\t\t" + "[" + +vo.getCount() + "개]\n";

				totPrice += (vo.getPrice() * vo.getCount());
			}
		}

		if (Setlist.size() > 0) {
			for (SetVO vo : Setlist) {

				str += vo.getHamburger().getHamburger_name() + "세트\n";
				str += vo.getSnacksAndSide().getSnacksandside_name() + "," + vo.getDrink().getDrink_name();

				int setPrice = (vo.getHamburger().getPrice() + vo.getSnacksAndSide().getSetprice()
						+ vo.getDrink().getSetprice()) * vo.getCount();

				str += setPrice + "\t\t\t" + "[" + +vo.getCount() + "개]\n";

				totPrice += setPrice;
			}
		}

		if (HappyMeallist.size() > 0) {
			for (HappyMealVO vo : HappyMeallist) {

				str += "해피밀 ";

				if (vo.getHamburger() != null) {
					str += vo.getHamburger().getHamburger_name();
					str += vo.getSnacksAndSide2().getSnacksandside_name() + ",해피밀 랜덤 토이"
							+ vo.getDrink().getDrink_name();

					int HappyMealPrice = (vo.getHamburger().getPrice() + vo.getDrink().getPrice()) * vo.getCount();

					str += HappyMealPrice + "\t\t\t" + "[" + +vo.getCount() + "개]\n";

					totPrice += HappyMealPrice;
				}

				if (vo.getHamburger() == null) {
					str += vo.getSnacksAndSide().getSnacksandside_name() + "\n";
					str += vo.getSnacksAndSide2().getSnacksandside_name() + "," + vo.getSauce().getSauce_name() + ','
							+ "해피밀 랜덤 토이," + vo.getDrink().getDrink_name() + "\n";

					int HappyMealPrice = (vo.getSnacksAndSide().getPrice() + vo.getSnacksAndSide2().getSetprice()
							+ vo.getSauce().getSetprice() + vo.getDrink().getSetprice()) * vo.getCount();

					str += HappyMealPrice + "\t\t\t" + "[" + +vo.getCount() + "개]\n";

					totPrice += HappyMealPrice;
				}

			}

		}

		str += "\n총" + totPrice;

		k.setKiosk_bill(str);
		mdao.order(k);

		Hamburgerlist.clear();
		SnacksAndSidelist.clear();
		Drinklist.clear();
		Dessertlist.clear();
		Setlist.clear();
		HappyMeallist.clear();
	}

	public void order(Object obj) {
		shopping_basket(obj);
		ShoppingBasketorder();
	}

	public void shopping_basket(Object product) {
		if (product instanceof HamburgerVO) {
			Hamburgerlist.add((HamburgerVO) product);
		}
		if (product instanceof SnacksAndSideVO) {
			SnacksAndSidelist.add((SnacksAndSideVO) product);
		}
		if (product instanceof DrinkVO) {
			Drinklist.add((DrinkVO) product);
		}
		if (product instanceof DessertVO) {
			Dessertlist.add((DessertVO) product);
		}
		if (product instanceof SetVO) {
			Setlist.add((SetVO) product);
		}
		if (product instanceof HappyMealVO) {
			HappyMeallist.add((HappyMealVO) product);
		}
	}

	public void cancel() {
		Hamburgerlist = new ArrayList<HamburgerVO>();
		SnacksAndSidelist = new ArrayList<SnacksAndSideVO>();
		Drinklist = new ArrayList<DrinkVO>();
		Dessertlist = new ArrayList<DessertVO>();
		Setlist = new ArrayList<SetVO>();
		HappyMeallist = new ArrayList<HappyMealVO>();
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

	public void HamburgerAdd(HamburgerVO hamburger) {
		mdao.HamburgerAdd(hamburger);

	}

	public void DessertAdd(DessertVO dessert) {
		mdao.DessertAdd(dessert);

	}

	public void SnacksAndSideAdd(SnacksAndSideVO snacksandside) {
		mdao.SnacksAndSideAdd(snacksandside);

	}

	public void DrinkAdd(DrinkVO drink) {
		mdao.DrinkAdd(drink);

	}

	public void SauceAdd(SauceVO sauce) {
		mdao.SauceAdd(sauce);
	}

	public List<HamburgerVO> getHamburgerlist() {
		return Hamburgerlist;
	}

	public List<SnacksAndSideVO> getSnacksAndSidelist() {
		return SnacksAndSidelist;
	}

	public List<DrinkVO> getDrinklist() {
		return Drinklist;
	}

	public List<DessertVO> getDessertlist() {
		return Dessertlist;
	}

	public List<SetVO> getSetlist() {
		return Setlist;
	}

	public List<HappyMealVO> getHappyMeallist() {
		return HappyMeallist;
	}

	public List<SnacksAndSideVO> gethappySnaksandSides() {
		List<SnacksAndSideVO> happysnacklist = mdao.getHappySnacksAndSides();
		return happysnacklist;
	}

	public HamburgerVO SearchHamburger(String str) {
		HamburgerVO hvo = mdao.SearchHamburger(str);
		return hvo;
	}

	public DessertVO SearchDessert(String str) {
		DessertVO dvo = mdao.SearchDessert(str);
		return dvo;
	}

	public SnacksAndSideVO SearchSnacksAndSide(String str) {
		SnacksAndSideVO svo = mdao.SearchSnacksAndSide(str);
		return svo;
	}

	public DrinkVO SearchDrink(String str) {
		DrinkVO dvo = mdao.SearchDrink(str);
		return dvo;
	}

	public SauceVO SearchSauce(String str) {
		SauceVO svo = mdao.SearchSauce(str);
		return svo;
	}

	public void HamburgerUpdate(HamburgerVO hvo) {
		mdao.HamburgerUpdate(hvo);
	}

	public void DessertUpdate(DessertVO dvo) {
		mdao.DessertUpdate(dvo);
	}

	public void SnacksAndSideUpdate(SnacksAndSideVO sasvo) {
		mdao.SnacksAndSideUpdate(sasvo);
	}

	public void DrinkUpdate(DrinkVO dkvo) {
		mdao.DrinkUpdate(dkvo);
	}

	public void SauceUpdate(SauceVO sacvo) {
		mdao.SauceUpdate(sacvo);
	}
}
