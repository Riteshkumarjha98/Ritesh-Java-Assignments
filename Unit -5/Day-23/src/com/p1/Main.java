package com.p1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("E://abc.txt");
		
		Stream<String> str= Files.lines(p);
		
		str.forEach(line -> System.out.println(line));
		}

}
