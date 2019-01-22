package com.su.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.vo.ResultVo;
import com.su.domain.user.Userdetial;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jin
 * @since 2019-01-17
 */
public interface IUserdetialService extends IService<Userdetial> {
    // 个人资料
    ResultVo update(String token, Userdetial userdetial);
    // 查询个人详情
    ResultVo queryById(String token);
}
