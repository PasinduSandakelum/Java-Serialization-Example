package com.pasindu;

import com.pasindu.model.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("/home/user/Desktop/Java Examples/Java-Serialization-Example/Serialization/files/user.txt");
        ObjectInputStream input = new ObjectInputStream(inputStream);
        User user = (User) input.readObject();
        System.out.println(user.getName());
    }
}
