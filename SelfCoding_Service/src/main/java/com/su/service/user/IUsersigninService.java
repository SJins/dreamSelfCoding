package com.su.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.vo.ResultVo;
import com.su.domain.user.Usersignin;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jin
 * @since 2019-01-17
 */
public interface IUsersigninService extends IService<Usersignin> {

    // 签到
    ResultVo signin(String token);
    // 验证是否可以签到
    ResultVo checkSign(String token);
    // 查询签到记录
    ResultVo queryList(String token, int count);

}
