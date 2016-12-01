package io.robusta.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class IterationApplication {
	Pingouin kowalsky = new Pingouin("Kowalsky");
	Pingouin ricoh = new Pingouin("Ricoh");
	Pingouin soldat = new Pingouin("Soldat");
	Pingouin commandant = new Pingouin("Commandant");

	ArrayList<Pingouin> list = new ArrayList<>();

	public static void main(String[] args) {
		IterationApplication app = new IterationApplication();
		app.iterateList();
		app.iterateSet();
		app.iterateMap();

	}

	void iterateList() {
		ArrayList<Pingouin> list = new ArrayList<>();
		Collections.addAll(list, kowalsky, ricoh, soldat, commandant);

		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			String name = list.get(i).name;

			System.out.println(i);
			System.out.println(name.charAt(0));
			System.out.println(name.substring(name.length() - 5));
		}

	}

	void iterateSet() {
		System.out.println("\n---Set---\n");
		HashSet<Pingouin> set = new HashSet<>();
		Collections.addAll(set, kowalsky, ricoh, soldat, commandant);

		// if size of name > 6 : display only last chars
		// else display all chars
		// >>> Ricoh, Soldat, walsky, andant

		for (Pingouin current : set) {
			String name = current.name;
			if (name.length() > 6) {
				int lastIndex = name.length() - 1;
				int beginIndex = lastIndex - 5;

				System.out.println(name.substring(beginIndex));
			} else {
				System.out.println(name);
			}

		}

	}

	void iterateMap() {

		Map<Pingouin, Integer> map = new HashMap<>();
		map.put(commandant, 38);
		map.put(kowalsky, 0);
		map.put(ricoh, 0);
		map.put(soldat, 22);

		for (Entry<Pingouin, Integer> current : map.entrySet()) {
			String display = current.getKey().name + " has " + current.getValue() + " points ";
			System.out.println(display);

		}

	}
}
