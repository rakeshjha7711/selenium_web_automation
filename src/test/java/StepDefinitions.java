import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    private int num1;
    private int num2;
    private int result;

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int number) {
        if (num1 == 0)
            num1 = number;
        else
            num2 = number;
    }

    @When("I press add")
    public void i_press_add() {
        result = num1 + num2;
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expected) {
        assert result == expected : "Actual result is " + result + ", expected result is " + expected;
    }
}
