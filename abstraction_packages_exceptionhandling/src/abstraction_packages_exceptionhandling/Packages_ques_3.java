package abstraction_packages_exceptionhandling;

import com.automobile.Honda;
import com.automobile.twowheeler.Hero;

public class Packages_ques_3 {
	public static void main(String[] args) {
		Hero heroBike = new Hero();
		System.out.println("Hero Model: " + heroBike.getModelName());
		System.out.println("Speed: " + heroBike.getSpeed());
		heroBike.radio();

		Honda hondaCar = new Honda();
		System.out.println("Honda Model: " + hondaCar.getModelName());
		System.out.println("Speed: " + hondaCar.getSpeed());
		hondaCar.cdplayer();
	}

}