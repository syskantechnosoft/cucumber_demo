package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("Sample Given");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        System.out.println("Sample When");
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("Sample Then");
    }

}
