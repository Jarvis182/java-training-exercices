package io.robusta.animals;

public class GarbageApplication {

	public static void main(String[] args) {
		// start stack
		GarbageApplication app = new GarbageApplication();
		app.init();
	}

	// add stack
	void init() {
		// clear stack
	}

	Pingouin createUsefulPingouin(){
		Pingouin kowaslky = new Pingouin("Kowalsky");
		return kowaslky;
		
	}

	void createGarbagePingouin(){
		Pingouin soldat = new Pingouin("soldat");
	// ...nothing else
	}
}
