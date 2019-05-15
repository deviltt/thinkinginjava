package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * TinyURL是一种URL简化服务， 比如：当你输入一个URL
 * https://leetcode.com/problems/design-tinyurl 时，
 * 它将返回一个简化的URL http://tinyurl.com/4e9iAk.
 * 要求：设计一个 TinyURL 的加密 encode 和解密 decode 的方法。
 * 你的加密和解密算法如何设计和运作是没有限制的，
 * 你只需要保证一个URL可以被加密成一个TinyURL，
 * 并且这个TinyURL可以用解密方法恢复成原本的URL。
 * 加密算法：随机生成一个六位的字母数字串，然后拼接成TinyURL，如果map中不存在，则放入map中
 * 解密算法：从map中获取shotURL键对应的值
 */
public class Solution535 {
    Map<String, String> map=new HashMap<>();
    static final String strings="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String prefix="http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        char[] chars=new char[6];
        for (int i = 0; i < chars.length; i++) {
            chars[i]=strings.charAt((int) (Math.random()*62));
        }
        String shortURL=prefix+new String(chars);
        if (!map.containsKey(shortURL)){
            map.put(shortURL, longUrl);
        }
        return shortURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
