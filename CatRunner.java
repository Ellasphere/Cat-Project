import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat("Blake", 6, "Ella");
		blake.setName("Blake");
		blake.setAge(6);
		blake.setOwner("Ella");
		blake.eat("cat food");
		
		Lion leo = new Lion(Color.YELLOW);
		//leo.setName("Leo");
		//leo.setManeColor();
		leo.roar("roared");
	}	
}