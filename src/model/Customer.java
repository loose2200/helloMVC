package model;

public class Customer {


		private String id;
		private String name;
		private String email;// ���� �� ��Ŭ���Ͽ� source > Generate constructor using fields ���� üũ �� OK
		
	public Customer(String id, String name, String email) {
		this. id = id;
		this.name = name;
		this.email = email;//��Ŭ���Ͽ� source generate getter and setters ����üũ(�ȸ��������������) , �Һ� ��ġ
	//helloMVC ��Ŭ�� configure> convert to Maven Project > finish
	//�ϴܿ� dependencies ��Ŭ�� �� lombok �˻��Ͽ� org.projectlombok lombok 1.16.6�߰� �� save
	 
	
	 
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
