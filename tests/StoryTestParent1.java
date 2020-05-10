package tests;

import Solution.Given;
import Solution.Then;
import Solution.When;
import org.junit.Assert;
import org.junit.ComparisonFailure;


public class StoryTestParent1 extends StoryTestParent2 {

    /**
     * This one should never be invoked!
     */
    @Given("A")
    public void A3_2() throws WrongMethodException {
        throw new WrongMethodException();
    }


    @Given("B")
    private void B() {
        b = new B();
    }

    @When("B's x is &num and B's y is &str")
    protected void setXY_B(Integer num, String str) {
        b.setX(num);
        b.setY(str);
    }

    @Then("B's x is &num")
    private void isX_B(Integer num) {
        try {
            Assert.assertEquals(num, b.getX());
        }
        catch (Throwable e) {
            throw new ComparisonFailure(null, num.toString(), b.getX().toString());
        }
    }

    /**
     * This one should never be invoked!
     */
    @When("B's x is &num")
    private void setX_B3(Integer num) throws WrongMethodException {
        throw new WrongMethodException();
    }
}
