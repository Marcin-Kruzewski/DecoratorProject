package pl.snowball.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class Dwarf extends Character {
	
	private List<String> raceSkills = new ArrayList<>();
	
	public Dwarf() {
		init();
	}

	private void init() {
		raceSkills.add("Widzenie w ciemno�ci");
		raceSkills.add("Super wytrzyma�o��");
	}
	
	@Override
	public List<String> getSkills() {
		return getRaceSkills();
	}
	
	public List<String> getRaceSkills() {
		return raceSkills;
	}
}