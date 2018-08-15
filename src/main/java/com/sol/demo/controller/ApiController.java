package com.sol.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.sol.demo.entity.Org.Org;
import com.sol.demo.entity.Org.OrgParam;
import com.sol.demo.entity.Result;
import com.sol.demo.services.OrgService;
import com.sol.demo.services.OrgServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private OrgServiceInterface orgServiceInterface;
    @RequestMapping(path = "/api/test",method = RequestMethod.GET)
    public Result test(){
        Result result = new Result();
        return result;
    }
    @RequestMapping(path = "/api/findall",method = RequestMethod.GET)
    public List<Org> findall(){
        List<Org> test = orgServiceInterface.findall();
        return test;
    }
    @RequestMapping(path = "/api/update",method = RequestMethod.GET)
    public Result update(@Valid OrgParam orgParam, BindingResult bindingResult){
        Result result = new Result();
        if(bindingResult.hasErrors()){
            for (ObjectError error : bindingResult.getAllErrors()) {
                String re = error.getDefaultMessage();
                return JSONObject.parseObject(re, Result.class);//把json字符串解析到Result这个对象
            }
        }
        orgServiceInterface.updateByid(orgParam.getId(),orgParam.getName());
        return result;
    }
}
