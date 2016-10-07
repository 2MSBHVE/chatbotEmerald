package groupFiles;

public class JoyceHillary implements Chatbot{

	private static String[] choose;
	private static int pressConference = (int)(Math.random()*300+200); 
	//private static String press = "Day" + pressConference + ": No press conference. And no press outrage.";
	/*private static String[] trig0 = {"Zero"};
	private static String[] trig5 = {"Five"};
	private static String[] trigMore = {"More"};*/
	private static String[] trig0 = {"I am getting great credit for my press conference today. Crooked Hillary should be admonished for not having a press conference in 179 days.", };
	private static String[] trig5 = {"Even a race to Obama, she was gonna beat Obama. I don't know who would be worse, I don't know, "
			+ "how could it be worse? But she was going to beat -- she was favored to win -- and she got schlonged, she lost, I mean she lost", };
	private static String[] trigMore = {"If Hillary can't satisfy her husband, what makes her think she can satisfy America?", "Her? I know where she is. It's disgusting, I don't want to talk about it."
			+ "No, it's too disgusting. Don't say it, it's disgusting, let's not talk about it."};
	
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub
		
	}
	public void talk(int trigLevel){
		//MaxMain.printInt(trigLevel);
		if (trigLevel%2 == 0){
			if (trigLevel == 0){
			choose = trig0;
			}
			else if (trigLevel >=5 && trigLevel <10){
				choose = trig5;
			}
			else if (trigLevel >=10){
				choose = trigMore;
			}
				MaxMain.printwrap(MaxMain.chooseFromStringArray(choose));
		}
		else {
			pressConference = pressConference+1; 
			String press = "Day " + pressConference + ": No press conference. And no press outrage.";
			MaxMain.printwrap(press);
		}	
	}
	
	public boolean isTriggered(String userInput) {
		if (MaxMain.findKeyword(userInput, "hillary", 0) >= 0){
			return true;
		}
		return false;
	}

}
