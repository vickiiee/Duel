
public class CharacterB implements Dueler
{
	private String name;
	private int hp;
	private String[] taunt = {"The champion is here!!!", "Who'll win? I'LL WIN!!", "Hahahahahahahahahaaaaa, Do you really think you'll be the winner"};
	
	public CharacterB () {}
	
	public void taunt()
	{
		int randNum = (int)(Math.random()*2)+1;
		System.out.println(taunt[randNum]);
	}
	
	public String getName()
	{
		name = "Vickie";
		return name;
	}
	
	public void setStartingHP(int hp)
	{
		System.out.println(hp);
	}
	
	public int getHP()
	{
		return this.hp;
	}


	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		if (d.getHP() == target)
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	public int getAction(Object caller)
	{
		if(caller instanceof Duel)
		{
		
			
			if(loadedGun == true && Math.random() < .5) {
				
				loadedGun = false;
				return Duel.SHOOTING;
			}
			
			if(!loadedGun && Math.random() < .5) {
				
				loadedGun = true;
				return Duel.LOADING;
			}
			else
			{
				return Duel.GUARDING;
			}
		}
		
		else {
			return Duel.YEAH_RIGHT;
		}
	}
	
	
}