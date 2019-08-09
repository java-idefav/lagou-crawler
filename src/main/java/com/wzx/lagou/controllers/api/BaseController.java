package com.wzx.lagou.controllers.api;

import com.wzx.lagou.common.Response;
import com.wzx.lagou.common.ResponseFactory;

public abstract class BaseController {

    public <T> Response<T> sucess(T data){
        return ResponseFactory.success(data);
    }

    public <T> Response<T> fail(String message){
        return ResponseFactory.fail(message);
    }
}
