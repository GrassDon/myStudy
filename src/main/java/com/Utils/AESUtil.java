package com.Utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AESUtil {
    /*
    * 加密方法
    * 参数：待加密字符串，密钥
    *
    * */
    public String encrypt(String text,Key key)
    {
        try {
            //生成密码器
            Cipher cipher = Cipher.getInstance("AES");
            //初始化密码器，指定密码器方法为加密，
            cipher.init(Cipher.ENCRYPT_MODE,key);
            //获取待加密字符串的字符数组，指定为utf-8，否则可能有乱码
            byte[] byteEncode = text.getBytes("utf-8");
            //加密，也可以用update方法，不过有些区别。
            byte[] byteAES = cipher.doFinal(byteEncode);
            //将加密后的字符数组进行二次加密，并转换成字符串。
            String AEScode = new String(new BASE64Encoder().encode(byteAES));
            return AEScode;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return "false";
    }
    /*
     * 解密方法
     * 参数：待解密字符串，密钥
     *
     * */
    public String decrypt(String text,Key key)
    {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE,key);
            byte[] byteEncode = new BASE64Decoder().decodeBuffer(text);
            byte[] byteAES = cipher.doFinal(byteEncode);
            String AEScode = new String(byteAES,"utf-8");
            return AEScode;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e1) {
            e1.printStackTrace();
        } catch (IllegalBlockSizeException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "false";
    }

    /*
    * 生成密钥方法
    * */
    public Key getKey() throws NoSuchAlgorithmException {
        //密钥生成器，生成方式是AES加密
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        //生成器初始化，指定长度为128，还可以是256，参数随机生成，保证每次生成的密钥不同。
        keyGenerator.init(128,new SecureRandom());
        //获取原始密钥
        SecretKey orginalKey = keyGenerator.generateKey();
        //获取原始密钥的字节数组
        byte[] raw = orginalKey.getEncoded();
        //根据生成的字节数组生成密钥，同时指定加密方法是AES
        Key key = new SecretKeySpec(raw,"AES");
        //返回生成的密钥
        return key;
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        AESUtil aesUtil = new AESUtil();
        Key secretKey = aesUtil.getKey();
        String str1 = aesUtil.encrypt("dong",secretKey);
        System.out.println(str1);
        String str2 = aesUtil.decrypt(str1,secretKey);
        System.out.println(str2);
    }
}