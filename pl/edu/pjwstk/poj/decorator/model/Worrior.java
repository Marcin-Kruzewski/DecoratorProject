package pl.edu.pjwstk.poj.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class Worrior extends Profession {
	
	private List<String> professionSkills = new ArrayList<>();
	
	public Worrior(Character character) {
		super(character);
		init();
	}

	private void init() {
		if (!professionSkills.contains("Walka wrêcz")){ 
			professionSkills.add("Walka wrêcz");
		}
		professionSkills.add("Walka mieczem");
		professionSkills.add("Walka toporem");
		professionSkills.add("Walka w³óczni¹");
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
