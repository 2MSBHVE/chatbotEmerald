package groupFiles;

public class JoyceFlipFlop implements Chatbot{

	private static String[] topics = {"deportation", "muslim", "isis", "nuclear", "minimum wage", 
		"taxes", "guns"};
	private static boolean[] oneOrTwo = {false, false, false, false, false, false, false}; 
	private static String[] trumpOne = {"Deport all undocumented immigrants and build a wall.", "We need a total and complete shutdown of Muslims entering.", "I would "
			+ "bomb the hell out of them and then go in.", "I would like everybody to end it, just get rid of it, but I would certainly not do first strike.", "I am "
					+ "looking at it, and I haven't decided in terms of numbers. But people have to get more", "I would take carried interest out, and I would let people "
							+ "making hundreds of millions of dollars a year pay some tax, because right now they are paying very little tax and I think it's outrageous.", "I'm not advocating guns in the classroom. "
									+ "I don't want to have guns in the classroom."};
	private static String[] trumpTwo = {"I'm open to softening laws to help immigrants living in America.", "We have a serious problem, and it's a temporary ban -"
			+ " it hasn't been called for yet, nobody's done it, this is just a suggestion until we find out what's going on.", "I would bomb the hell out of those oil fields. "
					+ "I wouldn't send troops because you won't need them by the time I'm finished.", "We have to be prepared. I can't take anything off the table.", "I would not raise it."
							+ " I think that states should really call the shot.", "I said that I may have to increase on the wealthy — I'm not going to allow it to be increased on "
									+ "the middle class — now, if I increase it on the wealthy, that means they're still going to be paying less than they're paying now. I'm not increasing it from this point.", 
									"Trained teachers should be able to have guns in the classroom."};
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void talk(String userTyped) {
		boolean asked = false;
		int idx = 0;
		for (int i = 0; i<topics.length;i++) {
			if (MaxMain.findKeyword(userTyped, topics[i] , 0)>=0){
				asked = true;
				idx = i;
			}
		}
		if (asked == true){
			if (oneOrTwo[idx] == true){
				oneOrTwo[idx] = false;
				MaxMain.printwrap(trumpOne[idx]);
			}
			else{
				oneOrTwo[idx] = true;
				MaxMain.printwrap(trumpTwo[idx]);
			}	
		}
		else{
			MaxMain.printwrap("On what??");
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		if (MaxMain.findKeyword(userInput, "policy", 0) >= 0 || MaxMain.findKeyword(userInput, "policies", 0) >= 0 ){
			return true;
		}
		return false;
	}

	@Override
	public void talk(int count) {
		// TODO Auto-generated method stub
		
	}

	
}
