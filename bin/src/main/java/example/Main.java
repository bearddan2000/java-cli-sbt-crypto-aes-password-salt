package example;

import example.AESUtils;

import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.IvParameterSpec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class Main {

    /**
     * Main unit test method.
     * @param args Command line arguments.
     *
     */
    public static void main(String args[])
    throws InvalidKeySpecException, NoSuchAlgorithmException,
    IllegalBlockSizeException, InvalidKeyException, BadPaddingException,
    InvalidAlgorithmParameterException, NoSuchPaddingException {

        String plainText = "Hello World!";
        String password = "@amG89>";
        String salt = AESUtils.generateSalt(256);
        IvParameterSpec ivParameterSpec = AESUtils.generateIv();
        SecretKey key = AESUtils.getKeyFromPassword(password,salt);
        String cipherText = AESUtils.encryptPasswordBased(plainText, key, ivParameterSpec);
        String decryptedCipherText = AESUtils.decryptPasswordBased(
          cipherText, key, ivParameterSpec);

        System.out.println("Original: " + plainText);
        System.out.println("Password: " + password);
        System.out.println("Salt: " + salt);
        System.out.println("Encrypt: " + cipherText);
        System.out.println("Decrypt: " + decryptedCipherText);
    }
}
