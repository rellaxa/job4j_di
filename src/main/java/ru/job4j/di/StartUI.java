package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {

	private Store store;

	private ConsoleInput input;

	public StartUI(Store store, ConsoleInput input) {
		this.store = store;
		this.input = input;
	}

	public void add(String value) {
		store.add(value);
	}

	public void print() {
		for (String value : store.getAll()) {
			input.askStr(value);
		}
	}

	public void input(String text) {
		input.askStr(text + System.lineSeparator());
	}
}