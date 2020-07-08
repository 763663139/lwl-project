package com.aaa.lwl.UserController;

import com.aaa.lwl.base.BaseService;
import com.aaa.lwl.base.CommonController;
import com.aaa.lwl.base.ResultData;
import com.aaa.lwl.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyh
 * date 2020-07-08
 */
@RestController
public class UserController extends CommonController<User> {
    @Autowired
    private UserService userService;

    @Override
    public BaseService<User> getBaseService() {
        return userService;
    }
    @PostMapping("/add")
    public ResultData add(User user){
        return userService.insertData(user);
    }
    @PostMapping("/add")
    public ResultData selectAllRoles(){
        return userService.selectAllRoles();
    }
}
