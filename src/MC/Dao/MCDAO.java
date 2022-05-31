package MC.Dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import MC.VO.DessertVO;
import MC.VO.DrinkVO;
import MC.VO.HamburgerVO;

public class MCDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//����Ʈ �˻�
	private DessertVO SearchDDessert(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DessertVO result = mapper.SearchDDessert(str);
		return result;
	}
	
	
	//���� �˻�
	public DrinkVO SearchDrink(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);

		DrinkVO result = mapper.SearchDrink(str);
		return result;
	}
	
	
	//�ܹ��� �˻�
	public HamburgerVO SearchHamburger(String str) {
		SqlSession session = null;
		session = factory.openSession();
		MCMapper mapper = session.getMapper(MCMapper.class);
		
		HamburgerVO result = mapper.SearchHamburger(str);
		return result;
	}
}
