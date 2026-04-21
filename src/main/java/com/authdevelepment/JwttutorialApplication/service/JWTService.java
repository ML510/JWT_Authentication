package com.authdevelepment.JwttutorialApplication.service;

import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

@Service
public class JWTService {

    private final SecretKey secretKey;

    public JWTService(){
        try {
            SecretKey k = KeyGenerator.getInstance("HmacSHA256").generateKey();
            secretKey = Keys.hmacShaKeyFor(k.getEncoded());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
