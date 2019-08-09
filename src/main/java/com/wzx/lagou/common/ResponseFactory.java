package com.wzx.lagou.common;

/**
 * The type Response factory.
 */
public class ResponseFactory {


    /**
     * Success response.
     *
     * @param <T>  the type parameter
     * @param data the data
     * @return the response
     */
    public static <T> Response<T> success(T data){
        return new Response<T>(1,data);
    }

    public static <T> Response<T> fail(String message){
        return new Response<T>(0,message);
    }
}
