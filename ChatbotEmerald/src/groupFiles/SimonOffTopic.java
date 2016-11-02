package groupFiles;

public class SimonOffTopic implements Chatbot {
	private String toPrint;
	private boolean inOffTopicLoop = true;
	private String userResponse;
	private String userR;
	private int offTopic = 0;
	private String firstPrompt = "We're gonna make America great again!  Want to know how?";
	public int mexicount = 0;
	// private int offTopicCount0 = 0;
	// private int offTopicCount1 = 0;
	// private int offTopicCount2 = 0;
	// private int offTopicCount3 = 0;
	// private int offTopicCount4 = 0;
	// private int offTopicCount5 = 0;
	// private int offTopicCount6 = 0;
	// private int offTopicCount7 = 0;
	// private int offTopicCount8 = 0;

	private int[] offTopicCounts = new int[7];

	public void talk() {

		String[] offTopicResponses = {

				(String) ("We're going to do so much winning"
						+ MaxMain.multiplyWord(", believe me", offTopicCounts[0], false, false)),
				(String) ("I'll ask Putin" + MaxMain.multiplyWord(", believe me", offTopicCounts[1], false, false)),
				(String) ("I cant talk about it, I'm under audit"
						+ MaxMain.multiplyWord(", believe me", offTopicCounts[2], false, false)),
				(String) ("I know alot of words, I know the best words"
						+ MaxMain.multiplyWord(", believe me", offTopicCounts[3], false, false)),
				(String) ("We need to fix this rigged system"
						+ MaxMain.multiplyWord(", believe me", offTopicCounts[4], false, false)),
				(String) ("we're going to make the best plan you've ever seen"
						+ MaxMain.multiplyWord(", believe me", offTopicCounts[5], false, false)),
				(String) ("I have the best people, the best"
						+ MaxMain.multiplyWord(", believe me", offTopicCounts[6], false, false))

		};

		String[] offTopicMexico1 = { "Nobody has more respect for Mexico than me", "the Mexicans love me" };
		String[] offTopicMexico2 = { "We're going to build a wall", "Mexico is gonna pay for it" };
		String[] offTopicMexico3 = { "We have some bad hombres here and we need to get them out",
				"The wall just got 10 feet higher" };
		if (aboutMexico(userR)) {
			if (mexicount == 1) {
				toPrint = MaxMain.chooseFromStringArray(offTopicMexico1);
			} else if (mexicount == 2) {
				toPrint = MaxMain.chooseFromStringArray(offTopicMexico2);
			} else if (mexicount == 3) {
				toPrint = MaxMain.chooseFromStringArray(offTopicMexico3);
			}
		} else {
			toPrint = MaxMain.chooseFromStringArray(offTopicResponses);

			for (int i = 0; i < offTopicResponses.length; i++) {

				if (toPrint.equals(offTopicResponses[i])) {
					offTopicCounts[i]++;
				}
			}

		}
		MaxMain.printwrap(toPrint);
	}

	public boolean isTriggered(String userInput) {
		userR = userInput;
		if (MaxMain.findKeyword(userInput, "how", 0) >= 0) {

			return true;

		}

		return false;
	}

	@Override
	public void talk(String userTyped) {
		// TODO Auto-generated method stub

	}

	@Override
	public void talk(int count) {
		// TODO Auto-generated method stub
		return;
	}

	public boolean aboutMexico(String userInput) {
		if (MaxMain.findKeyword(userInput, "Mexico", 0) >= 0 || MaxMain.findKeyword(userInput, "Mexican", 0) >= 0) {
			mexicount++;
			if (mexicount > 3) {
				mexicount = 3;
			}
			return true;
		} else {
			mexicount = 0;
			return false;
		}

	}
}
