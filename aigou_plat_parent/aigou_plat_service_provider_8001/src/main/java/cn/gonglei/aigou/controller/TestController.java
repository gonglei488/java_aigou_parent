package cn.gonglei.aigou.controller;

import cn.gonglei.aigou.common.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/plat")
public class TestController {
    @RequestMapping("/test")
    private AjaxResult test(){
        Map<String,String> map = new HashMap<>();
        map.put("pink","文");
        return AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject(map);

    }
}
