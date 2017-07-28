package cn.gradle.demo.dao;

import cn.gradle.demo.modle.User;
import org.springframework.stereotype.Repository;

/**
 * Created by dell on 2017/7/28.
 */

@Repository
public interface UserMapper {

    void insert(User user);
}
