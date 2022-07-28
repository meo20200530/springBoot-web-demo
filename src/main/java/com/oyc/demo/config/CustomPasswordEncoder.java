package com.oyc.demo.config;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @ClassName CustomPasswordEncoder
 * @Description 密码加密器，因为我们数据库是明文存储的，所以明文返回即可
 * @Author ms
 * @Date 2022/07/28
 * @Version
 */

@Component
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword.toString());
    }
}
