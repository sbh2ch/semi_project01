package status;

import java.util.Date;

/**
 * @author son
 *
 *         hostNo : 글번호
 *         hostEmail : 작성자
 *         guestEmail : 신청자
 *         checkIn : 신청날짜 (시작)
 *         checkOut : 신청날짜(종료)
 *         hostingStatus : 현재 글의 상태
 *         W -> (wait)게스팅 신청대기
 *         A -> (accept)게스팅 신청 후 호스트의 수락대기상태
 *         C -> (complete)거래종료
 */
public class StatusVO {
	private int hostNo;
	private String hostEmail;
	private String guestEmail;
	private Date checkIn;
	private Date checkOut;
	private String hostingStatus;
	private Date regDate;
	private Date startDate;
	private Date endDate;
	private String imgPath;
	private String imgOriName;
	private String imgRealName;
	private String houseDesc;
	private int houseCost;

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
	public StatusVO(int hostNo, String guestEmail, Date checkIn, Date checkOut) {
		super();
		this.hostNo = hostNo;
		this.guestEmail = guestEmail;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
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

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getImgOriName() {
		return imgOriName;
	}

	public void setImgOriName(String imgOriName) {
		this.imgOriName = imgOriName;
	}

	public String getImgRealName() {
		return imgRealName;
	}

	public void setImgRealName(String imgRealName) {
		this.imgRealName = imgRealName;
	}

	public String getHouseDesc() {
		return houseDesc;
	}

	public void setHouseDesc(String houseDesc) {
		this.houseDesc = houseDesc;
	}

	public int getHouseCost() {
		return houseCost;
	}

	public void setHouseCost(int houseCost) {
		this.houseCost = houseCost;
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

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public String getHostingStatus() {
		return hostingStatus;
	}

	public void setHostingStatus(String hostingStatus) {
		this.hostingStatus = hostingStatus;
	}

	@Override
	public String toString() {
		return "StatusVO [hostNo=" + hostNo + ", hostEmail=" + hostEmail + ", guestEmail=" + guestEmail + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", hostingStatus=" + hostingStatus + ", regDate=" + regDate + ", startDate=" + startDate + ", endDate=" + endDate + ", imgPath=" + imgPath + ", imgOriName=" + imgOriName + ", imgRealName=" + imgRealName + ", houseDesc=" + houseDesc + ", houseCost=" + houseCost + "]";
	}
	
}
