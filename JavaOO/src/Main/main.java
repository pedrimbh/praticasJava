package Main;

public class main {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.method();
		
		Person person = new Person("Joao", 27,"");
		System.out.println(person.walk("I' walking.."));
		System.out.println(person.walk("I' polymorphism, walk method..", 2));
//		Person person2 = new Person();
//		
//		person.getName();
//		person2.name = "Mesquita";
//		
//		person2.age = 28;
//		person.name= "Joao";
//		person.age= 27;
		
//		person.say();
//		
//		System.out.println(Person.walk());
		
//		person.setCpf(" 134543232");
//		
//		Car car1 = new Car("blue", 220.00);
//		
//		car1.setColor("Blue");
//		car1.setTopSpeed(220.00);
//		car1.setShift(5);
//		
//		CarComposition carComposition = new CarComposition();
//		
//		carComposition.getVechicle().setColor("Red");
//		
//		System.out.println("Color car: " + carComposition.getVechicle().getColor());
//		System.out.println("TopSpeed car: " + car1.getTopSpeed()+ " ....Test " + "/ Shifts " + car1.getShifits());		
//		System.out.println("Hello Word " + person.getName() + person.getCpf()  );
	}
	
}
