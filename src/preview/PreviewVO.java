package preview;

import java.util.Date;

public class PreviewVO {
	private String email;
	private int no;
	private Date date;
	private String imgPath;
	private String imgOriName;
	private String imgRealName;
	private String desc;
	private int cost;

	public PreviewVO() {
	}

	/**
	 * String 이메일, int 호스트번호, Date 날짜, String 이미지경로, String 설명, String 요금
	 * 순서대로...
	 * 
	 * @param email
	 *            : 이 글을 올린 회원의 이메일. (신상명세)
	 * @param no
	 *            : 회원이 호스팅 한다는 글을 올린 번호. 이 번호로 모든 호스팅 정보가 조회됨.
	 * @param date
	 *            : 예약이 가능한 날짜.
	 * @param imgPath
	 *            : 미리보기 및 상세정보에 보여줄 이미지. 딱 한장만 하자.....
	 * @param desc
	 *            : 호스팅한 숙소에 대한 설명. 혹은 제목..? (ex: xxx동 개 쩌는집...)
	 * @param cost
	 *            : 요금. 계산 등을 구현할 생각이라면 int 형으로.
	 */

	public String getImgOriName() {
		return imgOriName;
	}
	
	public PreviewVO(String email, Date date, String imgPath, String imgOriName, String imgRealName, String desc, int cost) {
		super();
		this.email = email;
		this.date = date;
		this.imgPath = imgPath;
		this.imgOriName = imgOriName;
		this.imgRealName = imgRealName;
		this.desc = desc;
		this.cost = cost;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
