package detail;

public class DetailVO {
	/**
	 * DetailVO 변수 목록.
	 * 
	 */
	private int hostNo;
	private String houseType;
	private String roomType;
	private int houseCapacity;
	private int houseRoom;
	private int houseBed;
	private int houseBath;
	private String houseDetail;

	public DetailVO() {
	}

	/**
	 * int 호스팅번호, String 집종류, String 방종류, boolean 예약여부, int 수용인원, int 방갯수, int
	 * 침대갯수, int 욕실갯수 순서...
	 * 
	 * @param no
	 * @param houseType
	 * @param roomType
	 * @param houseCapacity
	 * @param houseRoom
	 * @param houseBed
	 * @param houseBath
	 */
	public DetailVO(int hostNo, String houseType, String roomType, int houseCapacity, int houseRoom, int houseBed, int houseBath, String houseDetail) {
		super();
		this.hostNo = hostNo;
		this.houseType = houseType;
		this.roomType = roomType;
		this.houseCapacity = houseCapacity;
		this.houseRoom = houseRoom;
		this.houseBed = houseBed;
		this.houseBath = houseBath;
		this.houseDetail = houseDetail;
	}

	/**
	 * int no : 호스팅 번호로 각종 데이터 조회
	 * 
	 * @return
	 */
	public int getHostNo() {
		return hostNo;
	}

	/**
	 * int no : 호스팅 번호로 각종 데이터 조회
	 * 
	 * @param
	 */
	public void setHostNo(int hostNo) {
		this.hostNo = hostNo;
	}

	/**
	 * String houseType : 집의 종류
	 * 
	 * @return
	 */
	public String getHouseType() {
		return houseType;
	}

	/**
	 * String houseType : 집의 종류
	 * 
	 * @param
	 */
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	/**
	 * String roomType : 방의 종류
	 * 
	 * @return
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * String roomType : 방의 종류
	 * 
	 * @param roomType
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @return
	 */
	public int getHouseCapacity() {
		return houseCapacity;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @param
	 */
	public void setHouseCapacity(int houseCapacity) {
		this.houseCapacity = houseCapacity;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @return
	 */
	public int getHouseRoom() {
		return houseRoom;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @param
	 */
	public void setHouseRoom(int houseRoom) {
		this.houseRoom = houseRoom;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @return
	 */
	public int getHouseBed() {
		return houseBed;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @param
	 */
	public void setHouseBed(int houseBed) {
		this.houseBed = houseBed;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @return
	 */
	public int getHouseBath() {
		return houseBath;
	}

	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * 
	 * @param
	 */
	public void setHouseBath(int houseBath) {
		this.houseBath = houseBath;
	}

	public String getHouseDetail() {
		return houseDetail;
	}

	public void setHouseDetail(String houseDetail) {
		this.houseDetail = houseDetail;
	}

	@Override
	public String toString() {
		return "DetailVO [hostNo=" + hostNo + ", houseType=" + houseType + ", roomType=" + roomType + ", houseCapacity=" + houseCapacity + ", houseRoom=" + houseRoom + ", houseBed=" + houseBed + ", houseBath=" + houseBath + ", houseDetail=" + houseDetail + "]";
	}

}
