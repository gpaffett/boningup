package net.paffett.boningup.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("usage: FileTest file");
			System.exit(-1);
		}

		// Converts the input string to a Path object.
		Path inputPath = Paths.get(args[0]);

		// Converts the input Path
		// to an absolute path.
		// Generally, this means prepending
		// the current working
		// directory. If this example
		// were called like this:
		// java FileTest foo
		// the getRoot and getParent methods
		// would return null
		// on the original "inputPath"
		// instance. Invoking getRoot and
		// getParent on the "fullPath"
		// instance returns expected values.
		Path fullPath = inputPath.toAbsolutePath();

		System.out.format("fullPath: %s%n", fullPath);
		
		System.out.println("Using the resolve method...");
		Path p1 = Paths.get("C:\\home\\joe\\foo");
		// Result is C:\home\joe\foo\bar
		System.out.format("%s%n", p1.resolve("bar"));
		
	}
}