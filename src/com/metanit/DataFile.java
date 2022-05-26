package com.metanit;

import java.io.*;
import java.util.*;

public class DataFile {

    public static void writeToFile(MyList list, String file) throws Exception {

        String str = "[";
            for (int i = 0; i < list.size(); i++) {
                str += " " + list.getAt(i) + " ";
            }
            str += "]";


        try (PrintWriter writer = new PrintWriter(file,"UTF-8")){
                writer.print(str);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.err.println("Ошибка");
        }
    }

    public static void readFile(MyList list, String file) throws Exception {

        try (Scanner scanner = new Scanner(new File(file))){

            while (scanner.hasNextInt()) {
                list.addLast(scanner.nextInt());
            }

        } catch (FileNotFoundException e) {
            System.err.print("Error");
        }

    }

}
