package pl.edu.pjwstk.poj.decorator;

import java.util.ArrayList;
import java.util.List;

public class Hunter extends Profession {
	
	private List<String> professionSkills = new ArrayList<>();
	
	public Hunter(Character character) {
		super(character);
		init();
	}

	private void init() {
		if (!professionSkills.contains("Skradanie")){ 
			professionSkills.add("Skradanie");
		}
		professionSkills.add("Strzelectwo");
	}
	
	@Override
	public List<String> getSkills() {
		List<String> allSkills = new ArrayList<>();
		allSkills.addAll(getRaceSkills());
		allSkills.addAll(professionSkills);
		return allSkills;
	}
	
	public List<String> getRaceSkills() {
		return character.getSkills();
	}
}