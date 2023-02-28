package Java_서울_06_송윤제;

public class User {
	
	// 매개변수 입력
	private int userSeq;
	private String userId;
	private String password;
	private String userName;
	private String nickName;
	private String email;
	
	// 기본 생성자 
	public User() {
		
	}
	
	
	// 매개변수 받는 생성자
	public User(int userSeq, String userId, String password, String userName, String nickName, String email) {
		super();
		this.userSeq = userSeq;
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.nickName = nickName;
		this.email = email;
	}
	
	
	// 접근자와 설정자
	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// toString 메소드
	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", userId=" + userId + ", password=" + password + ", userName=" + userName
				+ ", nickName=" + nickName + ", email=" + email + "]";
	}
	

}
