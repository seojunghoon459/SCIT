package MC.VO;

public class SetVO {
	private HamburgerVO Hamburger;
	private SnacksAndSideVO SnacksAndSide;
	private DrinkVO Drink;

	public SetVO() {
		super();
	}

	public SetVO(HamburgerVO hamburger, SnacksAndSideVO snacksAndSide, DrinkVO drink) {
		super();
		Hamburger = hamburger;
		SnacksAndSide = snacksAndSide;
		Drink = drink;
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

	public DrinkVO getDrink() {
		return Drink;
	}

	public void setDrink(DrinkVO drink) {
		Drink = drink;
	}

}
