package member;

/**
 * @author son
 * 
 * email : Primary Key|| normal case : email, facebook : code
 * no : 번호
 * password: 비번 페북일시 null
 * name : 이름(중복가능)
 * fb : 페북일시 Y 아닐시 null
 *
 */
public class MemberVO {
	private String email;
	private int no;
	private String password;
	private String name;
	private String fb;

	public MemberVO() {
		super();
	}

	public MemberVO(String email, String password, String name, String fb) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.fb = fb;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

	@Override
	public String toString() {
		return "MemberVO [email=" + email + ", no=" + no + ", password=" + password + ", name=" + name + ", fb=" + fb + "]";
	}
	
	
}