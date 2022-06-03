package MC.VO;

public class ShoppingBasketVO {
	private Object product;
	private int ordercount;
	private int sumprice;

	public ShoppingBasketVO() {
		super();
	}

	public ShoppingBasketVO(Object product, int ordercount) {
		super();
		this.product = product;
		this.ordercount = ordercount;
		clac();
	}

	public Object getProduct() {
		return product;
	}

	public void setProduct(Object product) {
		this.product = product;
	}

	public int getOrdercount() {
		return ordercount;
	}

	public void setOrdercount(int ordercount) {
		this.ordercount = ordercount;
		clac();
	}

	public int getSumprice() {
		return sumprice;
	}

	public void setSumprice(int sumprice) {
		this.sumprice = sumprice;
		clac();
	}

	public String kioskOutPut() {
		return product + "\t" + ordercount + "°³";
	}

	@Override
	public String toString() {
		return "ShoppingBasketVO [product=" + product + ", ordercount=" + ordercount + ", sumprice=" + sumprice + "]";
	}

	private int clac() {
		if (product instanceof SetVO) {
			int hprice = ((SetVO) product).getHamburger().getPrice();
			int dsprice = ((SetVO) product).getDrink().getSetprice();
			int ssprice = ((SetVO) product).getSnacksAndSide().getPrice();
			sumprice = hprice + dsprice + ssprice;
		}
		if (product instanceof HamburgerVO) {

			sumprice = ((HamburgerVO) product).getPrice();
		}
		if (product instanceof DrinkVO) {

			sumprice = ((DrinkVO) product).getPrice();
		}
		if (product instanceof SnacksAndSideVO) {

			sumprice = ((SnacksAndSideVO) product).getPrice();
		}
		return sumprice;
	}
}