package com.wzx.lagou.mongodb;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * MongoDB操作类
 */
@Component
public class MongoDbTestDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 添加记录
     *
     * @param mongoTestPojo MongoTestPojo对象
     */
    public MongoTestPojo saveTest(MongoTestPojo mongoTestPojo){
        MongoTestPojo save = mongoTemplate.save(mongoTestPojo,"test");
        return save;
    }

    /**
     * 查找记录
     *
     * @param name 姓名
     * @return MongoTestPojo对象
     */
    public MongoTestPojo findTestByName(String name){
        Query query = new Query(Criteria.where("name").is(name));
        MongoTestPojo pojo = mongoTemplate.findOne(query, MongoTestPojo.class);
        return pojo;
    }

    /**
     * 更新记录
     *
     * @param mongoTestPojo MongoTestPojo对象
     */
    public void updateTestByName(MongoTestPojo mongoTestPojo){
        Query query = new Query(Criteria.where("name").is(mongoTestPojo.getName()));
        Update update = new Update().set("name", mongoTestPojo.getName()).set("sex", mongoTestPojo.getGender());
        UpdateResult result = mongoTemplate.updateFirst(query, update, MongoTestPojo.class);
    }

    /**
     * 删除记录
     *
     * @param id the id
     */
    public void deleteTestById(Integer id){
        Query query = new Query(Criteria.where("id").is(id));
        DeleteResult result = mongoTemplate.remove(query, MongoTestPojo.class);
    }
}
