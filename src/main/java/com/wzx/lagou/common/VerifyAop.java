package com.wzx.lagou.common;

import com.wzx.lagou.model.dto.TbUserDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class VerifyAop {

//    @Pointcut("execution(public * com.wzx.lagou.controllers.api.*.*(..)))")
//    private void aopPotCut(){
//
//    }
//
//    @Pointcut("aopPotCut() && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
//    private void test1(){}

    @Pointcut("@annotation(Login) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void loginAopPointCut(){}

    @Around("loginAopPointCut()")
    public Object aroundProc(ProceedingJoinPoint joinpoint){
        System.out.println("前置方法");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
//        Map<String,Object> result=new HashMap<String, Object>();
//        result.put("code", 0);
        try {
            TbUserDto user = (TbUserDto) request.getSession().getAttribute("user");

            if (user==null){
                response.setStatus(HttpStatus.UNAUTHORIZED.value());

                return ResponseFactory.fail("验证失败,没有权限!");
            }
            return joinpoint.proceed();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return ResponseFactory.fail("发生不可预料的错误!");
        }
    }

}
