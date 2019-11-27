package com.controller;

import com.config.AppConfig;
import com.entity.DeptEntity;
import com.service.DeptService;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * @author SherWin
 * @date 2019/11/11 18:44
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;
    @RequestMapping("/insert")
    public ModelAndView insertController(@Valid DeptEntity deptEntity, BindingResult bindingResult){
        /*self这种需要请求对像，所以需要占用参数位置，而这里的方法参数位置另有他用故不用这样的容器对象*/
        //ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        /*第一种：
        AnnotationConfigWebApplicationContext context= new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class);
        context.refresh();*/
       /* AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();*/
       // 第二种：
        /*ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        */
       /* DeptService deptService=context.getBean(DeptService.class);*/
        ModelAndView modelAndView = new ModelAndView("index");
        String errorText=null;
        if(bindingResult.hasErrors()){
            List<ObjectError> errors=bindingResult.getAllErrors();
            for (ObjectError error : errors) {
                errorText+=error.getDefaultMessage()+"\\n";
            }
            modelAndView.addObject("deptname",deptEntity.getDeptname());
            modelAndView.addObject("errortext",errorText);
            return modelAndView;
        }else {
            deptService.insert(deptEntity.getDeptname());
            return modelAndView;
        }

    }

}
