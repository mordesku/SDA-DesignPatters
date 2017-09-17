package pl.mordesku.sda.basic.memory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by mordesku on 17.09.2017.
 */
public class ProgramLoader {
    public static final String LINE_FORMAT_REGEXP = "(\\d+) (.+)";
    private ProgramMemory programMemory = ProgramMemory.getInstance();

    private File fileToLoad;

    public ProgramLoader(String fileNameToLoad) {
        this.fileToLoad = new File(fileNameToLoad);
    }

    public void load() {
        try (FileInputStream programInputStream = new FileInputStream(fileToLoad)){
            Scanner scanner = new Scanner(programInputStream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String address = line.replaceAll(LINE_FORMAT_REGEXP, "$1");
                String instruction = line.replaceAll(LINE_FORMAT_REGEXP, "$2");
                programMemory.put(address, instruction);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-20);
        }
    }
}
