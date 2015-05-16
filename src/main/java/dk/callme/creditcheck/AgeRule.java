package dk.callme.creditcheck;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Priority;
import org.easyrules.annotation.Rule;
import org.easyrules.core.BasicRule;
import org.mvel2.MVEL;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by darrenrose on 14/05/2015.
 */
@Rule(name = "AgeRule", description = "Check if person's age is > 18 and marks the person as adult")
public class AgeRule extends BasicRule implements AgeJmxRule {

    private Person person;
    private String expression;
    private String context;
    private Actionable action;

    public AgeRule(Person person, String context, String expression, Actionable action) {

        this.person = person;
        this.expression = expression;
        this.context = context;
        this.action = action;
    }

    @Condition
    public boolean isAdult() {
        Map vars = new HashMap();
        vars.put(context, person);
        Boolean result = (Boolean) MVEL.eval(expression, vars);
        return result;
    }

    @Action
    public void doAction(){
        person.setAdult(true);
        action.doAction();
    }

    @Priority
    public int getPriority() {
        return 1;
    }

    @Override
    public String getAgeExpression() {
        return expression;
    }

    @Override
    public void setAgeExpression(String expression) {
        this.expression = expression;

    }
}