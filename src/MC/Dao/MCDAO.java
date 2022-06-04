package MC.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;
import MC.VO.KioskVO;
import MC.VO.SauceVO;
import MC.VO.SnacksAndSideVO;

public class MCDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public int order(KioskVO kVO) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.order(kVO);
		session.commit();
		return result;
	}

	public HamburgerVO searchHamburger(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		HamburgerVO result = mapper.searchHamburger(str);
		return result;
	}

	public DessertVO searchDessert(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DessertVO result = mapper.searchDessert(str);
		return result;
	}

	public SnacksAndSideVO searchSnacksAndSide(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		SnacksAndSideVO result = mapper.searchSnacksAndSide(str);
		return result;
	}

	public DrinkVO searchDrink(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DrinkVO result = mapper.searchDrink(str);
		return result;
	}

	public SauceVO searchSauce(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		SauceVO result = mapper.searchSauce(str);
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

	public int addHamburger(HamburgerVO hamburger) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.addHamburger(hamburger);
		session.commit();
		return result;

	}

	public int addDessert(DessertVO dessert) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.addDessert(dessert);
		session.commit();
		return result;
	}

	public int addSnacksAndSide(SnacksAndSideVO snacksAndSide) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.addSnacksAndSide(snacksAndSide);
		session.commit();
		return result;
	}

	public int addDrink(DrinkVO drink) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.addDrink(drink);
		session.commit();
		return result;
	}

	public int addSauce(SauceVO sauce) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.addSauce(sauce);
		session.commit();
		return result;
	}

	public int updateHamburger(HamburgerVO hamburger) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.updateHamburger(hamburger);
		session.commit();
		return result;
	}

	public int updateDessert(DessertVO dessert) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.updateDessert(dessert);
		session.commit();
		return result;
	}

	public int updateSnacksAndSide(SnacksAndSideVO snacksAndSide) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.updateSnacksAndSide(snacksAndSide);
		session.commit();
		return result;
	}

	public int updateDrink(DrinkVO drink) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.updateDrink(drink);
		session.commit();
		return result;

	}

	public int updateSauce(SauceVO sauce) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.updateSauce(sauce);
		session.commit();
		return result;

	}

	public int deleteHamburger(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.deleteHamburger(str);
		session.commit();
		return result;

	}

	public int deleteDessert(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.deleteDessert(str);
		session.commit();
		return result;

	}

	public int deleteSnacksAndSide(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.deleteSnacksAndSide(str);
		session.commit();
		return result;

	}

	public int deleteDrink(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.deleteDrink(str);
		session.commit();
		return result;

	}

	public int deleteSauce(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.deleteSauce(str);
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

	public int getKioskCnt() {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		int result = mapper.getKioskCnt();
		return result;
	}

	public SnacksAndSideVO oneSnacksAndSide(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		SnacksAndSideVO svo = mapper.oneSnacksAndSide(str);
		return svo;
	}

	public HamburgerVO oneHamburger(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		HamburgerVO hvo = mapper.oneHamburger(str);
		return hvo;
	}

}
