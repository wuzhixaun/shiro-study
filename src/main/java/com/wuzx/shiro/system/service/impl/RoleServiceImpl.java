package com.wuzx.shiro.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuzx.shiro.system.entity.Role;
import com.wuzx.shiro.system.mapper.RoleMapper;
import com.wuzx.shiro.system.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author 孙志强
 * @since 2020-04-13
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
