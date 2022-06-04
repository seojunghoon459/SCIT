package MC.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.KioskVO;
import MC.VO.SauceVO;
import MC.VO.SetVO;
import MC.VO.SnacksAndSideVO;

public class MCDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	// 주문하기
	public int order(KioskVO kVO) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.order(kVO);
		session.commit();
		return result;
	}

	public HamburgerVO SearchHamburger(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		HamburgerVO result = mapper.SearchHamburger(str);
		return result;
	}

	public DessertVO SearchDessert(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DessertVO result = mapper.SearchDessert(str);
		return result;
	}

	public SnacksAndSideVO SearchSnacksAndSide(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		SnacksAndSideVO result = mapper.SearchSnacksAndSide(str);
		return result;
	}

	public DrinkVO SearchDrink(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DrinkVO result = mapper.SearchDrink(str);
		return result;
	}

	public SauceVO SearchSauce(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		SauceVO result = mapper.SearchSauceVO(str);
		return result;
	}

	public List<HamburgerVO> getHamburger() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<HamburgerVO> result = mapper.getHamburger();
		return result;
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

	public List<SnacksAndSideVO> getSnaksandSides() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<SnacksAndSideVO> result = mapper.getSnaksandSides();
		return result;
	}

	public List<DrinkVO> getDrink() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<DrinkVO> result = mapper.getDrink();
		return result;
	}

	public int HamburgerAdd(HamburgerVO hamburger) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.HamburgerAdd(hamburger);
		session.commit();
		return result;

	}

	public int DessertAdd(DessertVO dessert) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.DessertAdd(dessert);
		session.commit();
		return result;
	}

	public int SnacksAndSideAdd(SnacksAndSideVO snacksAndSide) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.SnacksAndSideAdd(snacksAndSide);
		session.commit();
		return result;
	}

	public int DrinkAdd(DrinkVO drink) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.DrinkAdd(drink);
		session.commit();
		return result;
	}

	public int SauceAdd(SauceVO sauce) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.SauceAdd(sauce);
		session.commit();
		return result;
	}

	public int HamburgerUpdate(HamburgerVO hamburger) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.HamburgerUpdate(hamburger);
		session.commit();
		return result;
	}

	public int DessertUpdate(DessertVO dessert) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.DessertUpdate(dessert);
		session.commit();
		return result;
	}

	public int SnacksAndSideUpdate(SnacksAndSideVO snacksAndSide) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.SnacksAndSideUpdate(snacksAndSide);
		session.commit();
		return result;
	}

	public int DrinkUpdate(DrinkVO drink) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.DrinkUpdate(drink);
		session.commit();
		return result;

	}

	public int SauceUpdate(SauceVO sauce) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.SauceUpdate(sauce);
		session.commit();
		return result;

	}

	public int HamburgerDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.HamburgerDelete(str);
		session.commit();
		return result;

	}

	public int DessertDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.DessertDelete(str);
		session.commit();
		return result;

	}

	public int SnacksAndSideDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.SnacksAndSideDelete(str);
		session.commit();
		return result;

	}

	public int DrinkDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.DrinkDelete(str);
		session.commit();
		return result;

	}

	public int SauceDeletee(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.SauceDeletee(str);
		session.commit();
		return result;
	}

	public List<SnacksAndSideVO> getHappySnacksAndSides() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		List<SnacksAndSideVO> result = mapper.getHappySnacksAndSides();
		session.commit();
		return result;
	}

}
