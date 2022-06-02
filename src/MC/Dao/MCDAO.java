package MC.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public class MCDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

//	// 세트만들기
//	public SetVO BugerSet(HamburgerVO Hamburger, String str) {
//
//		return null;
//	}

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
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		SnacksAndSideVO result = mapper.SearchSnacksAndSide(str);
		return result;
	}

	public List<HamburgerVO> getHamburger() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<HamburgerVO> result = mapper.getHamburger();
		return result;
	}

	// 추가필요
	public List<SnacksAndSideVO> getSnacksAndSide() {
		return null;
	}

	public List<SnacksAndSideVO> getMSnaksandSides() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<SnacksAndSideVO> result = mapper.getMSnaksandSides();
		return result;
	}

	public List<SnacksAndSideVO> getLSnaksandSides() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<SnacksAndSideVO> result = mapper.getLSnaksandSides();
		return result;
	}

	public List<DrinkVO> getSDrink() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<DrinkVO> result = mapper.getSDrink();
		return result;
	}

	public List<DrinkVO> getMDrink() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<DrinkVO> result = mapper.getMDrink();
		return result;
	}

	public List<DrinkVO> getLDrink() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<DrinkVO> result = mapper.getLDrink();
		return result;
	}

	public List<SauceVO> getSauce() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<SauceVO> result = mapper.getSauce();
		return result;
	}

	public List<DessertVO> getDessert() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<DessertVO> result = mapper.getDessert();
		return result;
	}
}
