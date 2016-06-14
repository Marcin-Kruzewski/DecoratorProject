package pl.edu.pjwstk.poj.decorator;

import java.util.ArrayList;
import java.util.List;

public class Elf extends Character {
	
	private List<String> raceSkills = new ArrayList<>();
	
	public Elf() {
		init();
	}

	private void init() {
		raceSkills.add("Widzenie w ciemno�ci");
		raceSkills.add("Super zr�czno��");
	}
	
	@Override
	public List<String> getSkills() {
		return getRaceSkills();
	}
	
	public List<String> getRaceSkills() {
		return raceSkills;
	}
}
