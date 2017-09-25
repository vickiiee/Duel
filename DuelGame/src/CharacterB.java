
public class CharacterB implements Dueler
{
	private String name;
	private int hp;
	private String[] taunt = {"Who'll win? I'LL WIN!!", "The champion is here!!!", "Hahahahahahahahahaaaaa, Do you really think you'll be the winner"};
	
	public CharacterB () {}
	
	public void  taunt()
	{
		int randNum = (int)Math.random()*2;
		System.out.println(taunt[randNum]);
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
