package status;

import java.util.Date;

/**
 * @author son
 *
 * hostNo : 글번호
 * hostEmail : 작성자
 * guestEmail : 신청자
 * startDate : 신청날짜 (시작)
 * endDate : 신청날짜(종료)
 * hostingStatus : 현재 글의 상태
 *         W -> (wait)게스팅 신청대기
 *         A -> (accept)게스팅 신청 후 호스트의 수락대기상태
 *         C -> (complete)거래종료
 */
public class StatusVO {
	private int hostNo;
	private String hostEmail;
	private String guestEmail;
	private Date startDate;
	private Date endDate;
	private String hostingStatus;

	public StatusVO() {
		super();
	}

	/*
	 * 처음 게시글 등록할때 사용할 생성자
	 */
	public StatusVO(int hostNo, String hostEmail) {
		super();
		this.hostNo = hostNo;
		this.hostEmail = hostEmail;
		this.hostingStatus = "W";
	}

	/*
	 * 게스트가 신청후 업데이트 생성자
	 */
	public StatusVO(int hostNo, String guestEmail, Date startDate, Date endDate) {
		super();
		this.hostNo = hostNo;
		this.guestEmail = guestEmail;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hostingStatus = "A";
	}

	/*
	 * 게스트 수락 혹은 거절 (status 수락시 C 거절시 W)
	 */
	public StatusVO(String status, int hostNo) {
		super();
		this.hostNo = hostNo;
		this.hostingStatus = status;
	}
	
	public int getHostNo() {
		return hostNo;
	}

	public void setHostNo(int hostNo) {
		this.hostNo = hostNo;
	}

	public String getHostEmail() {
		return hostEmail;
	}

	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getHostingStatus() {
		return hostingStatus;
	}

	public void setHostingStatus(String hostingStatus) {
		this.hostingStatus = hostingStatus;
	}

	@Override
	public String toString() {
		return "StatusVO [hostNo=" + hostNo + ", hostEmail=" + hostEmail + ", guestEmail=" + guestEmail + ", startDate=" + startDate + ", endDate=" + endDate + ", hostingStatus=" + hostingStatus + "]";
	}
	
	

}
