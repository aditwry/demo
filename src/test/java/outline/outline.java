package outline;

import io.cucumber.java.en.Given;

public class outline {

	@Given("{string} of {string}")
	public void first_of_second(String name, String sirname) {
		System.out.println(name + " " + sirname);
	}

}
