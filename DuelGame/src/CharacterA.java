
public class CharacterA implements Dueler 
{
	private String name;
	private int hp;
	private String[] taunt = {"You don't stand a chance!" , "I'm going to beat you", "Hahaha you're going to lose"};
	private boolean loadedGun;
	
	public CharacterA () 
	{
		loadedGun = false;
	}
	
	public void taunt()
	{
		int randNum = (int)(Math.random()*2)+1;
		System.out.println(taunt[randNum]);
	}
	
	public String getName()
	{
		name = "Areej";
		return name;
	}
	
	public void setStartingHP(int hp)
	{
		this.hp = hp;
	}
	
	public int getHP()
	{
		return this.hp;
	}

	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		if (d.getHP() == target)
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	public int getAction(Object caller)
	{
		if(caller instanceof Duel)
		{
			if(loadedGun == true && Math.random() < .5) 
			{
				loadedGun = false;
				return Duel.SHOOTING;
			}
			else 
			{
				if(!loadedGun && Math.random() < .4) 
				{
					loadedGun = true;
					return Duel.LOADING;
				}
				
				else
				{
					return Duel.GUARDING;
				}
			}
		}
		else 
		{
			return Duel.YEAH_RIGHT;
		}
	}
		public void hit(Object caller)
		{
			if(caller instanceof Duel)
			{
				this.hp = this.hp - 10;
			}
		}
	
}

