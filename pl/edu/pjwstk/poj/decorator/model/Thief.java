package pl.edu.pjwstk.poj.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class Thief extends Character {
	
	private List<String> raceSkills = new ArrayList<>();
	
	public Thief() {
		init();
	}

	private void init() {
		raceSkills.add("Latanie");
		raceSkills.add("Wra¿liwy na obra¿enia");
	}
	
	@Override
	public List<String> getSkills() {
		return getRaceSkills();
	}
	
	public List<String> getRaceSkills() {
		return raceSkills;
	}
}
