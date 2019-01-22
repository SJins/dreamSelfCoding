package com.su.common.constant;

/**
 * @author Jin
 * @date 2019/1/20 22:36
 */
public class SystemConst {
    // Token的密钥
    public static final String TOKENKEY = "IZtRU0xvTqGiHZtASpfXkQ==";

    // Redis存储Token的集合名称
    public static final String TOKENMAP = "usertokens";

    // Redis存储签到的连续天数
    public static final String SIGNINMAP = "usersignindas";

    // 学贝的默认失效时间 6个月
    public static final int SHELLMONTHS = 6;

    // 学贝的类型
    public static final int SHELLTYPE1 = 1; // 签到
    public static final int SHELLTYPE2 = 2; // 推荐新用户
    public static final int SHELLTYPE3 = 3; // 活动赠送
    public static final int SHELLTYPE4 = 3; // 充值 没有失效期
}
