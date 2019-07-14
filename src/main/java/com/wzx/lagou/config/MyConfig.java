package com.wzx.lagou.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "http-client")
@PropertySource(value = "classpath:myconfig.properties")
public class MyConfig {
    private String cookie;
    private String referer;
    private String useraAgent;

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getUserAgent() {
        return useraAgent;
    }

    public void setUserAgent(String userAgent) {
        this.useraAgent = userAgent;
    }
}

