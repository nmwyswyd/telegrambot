package ru.nmwyswyd.telegrambot.writers;

public class Response {
	private final String text;
	private final Long userId;

	public Response(String text) {
		this.text = text;
		this.userId = null;
	}

	public Response(String text, Long userId) {
		this.text = text;
		this.userId = userId;
	}

	public String getText() {
		return text;
	}

	public Long getUserId() {
		return userId;
	}
}
