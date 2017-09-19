
public class CharacterB implements Dueler
{
	private String name;
	private int hp;
	
	public CharacterB () {}
	
	public void  taunt()
	{
		/*String [] taunts = {"","",""};
		for (i = 0; i < taunts.length; i++)
		{
			return String
		}*/
	}
	
	public String getName()
	{
		name = "Vickie";
		return name;
	}
	
	public void setStartingHP(int hp)
	{
		this.hp-=10;
	}
	
	public int getHP()
	{
		return hp;
	}

	
}
