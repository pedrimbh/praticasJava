package Main;

public class Person {
	private String name;
	private Integer age;
	private String cpf;
		
	public Person(String name, Integer age, String cpf) {
		
		this.name = name;
		this.age = age;
		this.cpf = cpf;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return this.age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
//	public void say() {
//		System.out.println("I'm saying something...");
//	}
//	public static String walk() {
//		return "I'm am walk";
//	}
}
