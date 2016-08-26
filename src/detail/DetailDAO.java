package detail;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;

public class DetailDAO {
	private SqlSession session;

	public DetailDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public DetailVO selectOne(int hostNo){
		return session.selectOne("myDetail.selectOne", hostNo);
	}
	
	public void insert(DetailVO d){
		session.insert("myDetail.insert", d);
		session.commit();
	}
	
	public void update(DetailVO d){
		session.update("myDetail.update", d);
		session.commit();
	}
	
	public void delete(int hostNo){
		session.delete("myDetail.delete", hostNo);
		session.commit();
	}
}
