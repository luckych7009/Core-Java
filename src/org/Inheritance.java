package org;
class Maruti{//we can say parent class or super class=====
	String Colour="Black";
	String Vehicle_type="Car";
	
}
 class Swift extends Maruti{//we can say it is a child class or sub class----
	 String Space="4 Seatear";
	 String Function="automatic";
	 String Features="off-road";
	 
 }
 class Swift_desire extends Swift{
	 String Model="VXI 8";
	 
 }
 class Brezza extends Maruti{
	 String Fuel_tank="10 litre petrol";
 }
 //Using multiple inheritance -------
interface animal_1{
	String Colour="Black";
}
interface animal_2{
	String weight="25 kg";
}
interface animal_3{
	String Height="3 feet";
}
class dog implements animal_1,animal_2,animal_3{
	String breed="Labrador";
}
 
public class Inheritance {
	public static void main(String[] args) {
	Maruti obj=new Maruti();
	Swift obj1=new Swift();
	Swift_desire obj2=new Swift_desire();
	Brezza obj3=new Brezza();
	dog obj4=new dog();
	
		System.out.println("Vehicle_type of car : "+obj.Vehicle_type);
		System.out.println("Space in Swift : "+obj1.Space);
		System.out.println("Colour of Swift : "+obj1.Colour); //Using single inheritance
		System.out.println("Model of Swift_desire : "+obj2.Model); //using multilevel inheritance
		System.out.println("Capacity of fuel_tank of Brezza : "+obj3.Fuel_tank);// using hierarchical inheritance
		System.out.println("Breed of the dog : "+obj4.breed);
		System.out.println("colour of the dog : "+obj4.Colour);
		System.out.println("weight of the dog : "+obj4.weight);
	}

}

