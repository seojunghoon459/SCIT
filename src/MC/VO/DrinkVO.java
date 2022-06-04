package MC.VO;

public class DrinkVO {
	private String Drink_name;
	private int price;
	private int setprice;
	private int ssize;
	private int popularity;
	private int reorder;
	private int count;
	public DrinkVO() {
		super();
	}

	public DrinkVO(String drink_name, int price, int setprice, int ssize, int popularity, int reorder) {
		super();
		Drink_name = drink_name;
		this.price = price;
		this.setprice = setprice;
		this.ssize = ssize;
		this.popularity = popularity;
		this.reorder = reorder;
	}

	public DrinkVO(String drink_name, int price, int setprice, int ssize) {
		super();
		this.Drink_name = drink_name;
		this.price = price;
		this.setprice = setprice;
		this.ssize = ssize;
	}

	public String getDrink_name() {
		return Drink_name;
	}

	public void setDrink_name(String drink_name) {
		Drink_name = drink_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSetprice() {
		return setprice;
	}

	public void setSetprice(int setprice) {
		this.setprice = setprice;
	}

	public int getSsize() {
		return ssize;
	}

	public void setSsize(int ssize) {
		this.ssize = ssize;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public int getReorder() {
		return reorder;
	}

	public void setReorder(int reorder) {
		this.reorder = reorder;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String setOutPut() {
		String tmp1, tmp2;
		if (popularity == 1) {
			tmp1 = "¢¾";
		} else
			tmp1 = " ";

		if (reorder == 1) {
			tmp2 = "R";
		} else
			tmp2 = " ";
		return "[" + tmp1 + "]" + "[" + tmp2 + "] " + Drink_name + "\t" + setprice + "¿ø";
	}

	@Override
	public String toString() {
		String tmp1, tmp2;
		if (popularity == 1) {
			tmp1 = "¢¾";
		} else
			tmp1 = " ";

		if (reorder == 1) {
			tmp2 = "R";
		} else
			tmp2 = " ";
		return "[" + tmp1 + "]" + "[" + tmp2 + "] " + Drink_name + "\t" + price + "¿ø";
	}

}
