package dk.callme.creditcheck;

/**
 * Created by darrenrose on 14/05/2015.
 */
public class Person {
    private int age;
    private String name;
    private boolean adult;
    private boolean mobileBroadBandCustomer;
    private Account account;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public Person setAccount(Account account) {
        this.account = account;
        return this;
    }

    public boolean isMobileBroadBandCustomer() {
        return mobileBroadBandCustomer;
    }

    public void setMobileBroadBandCustomer(boolean mobileBroadBandCustomer) {
        this.mobileBroadBandCustomer = mobileBroadBandCustomer;
    }

    public Account getAccount() {
        return account;
    }
}
