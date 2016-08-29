package location;

public class LocationVO
{
	/**
	 * 	LocationVO 변수 목록.
	 * 	no 			= 호스팅한 게시글의 번호. 이 번호로 연동된 데이터들을 조회.
	 * 	nation 		= 국가명
	 * 	addr		= 대략적인 주소 (ex: 서울시 종로구....)
	 * 	detailAddr	= 유저가 직접 입력하게 되는 상세 주소 (ex:은마아파트 503동 301호...)
	 * 	zipCode		= 우편번호 
	 * 	xPoint		= 지도의 마커 위치를 표시할 X 좌표.
	 * 	yPoint		= 지도의 마커 위치를 표시할 Y 좌표.
	 */
	private int hostNo;
	private String nation;
	private String addr;
	private String detailAddr;
	private String zipCode;
	private String xPoint;
	private String yPoint;
	
	public LocationVO(){}
	public LocationVO(int hostNo, String nation, String addr, String detailAddr, String zipCode, String xPoint, String yPoint)
	{
		this.hostNo = hostNo;
		this.nation = nation;
		this.addr = addr;
		this.detailAddr = detailAddr;
		this.zipCode = zipCode;
		this.xPoint = xPoint;
		this.yPoint = yPoint;		
	}
	
	public int getHostNo()
	{
		return hostNo;
	}
	public void setHostNo(int hostNo)
	{
		this.hostNo = hostNo;
	}
	public String getNation()
	{
		return nation;
	}
	public void setNation(String nation)
	{
		this.nation = nation;
	}
	public String getAddr()
	{
		return addr;
	}
	public void setAddr(String addr)
	{
		this.addr = addr;
	}
	public String getDetailAddr()
	{
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr)
	{
		this.detailAddr = detailAddr;
	}
	public String getZipCode()
	{
		return zipCode;
	}
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	public String getxPoint()
	{
		return xPoint;
	}
	public void setxPoint(String xPoint)
	{
		this.xPoint = xPoint;
	}
	public String getyPoint()
	{
		return yPoint;
	}
	public void setyPoint(String yPoint)
	{
		this.yPoint = yPoint;
	}	
}
