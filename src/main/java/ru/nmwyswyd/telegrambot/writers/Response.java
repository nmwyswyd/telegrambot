package ru.nmwyswyd.telegrambot.writers;

public class Response {
	private final String text;

	public Response(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
