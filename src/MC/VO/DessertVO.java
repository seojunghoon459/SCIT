package MC.VO;

public class DessertVO {
	private String Dessert_name;
	private int price;
	private int setprice;
	private int ssize;
	private int popularity;
	private int reorder;
	private int count;

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

	public DessertVO(String Dessert_name, int price, int setprice) {
		super();
		this.Dessert_name = Dessert_name;
		this.price = price;
		this.setprice = setprice;
	}

	public String getDessert_name() {
		return Dessert_name;
	}

	public void setDessert_name(String Dessert_name) {
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
		return "[" + tmp1 + "]" + "[" + tmp2 + "] " + Dessert_name + tapForPrice(Dessert_name) + price + "¿ø";
	}

	public String tapForPrice(String str) {
		String tap = "";
		if (str.length() <= 5) {
			tap = "\t\t\t\t";
		} else if (str.length() <= 9) {
			tap = "\t\t\t";
		} else if (str.length() <= 13) {
			tap = "\t\t";
		} else if (str.length() <= 16) {
			tap = "\t";
		}

		return tap;
	}

}
