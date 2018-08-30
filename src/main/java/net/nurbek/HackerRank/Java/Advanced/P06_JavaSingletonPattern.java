package net.nurbek.HackerRank.Java.Advanced;

public class P06_JavaSingletonPattern {

}

class Singleton {
    public static String str;
    private volatile static Singleton instance;

    private Singleton() {

    }

    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

// SOLVED //

/*
"The singleton pattern is a design pattern that restricts the instantiation of a class to one object. This is useful when
exactly one object is needed to coordinate actions across the system."
- Wikipedia: Singleton Pattern

Complete the Singleton class in your editor which contains the following components:
1. A private Singleton non parameterized constructor.
2. A public String instance variable named "str".
3. Write a static method named getSingleInstance that returns the single instance of the Singleton class.

Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton
class to print a line.

Input Format
You will not be handling any input in this challenge.

Output Format
You will not be producing any output in this challenge.

Sample Input
hello world

Sample Output
Hello I am a singleton! Let me say hello world to you
*/