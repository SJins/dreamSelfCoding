package com.su.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.vo.ResultVo;
import com.su.domain.user.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jin
 * @since 2019-01-17
 */
public interface IUserService extends IService<User> {

    //注册
    ResultVo register(User user);
    //校验手机
    ResultVo checkPhone(String phone);

    // 登录-前后端分离
    ResultVo login(String phone, String password);
    // 退出
    ResultVo loginout(String token);
    // 查询主页
    ResultVo queryHome(String token);

}
