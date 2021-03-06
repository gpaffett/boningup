package net.paffett.boningup.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	
	public static void main(String[] args) {
		PathDemo.showAbsolutePath();
		System.out.println();
		PathDemo.showRelativePath();

	}

	private static void showAbsolutePath() {
		
		// None of these methods requires that the file corresponding
		// to the Path exists.
		// Microsoft Windows syntax
		Path path = Paths.get("C:\\home\\joe\\foo");

		// Solaris syntax
		// Path path = Paths.get("/home/joe/foo");

		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		System.out.format("%s%n", path.toUri());

	}
	
	private static void showRelativePath() {
		// Solaris syntax
		// Path path = Paths.get("sally/bar");
		
		// Microsoft Windows syntax
		Path path = Paths.get("sally\\bar");

		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		System.out.format("%s%n", path.toUri());

	}
	
}
