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

	public void deleteReply(int hostNo) {
		session.delete("myReply.deleteReply", hostNo);
		session.commit();
		
	}

	public void updateReply(ReplyVO rvo) {
		session.update("myReply.updateComment", rvo);
		session.commit();
	}



}
	
