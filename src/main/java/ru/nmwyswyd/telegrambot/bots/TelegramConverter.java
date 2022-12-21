package ru.nmwyswyd.telegrambot.bots;

import ru.nmwyswyd.telegrambot.readers.Request;
import ru.nmwyswyd.telegrambot.writers.Response;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramConverter {
	public Request convert(Update update) {
		String text = update.getMessage().getText();
		Long userId = update.getMessage().getFrom().getId();
		return new Request(text, userId);
	}
}
