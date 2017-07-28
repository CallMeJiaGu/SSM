package cn.gradle.demo.serivceImpl;

import cn.gradle.demo.dao.UserMapper;
import cn.gradle.demo.modle.User;
import cn.gradle.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dell on 2017/7/28.
 */


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insert(User user) {
        userMapper.insert(user);
        return user.getUserId();
    }
}
