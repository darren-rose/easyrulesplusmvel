package dk.callme.creditcheck;

/**
 * Created by darrenrose on 14/05/2015.
 */
public class PrintlnAction implements Actionable {
    private String line;

    public PrintlnAction(String line) {
        this.line = line;
    }

    @Override
    public void doAction() {
        System.out.println(line);
    }

}
