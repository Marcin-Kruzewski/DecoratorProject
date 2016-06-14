package pl.edu.pjwstk.poj.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class Human extends Character {
	
	private List<String> raceSkills = new ArrayList<>();
	

	@Override
	public List<String> getSkills() {
		return getRaceSkills();
	}
	
	public List<String> getRaceSkills() {
		return raceSkills;
	}
}
