package pl.snowball.decorator.model;

/* Double "z" in name Wizzard is the form of tribute for Sir Terry Pratchett and created by him Disc World */

import java.util.ArrayList;
import java.util.List;

public class Wizzard extends Profession {
	
	private List<String> professionSkills = new ArrayList<>();
	
	public Wizzard(Character character) {
		super(character);
		init();
	}

	private void init() {
		professionSkills.add("Czarowanie");
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
