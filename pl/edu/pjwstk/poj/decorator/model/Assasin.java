package pl.edu.pjwstk.poj.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class Assasin extends Profession {
	
	private List<String> professionSkills = new ArrayList<>();
	
	public Assasin(Character character) {
		super(character);
		init();
	}

	private void init() {
		if (!professionSkills.contains("Skradanie")){ 
			professionSkills.add("Skradanie");
		}
		if (!professionSkills.contains("Walka wr�cz")){ 
			professionSkills.add("Walka wr�cz");
		}
		professionSkills.add("Trucizny");
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