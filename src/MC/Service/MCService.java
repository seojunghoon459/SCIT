package MC.Service;

import java.util.List;

import MC.Dao.MCDAO;
import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public class MCService {
	MCDAO mdao = new MCDAO();

	// �ܹ��� ��Ʈ �����
	// str = m l
	public SetVO BugerSet(HamburgerVO Hamburger, String str) {

		/*
		 * �� = new SetVO(�ܹ��� , ���� , ���̵�); � �Ұų� �����Է� ��.shopping_basket(�� , ��);
		 */

		return null;
	}

	public SetVO HappyMeal() {
		return null;
	}

	// �ֹ��ϱ�
	public List<SetVO> order() {
		// ��ٱ��Ͽ� �ִ� ������ �ֹ� -> sql�ִ� Ű����ũ bill�� ��Ʈ������ ��ȯ ������ sql�� ������
		return null;
	}

	// ��ٱ���
	public List<SetVO> shopping_basket(Object obj, int count) {
		// �� �󸶳�
		return null;
	}

	// ���
	public void cancel() {
		// ��ٱ��� ����ֱ�
	}

	public DessertVO SearchDDessert(String str) {
		// ��ü �޾ƿͼ� ��ٱ��Ͽ� �߰� ���� (����������)
		return null;
	}

	public DrinkVO SearchDrink(String str) {
		return null;
	}

	public HamburgerVO SearchHamburger(String str) {
		return null;
	}

	public SnacksAndSideVO SearchSnacksAndSideVO(String str) {
		return null;
	}

	public HamburgerVO pickHamburge() {

		return null;
	}

	public List<HamburgerVO> getHamburger() {
		List<HamburgerVO> hlist = mdao.getHamburger();
		return hlist;
	}

	public List<SnacksAndSideVO> getMSnaksandSides() {
		List<SnacksAndSideVO> slist = mdao.getMSnaksandSides();
		return slist;
	}

	public List<SnacksAndSideVO> getLSnaksandSides() {
		List<SnacksAndSideVO> slist = mdao.getMSnaksandSides();
		return slist;
	}

	public List<DrinkVO> getSDrink() {
		List<DrinkVO> dlist = mdao.getSDrink();
		return dlist;
	}

	public List<DrinkVO> getMDrink() {
		List<DrinkVO> dlist = mdao.getMDrink();
		return dlist;
	}

	public List<DrinkVO> getLDrink() {
		List<DrinkVO> dlist = mdao.getLDrink();
		return dlist;
	}

	public List<SauceVO> getSauce() {
		List<SauceVO> slist = mdao.getSauce();
		return slist;
	}

	public List<DessertVO> getDessert() {
		List<DessertVO> dlist = mdao.getDessert();
		return dlist;
	}
}
