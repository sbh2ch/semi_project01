package status;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;

public class StatusDAO {
	private SqlSession session;

	public StatusDAO() {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}

	public void insert(StatusVO s) {
		session.insert("myStatus.insert", s);
		session.commit();
	}
	
	/*
	 * 신청 DAO
	 */
	public void hostingRequest(StatusVO s) {
		session.update("myStatus.hostingRequest", s);
		session.commit();
	}

	public void hostingResponse(StatusVO s) {
		String status = s.getHostingStatus();
		if (status.equalsIgnoreCase("C")) { // 수락
			session.update("myStatus.accept", s);
		} else if (status.equalsIgnoreCase("W")) {// 거절
			session.update("myStatus.reject", s);
		}

		session.commit();
	}

	/**
	 * @param hostNo
	 *            한 글에대한 현황 뽑아내기
	 */
	public StatusVO selectOne(int hostNo) {
		return session.selectOne("myStatus.selectOne", hostNo);
	}

	/**
	 * @param hostEmail
	 *            내가 호스트 했던 이력들 다 뽑기
	 */
	public List<StatusVO> selectHostAll(String hostEmail) {
		return session.selectList("myStatus.selectHostAll", hostEmail);
	}

	/**
	 * @param guestEmail
	 *            내가 게스팅했던 이력 다 뽑기
	 */
	public List<StatusVO> selectGuestAll(String guestEmail) {
		return session.selectList("myStatus.selectGuestAll", guestEmail);
	}

	public void delete(int hostNo) {
		session.delete("myStatus.delete", hostNo);
		session.commit();
	}
}
