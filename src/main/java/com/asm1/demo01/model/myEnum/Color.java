package com.asm1.demo01.model.myEnum;

public enum Color {
	RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00"), BLACK("#000000"), WHITE("#FFFFFF"), YELLOW("#FFFF00"),
	ORANGE("#FFA500"), PURPLE("#800080"), PINK("#FFC0CB"), BROWN("#A52A2A"), GRAY("#808080");

	final String code;

	Color(String code) {
		this.code = code;
	}
}
