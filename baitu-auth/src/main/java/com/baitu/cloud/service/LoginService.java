package com.baitu.cloud.service;

import com.baitu.cloud.client.UserServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:53
 * TODO remark
 */
@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserServiceClient userServiceClient;


}
