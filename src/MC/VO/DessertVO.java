package MC.VO;

public class DessertVO {
	private String Dessert_name;
	private int price;
	private int setprice;
	private int ssize;
	private int popularity;
	private int reorder;

	public DessertVO() {
		super();
	}

	public DessertVO(String Dessert_name, int price, int setprice, int ssize, int popularity, int reorder) {
		super();
		this.Dessert_name = Dessert_name;
		this.price = price;
		this.setprice = setprice;
		this.ssize = ssize;
		this.popularity = popularity;
		this.reorder = reorder;
	}

	public String getHamburger_name() {
		return Dessert_name;
	}

	public void setHamburger_name(String Dessert_name) {
		this.Dessert_name = Dessert_name;
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
		return "[" + tmp1 + "]" + "[" + tmp2 + "] " + Dessert_name + "\t\t" + price + "¿ø";
	}

}
