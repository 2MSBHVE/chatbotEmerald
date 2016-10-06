package groupFiles;

public class SimonOffTopic implements Chatbot {

	private boolean inOffTopicLoop = true;
	private String userResponse;
	private int offTopic = 0;
	private String firstPrompt = "We're gonna make America great again!  Want to know how?";
//	private int offTopicCount0 = 0;
//	private int offTopicCount1 = 0;
//	private int offTopicCount2 = 0;
//	private int offTopicCount3 = 0;
//	private int offTopicCount4 = 0;
//	private int offTopicCount5 = 0;
//	private int offTopicCount6 = 0;
//	private int offTopicCount7 = 0;
//	private int offTopicCount8 = 0;
	
	private int[] offTopicCounts = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	public void talk() {
		
		String[] offTopicResponses = {
				
				(String)("We're going to do so much winning" + MaxMain.multiplyWord(", believe me", offTopicCounts[0], false, false)),
				(String)("I'll ask Putin" + MaxMain.multiplyWord(", believe me", offTopicCounts[1], false, false)),
				(String)("I cant talk about it, I'm under audit" + MaxMain.multiplyWord(", believe me", offTopicCounts[2], false, false)),
				(String)("I know alot of words, I know the best words" + MaxMain.multiplyWord(", believe me", offTopicCounts[3], false, false)),
				(String)("We need to fix this rigged system"+ MaxMain.multiplyWord(", believe me", offTopicCounts[4], false, false)),
				(String)("We're going to make Mexico pay for it" + MaxMain.multiplyWord(", believe me", offTopicCounts[5], false, false)),
				(String)("The wall just got 10 feet higher" + MaxMain.multiplyWord(", believe me", offTopicCounts[6], false, false)),
				(String)("we're going to make the best plan you've ever seen"+ MaxMain.multiplyWord(", believe me", offTopicCounts[7], false, false)),
				(String)("I have the best people, the best" + MaxMain.multiplyWord(", believe me", offTopicCounts[8], false, false))
				
		};
		String toPrint = MaxMain.chooseFromStringArray(offTopicResponses);
		for(int i=0; i<offTopicResponses.length; i++){
			
		
			if(toPrint.equals(offTopicResponses[i])) {
				offTopicCounts[i]++;
			}
		}
		
		MaxMain.printwrap(toPrint);
	}

	public boolean isTriggered(String userInput) {

		if(MaxMain.findKeyword(userInput, "how", 0) >= 0){

			return true;

		}
		
		return false;
	}




	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String talk(int count) {
		// TODO Auto-generated method stub
		return null;
	}

}