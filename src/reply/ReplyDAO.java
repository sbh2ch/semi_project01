package reply;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;

public class ReplyDAO {
	private static SqlSession session;
	
	public ReplyDAO(){
		session = MyAppSqlConfig.getSqlSessionInstance();
	}

	public void insertReply(ReplyVO rvo) {
		session.insert("myReply.insertReply", rvo);
		session.commit();
		
	}



}
	
