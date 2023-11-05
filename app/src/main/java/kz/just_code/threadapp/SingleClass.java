package kz.just_code.threadapp;

public class SingleClass {
    private SingleClass instance;

    private SingleClass() {
        if (instance == null) {
            instance = new SingleClass();
        }
    }

    public SingleClass getInstance() {
        return new SingleClass();
    }
}
