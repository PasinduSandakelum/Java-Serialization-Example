package com.pasindu;

import java.io.*;

import com.pasindu.model.User;

public class Application {
    public static void main(String[] args) throws IOException {
        User user = new User(1,"Pasindu",26);

        FileOutputStream out = new FileOutputStream("/home/user/Desktop/Java Examples/Java-Serialization-Example/Serialization/files/user.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(out);

        outputStream.writeObject(user);
        System.out.println("Object writed !");
    }
}
