package com.example.demo.repository;

import com.example.demo.model.Message;
import org.springframework.stereotype.Repository;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Base64;

@Repository
public class MessageRepository {
    public static String encrypt(String plainText, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);

    }
    public Message cryptographyMessage(String title, String body) throws Exception {
        // simple log of the message to be encrypted.
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        KeyPair keyPair = generator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        System.out.print("POST METHOD - encrypting the message" +
                "\n " +
                "Message { " +
                "\n" +
                "title: " + title + "\n ," +
                "body: " + body + "\n " +
        "}");
        return new Message(encrypt(title, publicKey), encrypt(body, publicKey));
    }
}
