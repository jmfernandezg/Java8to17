package com.jmfg.training.java16;

import java.lang.reflect.Field;
import java.security.KeyStore;
import java.security.KeyStoreException;

public class Keystore {
    public static void main(String[] args) throws KeyStoreException, NoSuchFieldException, IllegalAccessException {
        KeyStore ks = KeyStore.getInstance("jceks");
        Field f = ks.getClass().getDeclaredField("keyStoreSpi");
        f.setAccessible(true);
        java.lang.Integer mu = new Integer(4);

        System.out.println(f.get(ks));
    }
}
