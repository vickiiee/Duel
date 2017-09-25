
public class CharacterB implements Dueler
{
	private String name;
	private int hp;
	private String[] taunt = {"The champion is here!!!", "Who'll win? I'LL WIN!!", "Hahahahahahahahahaaaaa, Do you really think you'll be the winner"};
	
	public CharacterB () {}
	
	public void  taunt()
	{
		//int randNum = (int)Math.random()*3;
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
