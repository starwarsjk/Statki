package pl.kielce.tu.kronos.database;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * <pre>
 * @author Patryk Olesi�ski
 * @author Mateusz Nalepa
 *</pre>
 */
public class HighScores implements Serializable {
	ArrayList<HighScore> hsArray;

	public HighScores() {
		hsArray = new ArrayList<HighScore>();
	}

	public ArrayList<HighScore> getHsArray() {
		return hsArray;
	}

	public void setHsArray(ArrayList<HighScore> hsTab) {
		this.hsArray = hsTab;
	}

}
