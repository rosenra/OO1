package Ejercicio18;

import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer> {

	@Override
	public boolean add(Integer num) {
		if ((int) num % 2 == 0) {
			return super.add(num);
		} else
			return false;
	}

	// si uso la interfaz set tengo que redefinir todos los métodos (incluido el add)
}
