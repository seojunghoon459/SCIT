package MC.VO;

public class HappyMealVO {

	private HamburgerVO Hamburger;
	private SnacksAndSideVO SnacksAndSide;
	private SnacksAndSideVO SnacksAndSide2;
	private DrinkVO Drink;
	private SauceVO Sauce;
	private String Toy;
	private int Price;
	private int count;

	public HappyMealVO() {
		super();
	}

	public HappyMealVO(SnacksAndSideVO snacksAndSide, SnacksAndSideVO snacksAndSide2, DrinkVO drink, SauceVO sauce,
			String toy, int price, int count) {
		super();
		SnacksAndSide = snacksAndSide;
		SnacksAndSide2 = snacksAndSide2;
		Drink = drink;
		Sauce = sauce;
		Toy = toy;
		Price = price;
		this.count = count;
	}

	public HappyMealVO(HamburgerVO hamburger, SnacksAndSideVO snacksAndSide2, DrinkVO drink, String toy,
			int price, int count) {
		super();
		Hamburger = hamburger;
		SnacksAndSide2 = snacksAndSide2;
		Drink = drink;
		Toy = toy;
		Price = price;
		this.count = count;
	}

	public HamburgerVO getHamburger() {
		return Hamburger;
	}

	public void setHamburger(HamburgerVO hamburger) {
		Hamburger = hamburger;
	}

	public SnacksAndSideVO getSnacksAndSide() {
		return SnacksAndSide;
	}

	public void setSnacksAndSide(SnacksAndSideVO snacksAndSide) {
		SnacksAndSide = snacksAndSide;
	}

	public SnacksAndSideVO getSnacksAndSide2() {
		return SnacksAndSide2;
	}

	public void setSnacksAndSide2(SnacksAndSideVO snacksAndSide2) {
		SnacksAndSide2 = snacksAndSide2;
	}

	public DrinkVO getDrink() {
		return Drink;
	}

	public void setDrink(DrinkVO drink) {
		Drink = drink;
	}

	public SauceVO getSauce() {
		return Sauce;
	}

	public void setSauce(SauceVO sauce) {
		Sauce = sauce;
	}

	public String getToy() {
		return Toy;
	}

	public void setToy(String toy) {
		Toy = toy;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "HappyMealVO [Hamburger=" + Hamburger + ", SnacksAndSide=" + SnacksAndSide + ", SnacksAndSide2="
				+ SnacksAndSide2 + ", Drink=" + Drink + ", Sauce=" + Sauce + ", Toy=" + Toy + ", Price=" + Price
				+ ", count=" + count + "]";
	}

//	@Override
//	public String toString() {
//		if(Hamburger==null) {
//			return "해피밀 맥너겟 4 조각" + "  "   + Price + "원";
//		}
//		return "해피밀 " + Hamburger + "  " + Price + "원";
//	}

}
