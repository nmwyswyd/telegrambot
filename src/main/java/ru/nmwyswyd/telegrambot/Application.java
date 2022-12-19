package ru.nmwyswyd.telegrambot;

import ru.nmwyswyd.telegrambot.handlers.*;
import ru.nmwyswyd.telegrambot.readers.*;
import ru.nmwyswyd.telegrambot.writers.*;

public class Application {
	public static void main(String[] args) {
		Handler handler = new SimpleHandler();
		Reader reader = new ConsoleReader();
		Writer writer = new ConsoleWriter();

		while (true) {
			Request request = reader.read();
			Response response = handler.handle(request);
			writer.write(response);
		}
	}
}
