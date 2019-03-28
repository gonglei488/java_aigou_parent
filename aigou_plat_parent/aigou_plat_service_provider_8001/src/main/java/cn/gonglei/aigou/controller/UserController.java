package cn.gonglei.aigou.controller;

import cn.gonglei.aigou.common.AjaxResult;
import cn.gonglei.aigou.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        //通过前台传入的用户名和密码，到数据库查询，如果数据是能对上的就登录成功，否则就失败
        //先判断用户名和密码是否正确，且不能为空
        if (user!=null&& !StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
            //这里有了密码和用户名之后就拿去与数据库的比较
            if ("admin".equals(user.getName())&&"123456".equals(user.getPassword())){
                return AjaxResult.me().setMsg("恭喜，登录成功");
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("登录失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
}
