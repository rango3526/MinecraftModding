package animalProject;

public class animal {
	public String type;
	public String name; 
	public String breed;
	
	
	public animal() {
		type = "dog";
		name = "Thomas"; 
		breed = "Ugly Cat";
		
	}
	
	public animal(String n) {
		type = n;
		name = "Timothy"; 
		breed = "Cat in the hat";
		
	}
	
	public animal(String x, String y, String z) {
		type = x;
		name = y;
		breed = z;
		
	}
	
	public String getType() {
		
		return type;
		
	}
	
	public void setType() {
		
		//String name = ;
		
	}

}