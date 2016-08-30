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
	public int insert(MsgVO msg) {
		session.insert("myMsg.insert", msg);
		session.commit();
		return msg.getNo();
	}
	
	public List<MsgVO> selectSend(String sender){
		return session.selectList("myMsg.selectSend", sender);
	}

	public List<MsgVO> selectAddress(String addressee){
		return session.selectList("myMsg.selectAddress", addressee);
	}

	
}
