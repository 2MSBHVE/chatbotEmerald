package groupFiles;

public abstract class MaxChangeMainPrompt implements Chatbot {
	
	private static String[] generics = {
			"I've got time. Ask me another question.",
			"You got another question?",
			"Come on, let's keep this interview great. Ask away."
			};
	
	private static String[] untriggeredLevel1 = {
			"What'd ya say?",
			"What was that again?",
			"What?",
			"A bit louder?",
			"Speak up, my applause is too loud.",
			"I'm sure what you said is great, but I couldn't quite understand.",
			"I don't have to answer that.",
			"I couldn't quite hear you there, but my entire platform is on my website donaldjtrump.com"
			};
	private static String[] untriggeredLevel2 = {
			"You speak English?",
			"I have the best words and I can't understand you. "
			+ "That means it's your fault.",
			"This is getting annoying.",
			"Are you just here to waste my time?"
			};
	private static String[] untriggeredLevel3 = {
			"ENGLISH!",
			"SPEAK ENGLISH!",
			"People like you are what's wrong with America. I'm sending all of you back to your country."
			};
	
	public static String talk (int triggerLevel, String userName){
		if (triggerLevel == 0){
			return (String)(MaxMain.chooseFromStringArray(generics));
		}
		else if (triggerLevel <= 3){
			return (String)(MaxMain.chooseFromStringArray(untriggeredLevel1));
		}
		
		else if (triggerLevel <= 6){
			return (String)(MaxMain.chooseFromStringArray(untriggeredLevel2));
		}
		
		else {
			return (String)(MaxMain.chooseFromStringArray(untriggeredLevel3));
		}
	}
	
}
