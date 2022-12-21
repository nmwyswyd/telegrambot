package ru.nmwyswyd.telegrambot;

import ru.nmwyswyd.telegrambot.handlers.*;
import ru.nmwyswyd.telegrambot.readers.*;
import ru.nmwyswyd.telegrambot.writers.*;
import ru.nmwyswyd.telegrambot.bots.*;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application {
	public static void main(String[] args) {
		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream("src/main/resources/config.properties"));
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(new SimpleTelegramBot(properties.getProperty("botUsername"), properties.getProperty("token")));
		} catch (TelegramApiException e) {
			e.printStackTrace();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
