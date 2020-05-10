package tests;

import Solution.Given;


public class StoryTestParent1 extends StoryTestParent2 {

    /**
     * This one should never be invoked!
     */
    @Given("A")
    public void A3() throws WrongMethodException {
        throw new WrongMethodException();
    }
}
