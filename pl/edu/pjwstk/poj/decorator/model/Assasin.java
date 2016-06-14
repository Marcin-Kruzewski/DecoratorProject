package pl.snowball.decorator.model;

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
		professionSkills.add("Eliksiry");
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