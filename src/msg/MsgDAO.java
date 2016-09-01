package msg;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import member.MemberVO;

public class MsgDAO {
	private SqlSession session;

	public MsgDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public void insertSend(Msg msg) {
		session.insert("msg.MsgDAO.insertSend", msg);
		session.commit();
	}

	
	public List<Msg> selectSend(String sender){
		return session.selectList("msg.MsgDAO.selectSend", sender);
	}

	public List<Msg> selectAddress(String sender){
		return session.selectList("msg.MsgDAO.selectAddress", sender);
	}

	
}
