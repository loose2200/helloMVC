package model;

public class Customer {


		private String id;
		private String name;
		private String email;// 생성 후 우클릭하여 source > Generate constructor using fields 전부 체크 후 OK
		
	public Customer(String id, String name, String email) {
		this. id = id;
		this.name = name;
		this.email = email;//우클릭하여 source generate getter and setters 전부체크(안만들어질수도있음) , 롬복 설치
	//helloMVC 우클릭 configure> convert to Maven Project > finish
	//하단에 dependencies 우클릭 후 lombok 검색하여 org.projectlombok lombok 1.16.6추가 후 save
	 
	
	 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
