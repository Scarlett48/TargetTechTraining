package com.aique.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public void readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            // do something
        } catch (FileNotFoundException ex) {
            // do something when file is not found
        } catch (IOException ex) {
            // do something when issues during reader close happens
        }
    }

    /**
     * Multiple resources
     * @param filePathOne
     * @param filePathTwo
     */
    public void readFiles(String filePathOne, String filePathTwo) {

        try (
                FileReader readerOne = new FileReader(filePathOne);
                FileReader readerTwo = new FileReader(filePathTwo);
        ) {
            // do something
        } catch (FileNotFoundException ex) {
            // do something when file is not found
        } catch (IOException ex) {
            // do something when issues during reader close happens
        }
    }
}
