package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

	private Store store;

	private ConsoleInput input;

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

	@Autowired
	public void setStore(Store store) {
		this.store = store;
	}

	@Autowired
	public void setInput(ConsoleInput input) {
		this.input = input;
	}
}