package com.codecool.krk.appcontroller;

import java.io.BufferedReader;
import java.io.IOException;

public class SlackController {

    String[] args;

    public SlackController(String[] args) {
        this.args = args;
    }

    private  Mode getUserChoice() {
        Mode userChoice;

        try {
            userChoice = Mode.valueOf(this.args[0].toUpperCase());
        } catch (IllegalArgumentException e) {
            userChoice = Mode.NOT_VALID;
        }

        return userChoice;
    }

    private int getPortNumber() {
        int portNumber = -1;

        try {
            if (this.args.length == 2) {
                portNumber = Integer.parseInt(this.args[1]);
            } else if (args.length == 3) {
                portNumber = Integer.parseInt(this.args[2]);
            } else {
                throw new IllegalArgumentException("Wrong arguments number");
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            return portNumber;
        }
    }

    private String getHostName() {
        String hostName = null;

        try {
            if (this.args.length == 3) {
                hostName = this.args[1];
            } else {
                throw new IllegalArgumentException("Wrong arguments number");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            return hostName;
        }
    }

    private String getUserName(BufferedReader stdIn) {
        String userName = null;

        try {
            System.out.printf("What's your name: ");
            userName = stdIn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return userName;
        }
    }
}
