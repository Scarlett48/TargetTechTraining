package com.aique.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;

public class HandingWithTryCatch {
    public Reader openFileReader(String filePath) {
        try {
            return new FileReader(filePath);
        } catch (FileNotFoundException ffe) {
            // tell the user that the file was not found
            System.out.println("Handling FileNotFoundException exception....");
        }
        return null;
    }

    public Reader openFileReaderWithThrows(String filePath) throws FileNotFoundException {
        return new FileReader(filePath);
    }

    /**
     * Multiple Catch Block
     * @param file
     * @throws FileNotFoundException
     * @throws ParseException
     */
    public void readAndParse(String file) throws FileNotFoundException, ParseException {
        // some business code
    }

    public void run(String file) {
        try {
            readAndParse(file);
        } catch (FileNotFoundException ex) {
            // do something when file is not found
        } catch (ParseException ex) {
            // do something if the parsing fails
        }
    }

    /**
     * More generalized exception and specialized exception
     * @param file
     */
//    public void runTwo(String file) {
//        try {
//            readAndParse(file);
//        } catch (Exception ex) {
//            // this block will catch all exceptions
//        } catch (ParseException ex) {
//            // this block will not be executed
//        }
//    }

    /**
     * Catching Multiple Exceptions
     * @param file
     */
    public void runSingleCatch(String file) {
        try {
            readAndParse(file);
        } catch (FileNotFoundException | ParseException ex) {
            // do something when file is not found
        }
    }

    /**
     * Finally block
     */
    public void exampleOne() {
        FileReader reader = null;
        try {
            reader = new FileReader("/tmp/somefile");
            // do something
            return;
        } catch (FileNotFoundException ex) {
            // do something
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    // do something
                }
            }
        }
    }
}
