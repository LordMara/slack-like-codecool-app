package com.codecool.krk.server;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Server {
    private BufferedReader stdIn;
    private int portNumber;
    private HashMap<String, Thread> userThreads;

    public Server(BufferedReader stdIn, int portNumber) {
        this.stdIn = stdIn;
        this.portNumber = portNumber;

        this.userThreads = new LinkedHashMap<>();
    }

    public void execute() {

    }
}
