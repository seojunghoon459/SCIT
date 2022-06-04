package MC.VO;

public class KioskVO {
	private int knum;
	private String kiosk_bill;

	public KioskVO() {
		super();
	}

	public KioskVO(int knum, String kiosk_bill) {
		super();
		this.knum = knum;
		this.kiosk_bill = kiosk_bill;
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

	@Override
	public String toString() {
		return "주문번호 : " + knum + "\n" + kiosk_bill;
	}

}
