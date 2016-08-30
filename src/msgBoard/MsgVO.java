package msgBoard;

import java.io.Serializable;
import java.util.Date;

public class MsgVO implements Serializable {
	private int no;
	private String sender;
	private String addressee;
	private String messege;

	public MsgVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MsgVO(String sender, String messege, String addressee) {
		super();
		this.sender = sender;
		this.addressee = addressee;
		this.messege = messege;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSander() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public String geMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

}
