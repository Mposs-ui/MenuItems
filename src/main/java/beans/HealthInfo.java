package beans;

import javax.persistence.Embeddable;

@Embeddable
public class HealthInfo {

	private int calories;
	private int gramsFat;
	
	public HealthInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInfo(int calories, int gramsFat) {
		super();
		this.calories = calories;
		this.gramsFat = gramsFat;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getGramsFat() {
		return gramsFat;
	}

	public void setGramsFat(int gramsFat) {
		this.gramsFat = gramsFat;
	}

	@Override
	public String toString() {
		return "HealthInfo [calories=" + calories + ", gramsFat=" + gramsFat + "]";
	}
	
}
