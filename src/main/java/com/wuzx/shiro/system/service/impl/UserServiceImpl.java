package com.wuzx.shiro.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuzx.shiro.system.entity.Module;
import com.wuzx.shiro.system.entity.User;
import com.wuzx.shiro.system.mapper.UserMapper;
import com.wuzx.shiro.system.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author 孙志强
 * @since 2020-04-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User queryByUserName(String username) {
        return this.getOne(new QueryWrapper<User>().eq("username", username));
    }

    @Override
    public List<String> getRoleCodeList(Long userId) {
        return baseMapper.getRoleCodeList(userId);
    }

    @Override
    public List<String> queryAllPerms(Long userId) {
        return baseMapper.queryAllPerms(userId);
    }

    @Override
    public List<Module> findMenuListByUserId(Long userId) {
        return baseMapper.findMenuListByUserId(userId);
    }
}
