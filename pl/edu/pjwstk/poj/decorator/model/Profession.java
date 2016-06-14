package pl.snowball.decorator.model;

import java.util.List;

public abstract class Profession extends Character {
	protected Character character;
	
	public Profession(Character character) {
		this.character = character;
	}
	
	@Override
	public List<String> getSkills() {
		return character.getSkills();
	}
}
