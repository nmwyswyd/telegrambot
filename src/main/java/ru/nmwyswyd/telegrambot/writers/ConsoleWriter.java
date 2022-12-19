package ru.nmwyswyd.telegrambot.writers;

public class ConsoleWriter implements Writer {
	@Override
	public void write(Response response) {
		System.out.println(response.getText());
	}
}
