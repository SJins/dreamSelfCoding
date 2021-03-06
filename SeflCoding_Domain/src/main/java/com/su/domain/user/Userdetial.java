package com.su.domain.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

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
public class Userdetial implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private String nickname;

    private Integer sex;

    private LocalDate birthday;

    private String headimg;

    private String sign;

    private String email;

    private String recode;


}
