package MC.VO;

public class HappyMealVO {

	private HamburgerVO Hamburger;
	private SnacksAndSideVO SnacksAndSide;
	private DrinkVO Drink;
	private SauceVO Sauce;
	private String Toy;
	private int Price;
	private int count;
	public HappyMealVO() {
		super();
	}

	public HappyMealVO(HamburgerVO hamburger, SnacksAndSideVO snacksAndSide, DrinkVO drink, String toy, int price, int count) {
		super();
		Hamburger = hamburger;
		Toy = toy;
		SnacksAndSide = snacksAndSide;
		Drink = drink;
		Price = price;
	}

	public HappyMealVO(SnacksAndSideVO snacksAndSide,DrinkVO drink, SauceVO sauce, String toy,  int price, int count) {
		super();
		Toy = toy;
		SnacksAndSide = snacksAndSide;
		Drink = drink;
		Sauce = sauce;
		Price = price;
	}

	public HamburgerVO getHamburger() {
		return Hamburger;
	}

	public void setHamburger(HamburgerVO hamburger) {
		Hamburger = hamburger;
	}

	public String getToy() {
		return Toy;
	}

	public void setToy(String toy) {
		Toy = toy;
	}

	public SnacksAndSideVO getSnacksAndSide() {
		return SnacksAndSide;
	}

	public void setSnacksAndSide(SnacksAndSideVO snacksAndSide) {
		SnacksAndSide = snacksAndSide;
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

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		this.Price = price;
	}

	public void setSauce(SauceVO sauce) {
		Sauce = sauce;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		if(Hamburger==null) {
			return "해피밀 맥너겟 4 조각" + "  "   + Price + "원";
		}
		return "해피밀 " + Hamburger + "  " + Price + "원";
	}


}
