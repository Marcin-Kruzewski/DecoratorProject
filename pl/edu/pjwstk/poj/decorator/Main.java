package pl.edu.pjwstk.poj.decorator;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pjwstk.poj.decorator.model.ArmoryMaster;
import pl.edu.pjwstk.poj.decorator.model.Assasin;
import pl.edu.pjwstk.poj.decorator.model.Character;
import pl.edu.pjwstk.poj.decorator.model.Dwarf;
import pl.edu.pjwstk.poj.decorator.model.Elf;
import pl.edu.pjwstk.poj.decorator.model.Human;
import pl.edu.pjwstk.poj.decorator.model.Hunter;
import pl.edu.pjwstk.poj.decorator.model.Worrior;

public class Main {
	public static void main(String[] args) {
		List<Character> characters = new ArrayList<>();
		
		Character franek = new Worrior(new ArmoryMaster(new Human())); //mo¿emy dodaæ 2 profesje
		franek.setName("Zenek");
		System.out.println(franek.introduceCharacter());
		characters.add(franek);
		
		Character zenek = new Hunter(new Assasin(new Elf()));
		zenek.setName("Franek");
		System.out.println(zenek.introduceCharacter());
		characters.add(zenek);
		
		Character zbigox = new Dwarf();
		zbigox.setName("Zbogox");
		System.out.println(zbigox.introduceCharacter());
		characters.add(zbigox);
		
		for (Character c : characters){
			c.toFile();
		}
	}
}
