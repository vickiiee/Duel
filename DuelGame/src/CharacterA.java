
public class CharacterA implements Dueler 
{
	private String name;
	private int hp;
	private String[] taunt = {"You don't stand a chance!"};

	
	public CharacterA () {}
	
	public void taunt() {
		
		System.out.println(taunt[0]);
	}
	
	public String getName()
	{
		name = "Me";
		return name;
	}
	
	public void setStartingHP(int h) {
		
		hp = 100;
		return hp;
	}
	
	public int getHP() {
		
		return hp;
	}
}

