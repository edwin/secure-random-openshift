package com.edw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.HashMap;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Apr 2023 19:08
 */
@RestController
public class IndexController {

    @GetMapping(path = "/")
    public HashMap index() {
        return new HashMap(){{
            put("hello", "world");
        }};
    }

    @GetMapping(path = "/secure-random")
    public HashMap secureRandom() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(secureRandom.generateSeed(24));
        return new HashMap(){{
            put("random-value", String.format("%06d", secureRandom.nextInt(1000000)));
        }};
    }

    @GetMapping(path = "/secure-random-new")
    public HashMap secureRandomNew() throws Exception {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        secureRandom.setSeed(secureRandom.generateSeed(24));
        return new HashMap(){{
            put("random-value", String.format("%06d", secureRandom.nextInt(1000000)));
        }};
    }
}
