package pl.edu.pjwstk.poj.decorator;

import java.util.ArrayList;
import java.util.List;

import pl.snowball.decorator.model.ArmoryMaster;
import pl.snowball.decorator.model.Assasin;
import pl.snowball.decorator.model.Character;
import pl.snowball.decorator.model.Dwarf;
import pl.snowball.decorator.model.Elf;
import pl.snowball.decorator.model.Human;
import pl.snowball.decorator.model.Hunter;
import pl.snowball.decorator.model.Worrior;

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
