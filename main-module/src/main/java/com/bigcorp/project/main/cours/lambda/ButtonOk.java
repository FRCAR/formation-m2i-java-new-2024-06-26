package com.bigcorp.project.main.cours.lambda;

public class ButtonOk implements Clickable {

	@Override
	public String click(int clickDuration) {
		return "OK";
	}

}
