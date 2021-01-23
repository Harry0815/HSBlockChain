package jain.helpers;

import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.Hex;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SHA3Helper {
    public static String digestToHex(byte [] digest) {
        return Hex.toHexString(digest);
    }

    public static byte[] hash256(Object o) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(o);
        oos.flush();

        byte[] digest = new SHA3.Digest256().digest(bos.toByteArray());
        return digest;
    }
}
