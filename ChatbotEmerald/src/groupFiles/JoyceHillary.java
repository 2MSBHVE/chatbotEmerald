package groupFiles;

public class JoyceHillary implements Chatbot{

	private static String[] choose;
	private static String[] trig0 = {""};
	private static String[] trig5 = {""};
	private static String[] trigMore = {""};
	
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub
		
	}
	public String talk(int trigLevel){
		if (trigLevel == 0){
			choose = trig0;
		}
		else if (trigLevel >=5 && trigLevel <10){
			choose = trig5;
		}
		else if (trigLevel >=10){
			choose = trigMore;
		}
			return MaxMain.chooseFromStringArray(choose);
	}
	
	@Override
	public boolean isTriggered(String userInput) {
		if (MaxMain.findKeyword(userInput, "hillary", 0)>=0){
		return true;
		}
		
		return false;
		
	}

}
