package com.tutoring.common.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

import static com.tutoring.common.security.JwtokenConstants.EXPIRATION;
import static com.tutoring.common.security.JwtokenConstants.SECRET;
import static java.nio.charset.StandardCharsets.UTF_8;

public class JwtokenUtil {

    public static String generateToken(String username){

        SecretKey key = Keys.hmacShaKeyFor(SECRET.getBytes(UTF_8));
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt( new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(key).compact();


//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt( new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + JwtokenConstants.EXPIRATION))
//                .signWith(SignatureAlgorithm.HS256,JwtokenConstants.SECRET).compact();
    }


    public static Claims validateToken( String token){

        SecretKey key = Keys.hmacShaKeyFor(SECRET.getBytes(UTF_8));
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();

//        return  Jwts.parser()
//                .setSigningKey(JwtokenConstants.SECRET)
//                .parseClaimsJws(token)
//                .getBody();

    }
}
