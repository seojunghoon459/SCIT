package DC.Service;

import java.util.List;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public class MCService {
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
		List<HamburgerVO> hlist = dao.getHamburger
		
		
		return hlist;
	}

	public List<SnacksAndSideVO> getMSnaksandSides() {
		return null;
	}

	public List<SnacksAndSideVO> getLSnaksandSides() {
		return null;
	}

	public List<DrinkVO> getSDrink() {
		return null;
	}

	public List<DrinkVO> getMDrink() {
		return null;
	}

	public List<DrinkVO> getLDrink() {
		return null;
	}

	public List<SauceVO> getSauce() {
		return null;
	}

	public List<DessertVO> getDessert() {
		return null;
	}
}
