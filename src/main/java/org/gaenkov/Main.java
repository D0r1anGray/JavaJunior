package org.gaenkov;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new ChatClient();
        try {
            new ChatServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

