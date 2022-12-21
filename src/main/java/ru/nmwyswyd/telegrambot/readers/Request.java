package ru.nmwyswyd.telegrambot.readers;

public class Request {
	private final String text;
	private final Long userId;

	public Request(String text) {
		this.text = text;
		this.userId = null;
	}

	public Request(String text, Long userId) {
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
