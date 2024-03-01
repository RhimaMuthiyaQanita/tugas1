package org.example;

import java.util.Scanner;

class Admin {
    private final String username;
    private final String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }
}

class Mahasiswa {
    private final String nim;
    private final String password;

    public Mahasiswa(String nim, String password) {
        this.nim = nim;
        this.password = password;
    }

    public boolean login(String enteredNim, String enteredPassword) {
        return enteredNim.length() == 15 && enteredNim.matches("\\d+") && enteredNim.equals(nim) && enteredPassword.equals(password);
    }
}

