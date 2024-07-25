package com.example.user_management_service.jwt;

import io.jsonwebtoken.Jwts;
import lombok.Value;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

@Component
public class JwtConfig {

private static String jwtSecret = "daf66e01593f61a15b857cf433aae03a005812b31234e149036bcc8dee755dbb";


private static int jwtExpirationMs = 604800000;

public static String getJwtSecret() {
        return jwtSecret;
        }

public static int getJwtExpirationMs() {
        return jwtExpirationMs;
        }
        }