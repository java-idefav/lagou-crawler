package com.wzx.lagou.model;

import com.wzx.lagou.model.dto.TbCompanyDto;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class MongoDbCompanyPojo {
    private ObjectId _id;
    private String company_id;
    private String company_name;
    private Double maxSalary;
    private Double minSalary;
    private TbCompanyDto company_info;
}
