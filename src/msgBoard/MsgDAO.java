package msgBoard;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import member.MemberVO;

public class MsgDAO {
	private SqlSession session;

	public MsgDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	public void insert(MsgVO m) {
		session.insert("myMsg.insert", m);
		session.commit();
	}
	
	public List<MsgVO> selectSend(String sender){
		return session.selectList("myMsg.selectSend");
	}

	public List<MsgVO> selectAddress(String addressee){
		return session.selectList("myMsg.selectAddress");
	}

	
}
