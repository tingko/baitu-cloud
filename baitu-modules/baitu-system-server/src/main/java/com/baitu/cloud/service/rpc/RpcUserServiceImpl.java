package com.baitu.cloud.service.rpc;

import com.baitu.cloud.mapper.UserMapper;
import com.baitu.cloud.model.entity.UserEntity;
import com.baitu.cloud.rpc.RpcUserService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:48
 * TODO remark
 */
@RestController
@RequiredArgsConstructor
public class RpcUserServiceImpl implements RpcUserService {

    private final UserMapper userMapper;

    @Override
    public UserEntity findByUsername(String username) {
        return userMapper.selectOne(Wrappers.<UserEntity>query().lambda().eq(UserEntity::getUsername, username));
    }

    @Override
    public UserEntity findByUserId(Long userId) {
        return userMapper.selectById(userId);
    }

}
