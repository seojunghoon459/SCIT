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
		return result;

	}

	public int DessertAdd(DessertVO dessert) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.DessertAdd(dessert);
		return result;
	}

	public int SnacksAndSideAdd(SnacksAndSideVO snacksAndSide) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.SnacksAndSideAdd(snacksAndSide);
		return result;
	}

	public int DrinkAdd(DrinkVO drink) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.DrinkAdd(drink);
		return result;
	}

	public int SauceAdd(SauceVO sauce) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.SauceAdd(sauce);
		return result;
	}

	public int HamburgerUpdate(HamburgerVO hamburger) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.HamburgerUpdate(hamburger);
		return result;
	}

	public int DessertUpdate(DessertVO dessert) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.DessertUpdate(dessert);
		return result;
	}

	public int SnacksAndSideUpdate(SnacksAndSideVO snacksAndSide) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.SnacksAndSideUpdate(snacksAndSide);
		return result;
	}

	public int DrinkUpdate(DrinkVO drink) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.DrinkUpdate(drink);
		return result;

	}

	public int SauceUpdate(SauceVO sauce) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.SauceUpdate(sauce);
		return result;

	}

	public int HamburgerDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.HamburgerDelete(str);
		return result;

	}

	public int DessertDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.DessertDelete(str);
		return result;

	}

	public int SnacksAndSideDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.SnacksAndSideDelete(str);
		return result;

	}

	public int DrinkDelete(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.DrinkDelete(str);
		return result;

	}

	public int SauceDeletee(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		int result = mapper.SauceDeletee(str);
		return result;
	}

}
