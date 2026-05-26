package org.example.service;

import org.example.util.RSAUtil;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import static org.example.config.RSAConstants.*;

public class RSAService {

    public void excute() {
        try {
            // 1. Generar Claves
            KeyPairGenerator generator = KeyPairGenerator.getInstance(ALGORITHM);
            generator.initialize(KEY_SIZE);

            KeyPair keyPair = generator.generateKeyPair();

            String originalMessage = DEFAULT_MESSAGE;

            System.out.println("Mensaje original: " + originalMessage);

            // 2. Cifrar
            String encrypted = RSAUtil.encrypt(originalMessage, keyPair.getPublic());
            System.out.println("Mensaje cifrado: " + encrypted);

            // 3. Descifrar
            String decrypted = RSAUtil.decrypt(encrypted, keyPair.getPrivate());
            System.out.println("Mensaje descifrado: " + decrypted);

        } catch (Exception e) {
            System.err.println("Error en la ejecución del cifrado RSA");
            e.printStackTrace();
        }
    }
}
