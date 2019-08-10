package com.wzx.lagou.controllers.api;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.common.Response;
import com.wzx.lagou.common.ResponseFactory;
import com.wzx.lagou.model.dto.TbPositionTypeDto;
import com.wzx.lagou.service.PositionTypeService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/lagou/type")
@ResponseBody
public class PositionTypeController {

    @Autowired
    private PositionTypeService positionTypeService;

    @Autowired
    private MapperFacade mapperFacade;

    @RequestMapping("/getlist")
    public Response<PageInfo<TbPositionTypeDto>> getPositionTypeList(Integer pageNum, Integer pageSize){
        PageInfo<TbPositionTypeDto> pageInfo = positionTypeService.selectPositionTypes(pageNum, pageSize);
        if (pageInfo == null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("未知错误,数据请求失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/gettype_typeid")
    public Response<TbPositionTypeDto> getPositionTypeByTypeId(String typeId){
        try {
            TbPositionTypeDto positionTypeDto = positionTypeService.selectPositionTypeById(typeId);
            return ResponseFactory.success(positionTypeDto);
        }catch (Exception e){
            System.out.println(e.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("未知错误,数据请求失败!");
        }
    }

    @RequestMapping("/gettype_id")
    public Response<TbPositionTypeDto> getPositionTypeById(String Id){
        try {
            TbPositionTypeDto positionTypeDto = positionTypeService.selectPositionTypeById(Id);
            return ResponseFactory.success(positionTypeDto);
        }catch (Exception e){
            e.getMessage();
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
    }

    @RequestMapping("/ishave")
    public Response<Boolean> isHavePositionType(String typeId){
        try {
            Boolean isHavePositionType = positionTypeService.isHavePositionType(typeId);
            return ResponseFactory.success(isHavePositionType);
        }catch (Exception e){
            e.getMessage();
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
    }

    @RequestMapping("/count")
    public Response<Integer> countPositionTypeNum(){
        Integer count = positionTypeService.countPositionTypeNum();
        if (count<0){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
        return ResponseFactory.success(count);
    }
}
