package MC.UI;

import java.util.List;
import java.util.Scanner;

import MC.Service.MCService;
import MC.VO.HamburgerVO;

public class MCUI {
	// Scanner ���� ����� sc
	Scanner sc = new Scanner(System.in);
	// MCService ���� ����� mcs
	MCService mcs = new MCService();

	public MCUI() {
		menu();
		System.out.print("> �޴��� ������ �ּ��� : ");
		String firstChoice = sc.nextLine();

		switch (firstChoice) {
		case "1":
			HamburgerMenu();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;
		case "7":
			break;
		case "0":
			break;
		}
	}

	private void HamburgerMenu() {
		List<HamburgerVO> hlist = mcs.getHamburger();
		int HamburgerNum = 1;
		for (HamburgerVO hvo : hlist) {
			System.out.println(HamburgerNum + " " + hvo);
		}

		System.out.print("���Ÿ� �������ּ��� (����) >. ");
		String pickburger = sc.nextLine();

		HamburgerVO hvo = hlist.get(HamburgerNum);

		System.out.println("1.��ǰ \t2.��Ʈ");
		String setTF = sc.nextLine();

		int setCnt = 1;

		if (setTF.equals("1")) {
			System.out.println("������ �Է��ϼ���");

			setCnt = Integer.parseInt(sc.nextLine());

		}

		String size = "m";
		if (setTF.equals("2")) {
			System.out.println("�̵��(M) / ����(L)");
			size = sc.nextLine().toLowerCase();

			if (size.equals("�̵��"))
				size = "m";
			if (size.equals("����"))
				size = "l";
		}

		switch (setTF) {
		case "1":
			mcs.shopping_basket(hvo, setCnt);
			break;
		case "2":
			mcs.BugerSet(hvo, size);
			break;
		default:
			return;
		}

	}

	public void menu() {
		System.out.println("==========MCdonalds==========");
		System.out.println("	  1 > ��  ��  ��");
		System.out.println("	  2 > ����&���̵�");
		System.out.println("	  3 > ��  ��  Ʈ");
		System.out.println("	  4 > ��      ��");
		System.out.println("	  5 > ��  ��  ��");
		System.out.println("	  6 > �� �� �� ��");
		System.out.println("	  7 > �� �� �� ��");
		System.out.println("	  0 > ��      ��");
		System.out.println("=============================");
	}

}
