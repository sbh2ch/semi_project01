package preview;

import java.util.Date;

public class FindVO
{
	private String myEmail;
	private String destAddr;
	private String departDate;
	private String destDate;
	private String findCapacity;
	// Preview 출신
	private int hostNo;
	private Date regDate;
	private String imgPath;
	private String imgRealName;
	private String houseDesc;
	private int houseCost;
	// Location 출신
	private String addr;
	private String xPoint;
	private String yPoint;
	
	public int getHostNo()
	{
		return hostNo;
	}
	public void setHostNo(int hostNo)
	{
		this.hostNo = hostNo;
	}
	public Date getRegDate()
	{
		return regDate;
	}
	public void setRegDate(Date regDate)
	{
		this.regDate = regDate;
	}
	public String getImgPath()
	{
		return imgPath;
	}
	public void setImgPath(String imgPath)
	{
		this.imgPath = imgPath;
	}
	public String getImgRealName()
	{
		return imgRealName;
	}
	public void setImgRealName(String imgRealName)
	{
		this.imgRealName = imgRealName;
	}
	public String getHouseDesc()
	{
		return houseDesc;
	}
	public void setHouseDesc(String houseDesc)
	{
		this.houseDesc = houseDesc;
	}
	public int getHouseCost()
	{
		return houseCost;
	}
	public void setHouseCost(int houseCost)
	{
		this.houseCost = houseCost;
	}
	public String getAddr()
	{
		return addr;
	}
	public void setAddr(String addr)
	{
		this.addr = addr;
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
	public String getMyEmail()
	{
		return myEmail;
	}
	public void setMyEmail(String myEmail)
	{
		this.myEmail = myEmail;
	}
	public String getDestAddr()
	{
		return destAddr;
	}
	public void setDestAddr(String destAddr)
	{
		this.destAddr = destAddr;
	}
	public String getDepartDate()
	{
		return departDate;
	}
	public void setDepartDate(String departDate)
	{
		this.departDate = departDate;
	}
	public String getDestDate()
	{
		return destDate;
	}
	public void setDestDate(String destDate)
	{
		this.destDate = destDate;
	}
	public String getFindCapacity()
	{
		return findCapacity;
	}
	public void setFindCapacity(String findCapacity)
	{
		this.findCapacity = findCapacity;
	}
}
