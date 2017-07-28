package cn.gradle.demo.controller;

import cn.gradle.demo.modle.User;
import cn.gradle.demo.rest.Response;
import cn.gradle.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by dell on 2017/7/28.
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public Response userLogin(@RequestBody Map<String,String> map){
        Response response = new Response();
        User user = new User();
        try{
            user.setUserName(map.get("name"));
            user.setUserPassword(map.get("passWord"));
            Integer userId = userService.insert(user);
            response.success(userId);
        }catch (Exception e){
            e.printStackTrace();
            response.failure("登陆失败");
        }
        return response;
    }
}
