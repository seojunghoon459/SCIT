package MC.UI;

import java.util.List;
import java.util.Scanner;

import MC.Service.MCService;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

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
		System.out.println(hlist.size());

		int HamburgerNum = 1;
		for (HamburgerVO hvo : hlist) {
			System.out.println(HamburgerNum++ + "." + hvo);
		}

		System.out.print("���Ÿ� �������ּ��� (����) : ");
		int pickburger = Integer.parseInt(sc.nextLine());

		HamburgerVO hvo = hlist.get(pickburger - 1);

		System.out.println("1.��ǰ \t2.��Ʈ");
		String setTF = sc.nextLine();

		int setCnt = 1;

		if (setTF.equals("1")) {
			System.out.print("������ �Է��ϼ��� : ");
			setCnt = Integer.parseInt(sc.nextLine());
		}

		String size = "m";
		if (setTF.equals("2")) {
			System.out.print("�̵��(M) / ����(L) : ");
			size = sc.nextLine().toLowerCase();

			if (size.equals("�̵��"))
				size = "m";
			if (size.equals("����"))
				size = "l";
		}

		switch (setTF) {
		case "1":
			//�����ʿ�
			mcs.shopping_basket(hvo, setCnt);
			break;
		case "2":
			BugerSet(hvo, size);
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

	public SetVO BugerSet(HamburgerVO Hamburger, String str) {
		System.out.println(Hamburger.getHamburger_name() + "��Ʈ");

		SnacksAndSideVO ssvo = selectSnacksAndSide(str);
		DrinkVO dvo = selectDrink(str);

		SetVO setVO = new SetVO(Hamburger, ssvo, dvo);
		System.out.println("���� : ");
		int setNum = Integer.parseInt(sc.nextLine());

		System.out.println("1.��ٱ��� / 2.�ֹ��ϱ�");
		int shoppingNum = Integer.parseInt(sc.nextLine());

		switch (shoppingNum) {
		case 1:
			mcs.shopping_basket(setVO, setNum);
			break;
		case 2:
			mcs.order(setVO);
			break;
		default:
			return null;
		}

		return setVO;
	}

	private SnacksAndSideVO selectSnacksAndSide(String str) {
		int sNum = 1;
		int pickSnacksAndSideNum;
		SnacksAndSideVO pickSnacksAndSide = null;

		switch (str) {
		case "m":
			List<SnacksAndSideVO> sMlist = mcs.getMSnaksandSides();
			for (SnacksAndSideVO svo : sMlist) {
				System.out.println(sNum++ + "." + svo);
			}

			System.out.print("���̵� ���� : ");
			pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
			pickSnacksAndSide = sMlist.get(pickSnacksAndSideNum - 1);
			break;

		case "l":
			List<SnacksAndSideVO> sLlist = mcs.getMSnaksandSides();
			for (SnacksAndSideVO svo : sLlist) {
				System.out.println(sNum++ + "." + svo);
			}

			System.out.print("���̵� ���� : ");
			pickSnacksAndSideNum = Integer.parseInt(sc.nextLine());
			pickSnacksAndSide = sLlist.get(pickSnacksAndSideNum - 1);
			break;

		default:
			return null;
		}
		return pickSnacksAndSide;
	}

	private DrinkVO selectDrink(String str) {
		int dNum = 1;
		int pickDrinkNum;
		DrinkVO pickDrink = null;

		switch (str) {
		case "m":
			List<DrinkVO> dMlist = mcs.getMDrink();
			for (DrinkVO svo : dMlist) {
				System.out.println(dNum++ + "." + svo);
			}

			System.out.print("�帵ũ ���� : ");
			pickDrinkNum = Integer.parseInt(sc.nextLine());
			pickDrink = dMlist.get(pickDrinkNum - 1);
			break;

		case "l":
			List<DrinkVO> dLlist = mcs.getLDrink();
			for (DrinkVO svo : dLlist) {
				System.out.println(dNum++ + "." + svo);
			}

			System.out.print("�帵ũ ���� : ");
			pickDrinkNum = Integer.parseInt(sc.nextLine());
			pickDrink = dLlist.get(pickDrinkNum - 1);
			break;

		default:
			return null;
		}
		return pickDrink;
	}

}
