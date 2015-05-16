package rulesengine.example;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Priority;
import org.easyrules.annotation.Rule;
import org.mvel2.MVEL;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by darrenrose on 14/05/2015.
 */
@Rule(name = "MobileBroadbandRule", description = "Check if person's has mobile broadband")
public class MobileBroadbandRule {

    private Person person;
    private String expression;
    private String context;

    public MobileBroadbandRule(Person person, String context, String expression) {

        this.person = person;
        this.expression = expression;
        this.context = context;
    }

    @Condition
    public boolean isMobileBroadbandCustomer() {
        Map vars = new HashMap();
        vars.put(context, person);
        Boolean result = (Boolean) MVEL.eval(expression, vars);
        return result;
    }

    @Action
    public void action(){
        System.out.printf("Person %s has mobile broadband.\n", person.getName());
    }

    @Priority
    public int getPriority() {
        return 3;
    }

}