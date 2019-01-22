package com.su.common.token;

import com.alibaba.fastjson.JSON;
import com.su.common.constant.SystemConst;
import com.su.common.util.Base64Util;
import com.su.common.util.EncryptUtil;
import com.su.domain.user.User;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Jin
 * @date 2019/1/20 21:49
 */
public class TokenUtil {
    // 生成Token
    public static String createToken(User user) {
        LoginToken token = new LoginToken();
        token.setId(user.getId());
        token.setUser(user);
        token.setCreatetime(LocalDateTime.now());
        token.setRandomnum(new Random().nextLong());
        String json = JSON.toJSONString(token);
        return EncryptUtil.AESEnc(Base64Util.base64Dec(SystemConst.TOKENKEY),json);
    }

    // 更新Token的时间
    public static String updateToken(String token) {
        String json = EncryptUtil.AESDec(Base64Util.base64Dec(SystemConst.TOKENKEY), token);
        LoginToken loginToken = JSON.parseObject(json, LoginToken.class);
        loginToken.setCreatetime(LocalDateTime.now());
        loginToken.setRandomnum(new Random().nextLong());
        return EncryptUtil.AESEnc(Base64Util.base64Dec(SystemConst.TOKENKEY), json);
    }

    // 解析Token
    public static LoginToken parseToken(String token) {
        return JSON.parseObject(EncryptUtil.AESDec(Base64Util.base64Dec(SystemConst.TOKENKEY), token), LoginToken.class);
    }
}
