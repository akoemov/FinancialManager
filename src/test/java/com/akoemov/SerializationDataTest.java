package com.akoemov;

import com.akoemov.data.Action;
import com.akoemov.data.Wallet;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.util.Date;

public class SerializationDataTest {

    private static Action action;

    @BeforeClass
    public static void initData() {
        Wallet wallet = new Wallet(Wallet.TYPE.CARD, 0d);
        wallet.setName("Test Bank Name");
        wallet.setCurrency(Wallet.CURRENCY.RUB);


        action = new Action();
        action.setType(Action.TYPE.INCOME);
        action.setSumm(60000d);
        action.setExecutionDate(new Date());
        action.setWallet(wallet);
    }

    @Test
    public void testSerialization() {
        Serializable obj = action;

        try {
            FileOutputStream fos = new FileOutputStream("tmp/" + obj.hashCode() + "");
            SerializationUtils.serialize(obj, fos);

        } catch (FileNotFoundException e) {
            Assert.fail("File tmp/" + obj.hashCode() +" not found" );
        }

        Assert.assertNotNull(new File("tmp/" + obj.hashCode()));

    }

    @Test
    public void testDeserialization() {
        Serializable obj = action;

        try {
            FileInputStream fis = new FileInputStream("tmp/" + obj.hashCode() + "");
            obj = SerializationUtils.deserialize(fis);
        } catch (FileNotFoundException e) {
            Assert.fail("File tmp/" + obj.hashCode() +" not found" );
        }

        Assert.assertEquals(obj, action);
    }
}