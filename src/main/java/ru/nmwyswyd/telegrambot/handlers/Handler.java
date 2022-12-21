package ru.nmwyswyd.telegrambot.handlers;

import ru.nmwyswyd.telegrambot.readers.Request;
import ru.nmwyswyd.telegrambot.writers.Response;

public interface Handler {
	Response handle(Request request);
}
