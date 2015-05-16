package test;

import org.easyrules.core.AnnotatedRulesEngine;
import org.junit.Test;
import rulesengine.example.*;

/**
 * Created by darrenrose on 14/05/2015.
 */

public class RulesTest {

    @Test
    public void verifyRulesWithMvel() {

        Person person = new Person("Tom", 18);
        person.setMobileBroadBandCustomer(true);

        //create a rules engine
        AnnotatedRulesEngine annotatedRulesEngine = new AnnotatedRulesEngine();

        //register rules
        annotatedRulesEngine.registerRule(new AgeRule(person, "person", "person.age>17", new PrintlnAction("over 17")));
        annotatedRulesEngine.registerRule(new AlcoholRule(person));
        annotatedRulesEngine.registerRule(new MobileBroadbandRule(person, "person", "person.mobileBroadBandCustomer"));

        //fire rules
        annotatedRulesEngine.fireRules();

    }

}
