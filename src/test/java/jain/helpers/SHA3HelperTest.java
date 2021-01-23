package jain.helpers;

import jain.models.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SHA3HelperTest {
    @Test
    public void digestToHex() throws Exception {
        String in = " 1234567890";
        String out = SHA3Helper.digestToHex(in.getBytes());

        assertEquals(out,"2031323334353637383930");
        System.out.println(out);
    }

    @Test
    public void hash256() throws Exception {
        byte [] ret = SHA3Helper.hash256(
                new Transaction(
                    "Harry".getBytes(),
                    "Udo".getBytes(),
                    10d,
                    0,
                    100d,
                    100d
                )
        );

        System.out.println(ret);
    }
}