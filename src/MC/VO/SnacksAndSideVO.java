package MC.VO;

public class SnacksAndSideVO {
	
	private String snacksandside_name;
	private int price;
	private int setprice;
	private int ssize;
	private int popularity;
	private int reorder;
	
	public SnacksAndSideVO() {
		super();
	}
	public String getSnacksandside_name() {
		return snacksandside_name;
	}
	public void setSnacksandside_name(String snacksandside_name) {
		this.snacksandside_name = snacksandside_name;
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
		String tmp1,tmp2;
		if(popularity==1) {
			tmp1 = "¢¾";
		} else tmp1 = " ";
		
		if(reorder==1) {
			tmp2 = "R";
		} else tmp2 = " ";
		return "[" + tmp1 + "]" + "[" + tmp2 +"] " + 
			snacksandside_name + "\t\t" + price + "¿ø";
	}
	
	
}
