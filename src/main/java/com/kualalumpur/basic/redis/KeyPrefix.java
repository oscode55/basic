package com.kualalumpur.basic.redis;

public interface KeyPrefix {
    int expireSecond();
    String getPrefix();
}
