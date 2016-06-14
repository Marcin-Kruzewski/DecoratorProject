package pl.snowball.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class ArmoryMaster extends Profession {
	
	private List<String> professionSkills = new ArrayList<>();
	
	public ArmoryMaster(Character character) {
		super(character);
		init();
	}

	private void init() {
		professionSkills.add("Naprawa ekwipunku");
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