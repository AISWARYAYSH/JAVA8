package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        };
        new Thread(
                runnable).start();

        Runnable runnableLambda = () -> {System.out.println("Inside Runnable 2");};
        new Thread(runnableLambda).start();

        Runnable runnableLambdaMultiStatements = () -> {
            System.out.println("Inside Runnable 3");
            System.out.println("Inside Runnable 3");
        };
        new Thread(runnableLambdaMultiStatements).start();
        Runnable runnableLambdaSimple = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambdaSimple).start();
        new Thread(() -> System.out.println("Inside Runnable 4")).start();


    }
}
