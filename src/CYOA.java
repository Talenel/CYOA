import java.util.Scanner;

public class CYOA {
	
	public static void main(String[] args)
	{
		Scanner player = new Scanner(System.in);
		
		System.out.print("It is a dark and stormy night. You are sleeping when suddenly you are awakened. \n"
	+ "Your hairs rise up as you feel lightning crash down from above outside your house. Your eyes are momemtairly blinded\n"
	+ "by the bight light from your window. You blink repeatedly to clear your vision. Suddenly, you hear a loud thudding noise\n"
	+ "from the lower floor as if someone was knocking on the door trying to get in.  You are still quite tired though.\n"
	+ "The sound may have just been a tree branch banging against the house and that's not something to worry about at 2\n"
	+ "in the morning as a quick glance at the clock tells you. Do you 'get up' and try to determine what the sound was?\n"
	+ "Or do you go back to 'sleep' ignoring the silly thoughts running through you head, telling you that now might not\n"
	+ "be the best time for sleep?");
		if(player.nextLine().equals("sleep"))
		{
			System.out.print("You feel no urgent need to leave your bed.  There is no way you will get out of bed for a tree\n"
			+ "and even if it was a person, why would they be at you house at this obscene hour.  There is no way it could\n"
			+ "be HIM. No, no.  You'll just peacefully continue to sleep.  That's the wise thing to do.\n"
			+ "You can see something there in the dark of the room.  A mishappen blob that slowly resolves itself to a\n"
			+ "more and more human-like figure.  A face slowly coming into focus from the shadows.  Just a second more\n"
			+ "and you'll recognize it--....With a loud creak, your eyes fly open.  Your body is sweating and you feel as\n"
			+ "if you were on the verge of something important.  Another creak from the hall causes a catch\n"
			+ "in your breath. Do you leave the comfort of your bed to 'investigate' the cold foreboding and ominous hallway\n"
			+ "Or do you deny the possibility of danger and the looming threat to 'stay' in bed?");	
			
			if(player.nextLine().equals("stay"))
			{
				System.out.println("You"
						
						
						);
				
				
				
				
				
				if(player.nextLine().equals("bed"))
				{
					System.out.println("");
					
				}
				if(player.nextLine().equals("closet"))
				{
					System.out.println("");
					
				}
				
			
				
				
				
				
			}
			if(player.nextLine().equals("investigate"))
			{
				
				System.out.println("");
				
				if(player.nextLine().equals("follow"))
				{
					System.out.println("");
					
				}
				if(player.nextLine().equals("phone"))
				{
					
					System.out.println("");
				}
				
			}
			
			
			
		}
		if(player.nextLine().equals("get up"))
		{
			
			System.out.println("");
			
			if(player.nextLine().equals("open"))
			{
				System.out.println("");
				
				
				
				if(player.nextLine().equals("street"))
				{
					
					System.out.println("");
				}
				if(player.nextLine().equals("inside"))
				{
					
					System.out.println("");
				}
				
			}
			if(player.nextLine().equals("don't"))
			{

				System.out.println("");
				
				if(player.nextLine().equals("eat"))
				{
					System.out.println("");
					
				}
				if(player.nextLine().equals("stairs"))
				{
					System.out.println("");
					
				}
				
			}
			
		}		
				
				
				
				
				
				
				
		
		
		
	}

}
