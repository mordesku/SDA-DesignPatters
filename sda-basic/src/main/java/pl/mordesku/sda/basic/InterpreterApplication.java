package pl.mordesku.sda.basic;

import pl.mordesku.sda.basic.memory.ProgramLoader;

/**
 * Created by mordesku on 17.09.2017.
 */
public class InterpreterApplication {
    public static void main(String[] args) {
        System.out.println("SDA Basic 1.0");
        if (args.length != 1) {
            System.out.println("Program expects one parameter with filename of basic program");
            System.exit(10);
        }
        System.out.println("Running "+args[0]);
        ProgramLoader loader = new ProgramLoader(args[0]);
        loader.load();
        Interpreter interpreter = new Interpreter();
        interpreter.start();
    }
}
