package global.sesoc.web6.vo;

/**
 * 회원 정보 VO
 */
public class Member {
	private String id;					//회원ID
	private String password;			//비밀번호
	private String name;				//이름
	private String phone;				//전화번호
	private String address;				//주소
	private String email;				//이메일주소
	
	//디폴트생성자 
	public Member() {
	}
	
	//이건 생성자이다
	public Member(String id, String password, String name, String phone, String address, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	//각 멤버변수 get, set메서드 만들기
	//int변수인 id에 접근해 값을 지정하는 public getid 메서드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", address="
				+ address + ", email=" + email + "]";
	}
}
