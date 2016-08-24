package preview;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;

public class PreviewDAO {
	private SqlSession session;

	public PreviewDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}

	public int insert(PreviewVO p) {
		session.insert("myPreview.insert", p);
		session.commit();

		return p.getHostNo();
	}

	public void update(PreviewVO p) {
		session.update("myPreview.update", p);
		session.commit();
	}

	public void delete(int hostNo) {
		session.delete("myPreview.delete", hostNo);
		session.commit();
	}

	public List<PreviewVO> selectAll() {
		return session.selectList("myPreview.selectAll");
	}

	public List<PreviewVO> selectThree() {
		return session.selectList("myPreview.selectThree");
	}

	public PreviewVO selectOne(int hostNo) {
		return session.selectOne("myPreview.selectOne", hostNo);
	}

}
