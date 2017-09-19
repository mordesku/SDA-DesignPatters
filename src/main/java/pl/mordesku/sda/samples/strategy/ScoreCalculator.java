package pl.mordesku.sda.samples.strategy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:04
 */
public class ScoreCalculator {
    public static void main(String[] args) {
        Person person = new Adult();

        System.out.println("Passed? :"+person.passed(200));
        System.out.println("Passed? :"+person.passed(99));
        System.out.println("Passed? :"+person.passed(70));
    }
}
