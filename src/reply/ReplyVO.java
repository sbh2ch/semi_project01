package reply;

import java.util.Date;

public class ReplyVO {
	private int no;
	private int hostNo;
	private String name;
	private String email;
	private String content;
	private Date regDate;
	
	
	public int getReplyNo() {
		return no;
	}
	public void setReplyNo(int replyNo) {
		this.no = replyNo;
	}
	public int getHostNo() {
		return hostNo;
	}
	public void setHostNo(int hostNo) {
		this.hostNo = hostNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
	
}
