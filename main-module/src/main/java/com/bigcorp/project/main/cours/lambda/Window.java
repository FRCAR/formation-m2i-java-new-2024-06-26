package com.bigcorp.project.main.cours.lambda;

public class Window {

	private Clickable elementClickable;

	public Clickable getElementClickable() {
		return elementClickable;
	}

	public void setElementClickable(Clickable elementClickable) {
		this.elementClickable = elementClickable;
	}

	public void click(int x, int y, int clickDuration) {
		// je recherche un élément clicable dans l'IHM
		// On a trouvé le bon élément
		String clickResult = this.elementClickable.click(clickDuration);
		System.out.println("Le résultat du clic vaut : " + clickResult);
	}

	public static void main(String[] args) {

		Window window = new Window();
		
		//utilisation d'une implémentation de l'interface Clickable
		window.setElementClickable(new ButtonOk());
		window.click(2, 4, 4);

		//utilisation d'une autre implémentation de l'interface Clickable
		window.setElementClickable(new ButtonFormattageDuDisque());
		window.click(4, 5, 1);

		//utilisation d'une implémentation déclarée en ligne
		window.setElementClickable(new Clickable() {
			@Override
			public String click(int clickDuration) {
				return "IMPLEMENTATION_EN_LIGNE";
			}
		});

		//Création d'une implémentation de l'interface fonctionnelle grâce à une lambda
		Clickable clickableLambda = (int clickDuration) -> {
			System.out.println("Je travaille dans une lambda");
			return "IMPLEMENTATION_LAMBDA";
		};
		
		//Utilisation de la lambda sans passer par une variable
		Object monObjet = new Object();
		window.setElementClickable((int clickDuration) -> {
			String machin = "ljkl";
			if(clickDuration > 3) {
				///
				return machin;
			}
			System.out.println(monObjet);
			//
			return "IMPLEMENTATION_LAMBDA_2";});
		
		window.click(3, 5, 1);
		
		
		
		window.setElementClickable((int clickDuration) -> {
			return "IMPLEMENTATION_LAMBDA_3";});
		// les deux lambdas ci-dessus et ci-dessous sont équivalentes
		window.setElementClickable(clickDuration -> "IMPLEMENTATION_LAMBDA_3");

		
		
	}

}
