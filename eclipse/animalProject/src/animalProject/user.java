package animalProject;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal thing = new animal();
		animal otherthing = new animal("Buckey");
		animal newestthing = new animal("Cat", "Fluffy", "Siamese");
		
		System.out.println("The animal I bought was a " + thing.type + ".");
		System.out.println("The name of the empty constructor is " + thing.name + ".");
		System.out.println("The breed of the empty constructor is " + thing.breed + ".");
		
		System.out.println("");
		
		System.out.println("The other animal I bought was a " + otherthing.type + ".");
		System.out.println("The name of the other animal I bought was a " + otherthing.name + ".");
		System.out.println("The breed of the other animal I bought was a " + otherthing.breed + ".");
		
		System.out.println("");
		
		System.out.println("The last animal I bought was a " + newestthing.type + ".");
		System.out.println("The name of the last animal I bought was a " + newestthing.name + ".");
		System.out.println("The breed of the last animal I bought was a " + newestthing.breed + ".");
		
	}

}
