package com.shuang.config;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {
    public String encode(CharSequence charSequence) {
        return charSequence .toString();
    }

    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
