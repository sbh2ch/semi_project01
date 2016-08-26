package detail;

public class DetailVO
{
	/**
	 * DetailVO 변수 목록.
	 * 
	 */
	private int no;
	private String houseType;
	private String roomType;
	private boolean hostState;
	private int houseCapacity;
	private int houseRoom;
	private int houseBed;
	private int houseBath;
	private String houseDetail;
	
	public String getHouseDetail() {
		return houseDetail;
	}
	public void setHouseDetail(String houseDetail) {
		this.houseDetail = houseDetail;
	}
	public DetailVO(int no, String houseType, String roomType, boolean hostState, int houseCapacity, int houseRoom,
			int houseBed, int houseBath, String houseDetail) {
		super();
		this.no = no;
		this.houseType = houseType;
		this.roomType = roomType;
		this.hostState = hostState;
		this.houseCapacity = houseCapacity;
		this.houseRoom = houseRoom;
		this.houseBed = houseBed;
		this.houseBath = houseBath;
		this.houseDetail = houseDetail;
	}
	public DetailVO(){}
	/**
	 * int 호스팅번호, String 집종류, String 방종류, boolean 예약여부, int 수용인원, int 방갯수, int 침대갯수, int 욕실갯수 순서...
	 * @param no
	 * @param houseType
	 * @param roomType
	 * @param hostState : DB상에는 0,1 혹은 1,2 같은 2개의 숫자로 true, false 구분해줄것
	 * @param houseCapacity
	 * @param houseRoom
	 * @param houseBed
	 * @param houseBath
	 */
	public DetailVO(int no, String houseType, String roomType, 
			boolean hostState, int houseCapacity, int houseRoom, int houseBed, int houseBath)
	{
		this.no = no;
		this.houseType = houseType;
		this.roomType = roomType;
		this.hostState = hostState;
		this.houseCapacity = houseCapacity;
		this.houseRoom = houseRoom;
		this.houseBed = houseBed;
		this.houseBath = houseBath;
	}
	
	/** 
	 * int no : 호스팅 번호로 각종 데이터 조회
	 * @return 
	 */
	public int getNo()
	{
		return no;
	}
	/**
	 * int no : 호스팅 번호로 각종 데이터 조회
	 * @param 
	 */
	public void setNo(int no)
	{
		this.no = no;
	}
	/**
	 * String houseType : 집의 종류
	 * @return
	 */
	public String getHouseType()
	{
		return houseType;
	}
	/**
	 * String houseType : 집의 종류
	 * @param
	 */
	public void setHouseType(String houseType)
	{
		this.houseType = houseType;
	}
	/**
	 * String roomType : 방의 종류
	 * @return
	 */
	public String getRoomType()
	{
		return roomType;
	}
	/**
	 * String roomType : 방의 종류
	 * @param roomType
	 */
	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}
	/**
	 * boolean hostState : 현재 호스팅 게시물이 누군가에게 예약되었는가를 나타내는 bool형 변수.
	 * DB 상에는 0, 1 혹은 1, 2 로 구분하여 true, false 를 나타내 주도록 하자.
	 * @return
	 */
	public boolean isHostState()
	{
		return hostState;
	}
	/**
	 * boolean hostState : 현재 호스팅 게시물이 누군가에게 예약되었는가를 나타내는 bool형 변수.
	 * DB 상에는 0, 1 혹은 1, 2 로 구분하여 true, false 를 나타내 주도록 하자.
	 * @param
	 */
	public void setHostState(boolean hostState)
	{
		this.hostState = hostState;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @return
	 */
	public int getHouseCapacity()
	{
		return houseCapacity;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @param
	 */
	public void setHouseCapacity(int houseCapacity)
	{
		this.houseCapacity = houseCapacity;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @return
	 */
	public int getHouseRoom()
	{
		return houseRoom;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @param
	 */
	public void setHouseRoom(int houseRoom)
	{
		this.houseRoom = houseRoom;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @return
	 */
	public int getHouseBed()
	{
		return houseBed;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @param
	 */
	public void setHouseBed(int houseBed)
	{
		this.houseBed = houseBed;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @return
	 */
	public int getHouseBath()
	{
		return houseBath;
	}
	/**
	 * 모두 int 형으로서 집에 딸려있는 침실, 욕실 개수등을 나타낸다.
	 * @param
	 */
	public void setHouseBath(int houseBath)
	{
		this.houseBath = houseBath;
	}	
	
	
}
