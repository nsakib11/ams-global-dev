/*
 * Created by Koushik Chandra Sarker
 * Date: 5/24/2023 (MM/DD/YYYY)
 * Project Name: Ngi-Microservices
 * */
package com.ams.api.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JaysiptConverter {
    public static void main(String[] args) {
        String password = "host_12345";

        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("sdnk#sdjfk@");
        String encryptedPassword = encryptor.encrypt(password);

        System.out.println("Encrypted password: " + encryptedPassword);
    }
}
