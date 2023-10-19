package com.example.model;

import lombok.Data;

/**
 * title: OauthClient
 * description: oath2的client
 *
 * @author iok_own
 * date 2023/10/19 10:07
 */
@Data
public class OauthClient implements Id<String>{
    private String id;

    private String clientId;

    private String name;

    private String clientSecret;

    private String allowUrl;

    private Long createAt;
}
