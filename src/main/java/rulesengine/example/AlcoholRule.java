package rulesengine.example;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Priority;
import org.easyrules.annotation.Rule;

/**
 * Created by darrenrose on 14/05/2015.
 */
@Rule(name = "alcoholRule", description = "Children are not allowed to buy alcohol.")
public class AlcoholRule {

    private Person person;

    public AlcoholRule(Person person) {
        this.person = person;
    }

    @Condition
    public boolean isChildren() {
        return !person.isAdult();
    }

    @Action
    public void doAction(){
        System.out.printf("Sorry %s, you are not allowed to buy alcohol.\n", person.getName());
    }

    @Priority
    public int getPriority() {
        return 2;
    }

}