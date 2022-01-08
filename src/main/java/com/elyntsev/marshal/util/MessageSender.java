package com.elyntsev.marshal.util;

import java.util.Map;

public class MessageSender {

    public void printCountedExtension(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> val : map.entrySet()) {
            System.out.println(val.getKey() + " "
                    + ": " + val.getValue());
        }
    }

    public void printAskForPathMessage() {
        System.out.println("Enter the directory:");
    }

    public void printCreateFoldersInfo() {
        System.out.println("Create folders...");
    }

    public void printArrangeInfo() {
        System.out.println("Sort by folders...");
    }

    public void finishInfo() {
        System.out.println("Finish info");
    }
}
