package location;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import preview.PreviewVO;

public class LocationDAO
{
	private SqlSession session;

	public LocationDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}

	public void insert(LocationVO l) {
		session.insert("myLocation.insert", l);
		session.commit();
	}

	public void update(LocationVO l) {
		session.update("myLocation.update", l);
		session.commit();
	}

	public void delete(int hostNo) {
		session.delete("myLocation.delete", hostNo);
		session.commit();
	}

	public List<LocationVO> selectAll() {
		return session.selectList("myLocation.selectAll");
	}

	public LocationVO selectOne(int hostNo) {
		return session.selectOne("myLocation.selectOne", hostNo);
	}
}
