package MC.VO;

public class KioskVO {
	private int knum;
	private String kiosk_bill;
	private int count;

	public KioskVO() {
		super();
	}

	public KioskVO(int knum, String kiosk_bill, int count) {
		super();
		this.knum = knum;
		this.kiosk_bill = kiosk_bill;
		this.count = count;
	}

	public int getKnum() {
		return knum;
	}

	public void setKnum(int knum) {
		this.knum = knum;
	}

	public String getKiosk_bill() {
		return kiosk_bill;
	}

	public void setKiosk_bill(String kiosk_bill) {
		this.kiosk_bill = kiosk_bill;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "주문번호 : " + knum + "\n" + kiosk_bill + "\t" + count + "개";
	}

}
