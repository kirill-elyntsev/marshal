package com.elyntsev.marshal;

import com.elyntsev.marshal.util.Counter;
import com.elyntsev.marshal.util.MessageSender;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Marshal {

    private Scanner scanner;
    private Counter counter;
    private MessageSender messageSender;
    private String path;
    private File directory;
    private Map<String, Integer> extensionMap;

    public void init() {
        counter = new Counter();
        messageSender = new MessageSender();
        askForPath();
        scanner = new Scanner(System.in);
        setPath(scanner.nextLine());
        directory = new File(path);
        if (directory.isDirectory()) {
            execute();
        }
    }

    public void execute() {
        List<String> extensionList = getExtensionList(directory);
        extensionMap = counter.countOccurrences(extensionList);
        messageSender.printCountedExtension(extensionMap);
        createFolders();
    }


    public void createFolders() {
        File folder = new File(path + "\\test");
        if (folder.exists()) {

        }
    }

    private List<String> getExtensionList(File directory) {
        List<String> fileList = Arrays.asList(directory.list());
        return fileList.stream().map(s -> FilenameUtils.getExtension(s)).collect(Collectors.toList());
    }

    private void askForPath() {
        messageSender.printAskForPathMessage();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
