public class NewMoodAnalyser {
	
	private String message;

	public NewMoodAnalyser() {}
	
	public NewMoodAnalyser(String message) {					//Refracted
		this.message = message;
	}
	
	public String analyzeMessage() throws MoodAnalysisException {
		try {												//try block used in UC2
			String lower_msg=message.toLowerCase();
			if (lower_msg.contains("sad")) {				//return sad when message contains sad
				return "SAD";
			}else if(lower_msg.contains("empty")) {
				throw new MoodAnalysisException("Empty Mood Error");
			}else {
				return "HAPPY";								//return happy otherwise
			}
		}catch(NullPointerException exception) {
			//throwing exception for null
			throw new MoodAnalysisException("Null Exception has Occured");
		}
	}
}
