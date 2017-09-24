
public class CharacterB implements Dueler
{
	private String name;
	private int hp;
	private String[] taunt = {"Who'll win? I'LL WIN!!"};
	
	public CharacterB () {}
	
	public void  taunt()
	{
		System.out.println(taunt[1]);
	}
	
	public String getName()
	{
		name = "Vickie";
		return name;
	}
	
	public void setStartingHP(int hp)
	{
		this.hp = hp;
	}
	
	public int getHP()
	{
		return hp;
	}

	
}
