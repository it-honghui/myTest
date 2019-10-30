package com.wanghonghui.utils;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

public class RSA
{
    private static final String KEY_ALGORITHM = "RSA";
    private static final int KEY_SIZE = 1024;
    private static final String CHARSET = "UTF-8";

    public static KeyPair getKeyPair() throws Exception { return getKeyPair(null); }

    public static KeyPair getKeyPair(String password) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        if (password == null) {
            keyPairGenerator.initialize(1024);
        } else {
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(password.getBytes("UTF-8"));
            keyPairGenerator.initialize(1024, secureRandom);
        }

        return keyPairGenerator.generateKeyPair();
    }

    public static byte[] getPrivateKeyBytes(KeyPair keyPair) { return keyPair.getPrivate().getEncoded(); }

    public static String getPrivateKey(KeyPair keyPair) { return Base64.getEncoder().encodeToString(getPrivateKeyBytes(keyPair)); }

    public static byte[] getPublicKeyBytes(KeyPair keyPair) { return keyPair.getPublic().getEncoded(); }

    public static String getPublicKey(KeyPair keyPair) { return Base64.getEncoder().encodeToString(getPublicKeyBytes(keyPair)); }

    public static byte[] encryptByPrivateKey(byte[] data, byte[] privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        PrivateKey key = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKey));

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(1, key);
        return cipher.doFinal(data);
    }

    public static String encryptByPrivateKey(String data, String privateKey) throws Exception {
        byte[] key = Base64.getDecoder().decode(privateKey);
        return Base64.getEncoder().encodeToString(encryptByPrivateKey(data.getBytes("UTF-8"), key));
    }

    public static byte[] encryptByPublicKey(byte[] data, byte[] publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        PublicKey key = keyFactory.generatePublic(new X509EncodedKeySpec(publicKey));

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(1, key);
        return cipher.doFinal(data);
    }

    public static String encryptByPublicKey(String data, String publicKey) throws Exception {
        byte[] key = Base64.getDecoder().decode(publicKey);
        return Base64.getEncoder().encodeToString(encryptByPublicKey(data.getBytes("UTF-8"), key));
    }

    public static byte[] decryptByPrivateKey(byte[] data, byte[] privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        PrivateKey key = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKey));

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(2, key);
        return cipher.doFinal(data);
    }

    public static String decryptByPrivateKey(String data, String privateKey) throws Exception {
        byte[] key = Base64.getDecoder().decode(privateKey);
        return new String(decryptByPrivateKey(Base64.getDecoder().decode(data), key), "UTF-8");
    }

    public static byte[] decryptByPublicKey(byte[] data, byte[] publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        PublicKey key = keyFactory.generatePublic(new X509EncodedKeySpec(publicKey));

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(2, key);
        return cipher.doFinal(data);
    }

    public static String decryptByPublicKey(String data, String publicKey) throws Exception {
        byte[] key = Base64.getDecoder().decode(publicKey);
        return new String(decryptByPublicKey(Base64.getDecoder().decode(data), key), "UTF-8");
    }
}
