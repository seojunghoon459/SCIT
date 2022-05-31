package MC.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public class MCDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	// 세트만들기
	public SetVO BugerSet(HamburgerVO Hamburger, String str) {

		return null;
	}

	// 해피밀
	public SetVO HappyMeal() {

		return null;
	}

	// 주문하기
	public List<SetVO> order() {

		return null;
	}

	// 장바구니
	public List<SetVO> shopping_basket(Object obj, int count) {

		return null;
	}

	// 취소
	public void cancel() {

	}

	public DessertVO SearchDDessert(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DessertVO result = mapper.SearchDDessert(str);
		return result;
	}

	public DrinkVO SearchDrink(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DrinkVO result = mapper.SearchDrink(str);
		return result;
	}

	public HamburgerVO SearchHamburger(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		HamburgerVO result = mapper.SearchHamburger(str);
		return result;
	}

	public SnacksAndSideVO SearchSnacksAndSide(String str) {

		return null;
	}

	public List<HamburgerVO> getHamburger() {

		return null;
	}

	public List<SnacksAndSideVO> getMSnaksandSides() {

		return null;
	}

	public List<SnacksAndSideVO> getLSnaksandSides() {

		return null;
	}

	public List<SnacksAndSideVO> getSDrink() {

		return null;
	}

	public List<SnacksAndSideVO> getMDrink() {

		return null;
	}

	public List<SnacksAndSideVO> getLDrink() {

		return null;
	}

	public List<SnacksAndSideVO> getSauce() {

		return null;
	}
}
