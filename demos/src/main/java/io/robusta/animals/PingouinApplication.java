package io.robusta.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class PingouinApplication {

	public static void main(String[] args) {
		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");

		ArrayList<Pingouin> list = new ArrayList<>();
		list.add(kowalsky);
		list.add(ricoh);
		list.add(soldat);
		list.add(commandant);

		System.out.println(list + " : " + list.size());

		LinkedList<Pingouin> linkedList = new LinkedList<>();
		linkedList.add(ricoh);
		linkedList.add(soldat);
		System.out.println(linkedList + " : " + linkedList.size());
		workSet();
		workMap();
	}

	static void workSet() {
		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");

		HashSet<Pingouin> set = new HashSet<>();

		Collections.addAll(set, kowalsky, ricoh, soldat, commandant);
		System.out.println(set);

		set.add(ricoh);
		System.out.println(set);
		Pingouin cocoh = new Pingouin("Ricoh");
		set.add(cocoh);
		System.out.println(set);

	}

	static void workMap() {
		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");

		HashMap<Pingouin, Integer> map = new HashMap<>();
		map.put(commandant, 38);
		map.put(kowalsky, 30);
		map.put(ricoh, 12);
		map.put(soldat, 22);
		System.out.println(map);

	}
}
