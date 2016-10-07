package groupFiles;

public class MaxFightBack implements Chatbot {

	private String[] comebacks = {
			"I know you are, but what am I?",
			"I have seven billion ****ing dollars in the bank and you don't.",
			"At least I'm not an idiot like you who pays taxes!",
			"Wrong.",
			"I believe that was aimed at Bill Clinton.",
			"Sure you're not talking about yourself?",
			"No, no, no, that's the other party's nominee you're talking about.",
			"Your words can't hurt me, cause my words are better.",
			"I CAN'T HEAR YOU!     *sticks out tongue*  "
			};
	
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
		MaxMain.printwrap(MaxMain.chooseFromStringArray(comebacks));
		
	}

	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub1
		
	}

	@Override
	public boolean isTriggered(String userInput) {
		String triggers[] = {
				"stupid",
				"dumb",
				"dumbass",
				"fuck",
				"fake",
				"orange",
				"baby",
				"idiot",
				"deplorable",
				"bigot",
				"racist",
				"disgusting",
				"immature",
				"misogynist",
				"misogynistic"
				};
		
		for (int i = 0; i < triggers.length; i++){
			if (MaxMain.findKeyword(userInput, triggers[i], 0) >= 0){
				return true;
			}
		}
		return false;
	}

	@Override
	public void talk(int count) {
		// TODO Auto-generated method stub
		return;
	}

}
