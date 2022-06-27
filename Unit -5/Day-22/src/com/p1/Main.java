package com.p1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Path p = Paths.get("E://abc.txt");
				
		List<String>list = Files.readAllLines(p);
		
		list.forEach(s -> System.out.println(s));
	}
	}





