package com.zblash.jwt.examples;

import com.zblash.jwt.generator.JWTGenerator;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Examples {
    private static final Logger logger = Logger.getLogger(Examples.class);

    public static void main(String[] args) {
        String secret = "D6D317C8F7CEDC7B170B892FE9D3A8C4CD0861BE653203FB6D349C2478D92811";
        Map<String, Object> body = new HashMap<>();
        body.put("name", "Yusuf Can");
        body.put("email", "yusufcancelik@hotmail.com");
        body.put("age", 23);

        String jwt = JWTGenerator.generate(secret, null, 86_400_000, body);
        logger.debug(jwt);

        Object o = JWTGenerator.validate(jwt, secret);
        logger.debug(o.toString());
    }
}
