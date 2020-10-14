import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTestUC3 {

	private NewMoodAnalyser analyser;

	//Testing for Sad case
	@Test
	public void message_WhenSad_MustReturn_Sad() {
		analyser = new NewMoodAnalyser("I am a SAD Person");
		try {
			ExpectedException exceptionRule=ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			Assert.assertEquals("SAD", analyser.analyzeMessage());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	//Testing for other case
	@Test
	public void message_WhenNotSad_MustReturn_Happy() {
		analyser = new NewMoodAnalyser("I am a Happy Person");
		try {
			ExpectedException exceptionRule=ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			Assert.assertEquals("HAPPY", analyser.analyzeMessage());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	//Testing when Null is passed
	@Test
	public void message_WhenNull_MustThrowException() {
		analyser = new NewMoodAnalyser(null);
		try {
			ExpectedException exceptionRule=ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			Assert.assertEquals("HAPPY", analyser.analyzeMessage());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	//Testing for Empty
	@Test
	public void message_WhenEmpty_MustThrowException() {
		analyser = new NewMoodAnalyser("");
		try {
			ExpectedException exceptionRule=ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			Assert.assertEquals("EMPTY", analyser.analyzeMessage());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}
