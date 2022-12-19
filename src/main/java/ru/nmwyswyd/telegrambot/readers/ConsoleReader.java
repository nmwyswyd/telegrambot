package ru.nmwyswyd.telegrambot.readers;

import java.util.Scanner;

public class ConsoleReader implements Reader {
	final Scanner scanner = new Scanner(System.in);

	@Override
	public Request read() {
		String text = scanner.nextLine();
		return new Request(text);
	}
}
