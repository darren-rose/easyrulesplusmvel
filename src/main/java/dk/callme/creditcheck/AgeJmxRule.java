package dk.callme.creditcheck;

import org.easyrules.jmx.api.JMXRule;

import javax.management.MXBean;

/**
 * Created by darrenrose on 14/05/2015.
 */
@MXBean()
public interface AgeJmxRule extends JMXRule {
    String getAgeExpression();
    void setAgeExpression(String expression);
}
