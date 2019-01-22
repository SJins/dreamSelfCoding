package com.su.domain.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jin
 * @since 2019-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Userwallet implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer totalshell;

    private Integer consumeshell;

    private Integer expireshell;

    private Integer moneyshell;

    private Integer flag;


}
