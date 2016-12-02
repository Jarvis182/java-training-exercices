package io.robusta.files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadFileApplication {

	public static void main(String[] args) {

		if (args == null || args.length != 2) {
			System.out.println("il faut exactement deux arguments");

			return;
		}

		ReadFileApplication app = new ReadFileApplication();
		try {
			app.readFile(args[0], args[1]);
		} catch (FileNotFoundException e) {
			System.out.println("Oups, le frichier" + args[0] + "n'existe pas");
		} catch (Exception e) {
			System.out.println("Oups, aie aie aie I Fucked it up! GAME OVER");
		}
	}

	void readFile(String argumentFile, String output) throws IOException {

		// WHERE AM I ?

		String executionPath = System.getProperty("user.dir");
		System.out.println(executionPath);
		String textPath = executionPath + "/" + argumentFile;
		Path path = Paths.get(textPath);

		List<String> lines = Files.readAllLines(path);
		List<String> resultFile = new ArrayList<>();

		// modifie le fichier de depart
		for (int index = 0; index < lines.size(); index++) {
			String current = lines.get(index);

			if (current.length() > 0 && current.charAt(0) == '*') {
				String result = current.replaceFirst("\\*", "<li>");
				System.out.println(result);
				resultFile.add(result);

			}
		}

		for (int i = 0; i < resultFile.size(); i++) {
			System.out.println(resultFile.get(i));

		}
		// ABSOLUTELY EQUIVALENT
		for (String s : resultFile) {
			System.out.println(s);
		}

		StringBuilder sb = new StringBuilder();
		for (String line : resultFile) {
			sb.append(line).append("\n");

		}

		String resultPath = executionPath + "/" + output;

		// ecrit a la fin
		Files.write(Paths.get(resultPath), sb.toString().getBytes("utf-8"), StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);

		// java.nio.file.Files.write(Paths.get(file.toURI()), "My string to
		// save".getBytes("utf-8"), StandardOpenOption.CREATE,
		// StandardOpenOption.TRUNCATE_EXISTING);

		System.out.println(lines);

	}

}