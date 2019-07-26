package com.wzx.lagou.controllers.api;

import com.wzx.lagou.model.dto.TbPositionTypeDto;
import com.wzx.lagou.service.PositionTypeService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Map<String,Object> getPositionTypeList(String pageNum,String pageSize){
        return positionTypeService.selectPositionTypes(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
    }

    @RequestMapping("/gettype_typeid")
    public TbPositionTypeDto getPositionTypeByTypeId(String typeId){
        return positionTypeService.selectPositionTypeByTypeId(typeId);
    }

    @RequestMapping("/gettype_id")
    public TbPositionTypeDto getPositionTypeById(String Id){
        return positionTypeService.selectPositionTypeById(Id);
    }

    @RequestMapping("/ishave")
    public Boolean isHavePositionType(String typeId){
        return positionTypeService.isHavePositionType(typeId);
    }

    @RequestMapping("/count")
    public Integer countPositionTypeNum(){
        return positionTypeService.countPositionTypeNum();
    }
}
