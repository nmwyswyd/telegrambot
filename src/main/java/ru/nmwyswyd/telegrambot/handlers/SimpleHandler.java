package ru.nmwyswyd.telegrambot.handlers;

import ru.nmwyswyd.telegrambot.readers.Request;
import ru.nmwyswyd.telegrambot.writers.Response;

public class SimpleHandler implements Handler {
	public Response handle(Request request) {
		return new Response(request.getText());
	}
}
