package com.su.common.test;

import com.su.common.util.Base64Util;
import com.su.common.util.EncryptUtil;

/**
 * @author Jin
 * @date 2019/1/20 22:37
 */
public class test {
    public static void main(String[] args) {
        System.out.println(Base64Util.base64Enc(EncryptUtil.createAESKey()));
    }
}
