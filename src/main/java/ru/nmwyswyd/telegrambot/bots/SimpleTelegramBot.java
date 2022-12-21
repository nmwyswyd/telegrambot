package ru.nmwyswyd.telegrambot.bots;

import ru.nmwyswyd.telegrambot.handlers.SimpleHandler;
import ru.nmwyswyd.telegrambot.readers.*;
import ru.nmwyswyd.telegrambot.writers.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class SimpleTelegramBot extends TelegramLongPollingBot implements Writer {
	private final String botUsername;
	private final String token;
	private final SimpleHandler handler;
	private final TelegramConverter converter;

	public SimpleTelegramBot(String botUsername, String token) {
		this.botUsername = botUsername;
		this.token = token;
		handler = new SimpleHandler();
		converter = new TelegramConverter();
	}

	@Override
	public void onUpdateReceived(Update update) {
		if (update.hasMessage()) {
			System.out.println("Log: userId  = " + update.getMessage().getFrom().getId());
			System.out.println("     message = " + update.getMessage().getText());
			Request request = converter.convert(update);
			Response response = handler.handle(request);
			write(response);
		}
	}

	@Override
    public String getBotUsername() {
		return botUsername;
    }

    @Override
    public String getBotToken() {
		return token;
    }

	@Override
	public void write(Response response) {
		SendMessage message = new SendMessage();
		message.setChatId(response.getUserId().toString());
		message.setText(response.getText());

		try {
			execute(message);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
