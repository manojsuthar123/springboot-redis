package com.learn.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private int id;
    private String name;
    private char gender;
}
