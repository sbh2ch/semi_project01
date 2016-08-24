package preview;

import java.util.Date;


/**
 * @param email			아이디 FK
 * @param hostNo		글번호 PK
 * @param regDate		등록일
 * @param startDate		시작일
 * @param endDate		종료일
 * @param imgPath		이미지 주소
 * @param imgOriName	원본이름
 * @param imgRealName	fileRename
 * @param houseDesc		제목
 * @param houseCost		하루 숙박료
 */
public class PreviewVO {
	private String email;
	private int hostNo;
	private Date regDate;
	private Date startDate;
	private Date endDate;
	private String imgPath;
	private String imgOriName;
	private String imgRealName;
	private String houseDesc;
	private int houseCost;

	public PreviewVO() {
		super();
	}

	
	/*
	 * insert용 생성자
	 * */
	public PreviewVO(String email, Date startDate, Date endDate, String imgPath, String imgOriName, String imgRealName, String houseDesc, int houseCost) {
		super();
		this.email = email;
		this.startDate = startDate;
		this.endDate = endDate;
		this.imgPath = imgPath;
		this.imgOriName = imgOriName;
		this.imgRealName = imgRealName;
		this.houseDesc = houseDesc;
		this.houseCost = houseCost;
	}

	
	/*
	 * update용 생성자
	 * */
	public PreviewVO(int hostNo, Date startDate, Date endDate, String imgPath, String imgOriName, String imgRealName, String houseDesc, int houseCost) {
		super();
		this.hostNo = hostNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.imgPath = imgPath;
		this.imgOriName = imgOriName;
		this.imgRealName = imgRealName;
		this.houseDesc = houseDesc;
		this.houseCost = houseCost;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHostNo() {
		return hostNo;
	}

	public void setHostNo(int hostNo) {
		this.hostNo = hostNo;
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


	@Override
	public String toString() {
		return "PreviewVO [email=" + email + ", hostNo=" + hostNo + ", regDate=" + regDate + ", startDate=" + startDate + ", endDate=" + endDate + ", imgPath=" + imgPath + ", imgOriName=" + imgOriName + ", imgRealName=" + imgRealName + ", houseDesc=" + houseDesc + ", houseCost=" + houseCost + "]";
	}
	
	
}
