package com.bigcorp.project.main.cours.lambda;

public class ButtonFormattageDuDisque implements Clickable {

	@Override
	public String click(int clickDuration) {
		if(clickDuration > 3) {
			System.out.println("Je formate le disque");
			return "DISQUE_FORMATE";
		}
		return "OPERATION_ANNULEE";
	}

}
