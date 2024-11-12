package com.mycompany.taskexceptiopn;

public class Main {
	public static void main(String[] args) {
		FileUtilityException fileUtilityException = new FileUtilityException(new ReadFile(), new WriteFile());
		fileUtilityException.copy("test.txt", "test2.txt");
		System.out.println("succed");
	}
}
