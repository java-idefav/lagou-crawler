package com.wzx.test;

import com.alibaba.fastjson.JSON;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import com.wzx.lagou.LagouApplication;
import com.wzx.lagou.mongodb.MongoDbTestDao;
import com.wzx.lagou.mongodb.MongoTestPojo;
import org.bson.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * The type Mongodb test.
 */
@SpringBootTest(classes = {LagouApplication.class})
@RunWith(SpringRunner.class)
public class MongodbTest {

    @Autowired
    private MongoDbTestDao mongoDbTestDao;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 插入数据测试
     */
    @Test
    public void addDataTest() {
        MongoTestPojo mongoTestPojo = new MongoTestPojo();
        mongoTestPojo.setId(1);
        mongoTestPojo.setName("wzx");
        mongoTestPojo.setAge(19);
        mongoTestPojo.setGender("男");
        MongoTestPojo pojo = mongoDbTestDao.saveTest(mongoTestPojo);
        System.out.println(pojo.getName());
    }

    /**
     * 查找数据测试
     */
    @Test
    public void findDataTest() {
        String name = "wzx";
        MongoTestPojo mongoTestPojo = mongoDbTestDao.findTestByName(name);
        String string = JSON.toJSONString(mongoTestPojo);
        System.out.println(string);
    }

    /**
     * 更新数据测试
     */
    @Test
    public void updateDataTest() {
        MongoTestPojo mongoTestPojo = new MongoTestPojo();
        mongoTestPojo.setId(1);
        mongoTestPojo.setName("wzx");
        mongoTestPojo.setAge(23);
        mongoTestPojo.setGender("女");
        mongoDbTestDao.updateTestByName(mongoTestPojo);
    }

    /**
     * 删除数据测试
     */
    @Test
    public void delDataTest() {
        Integer id = 1;
        mongoDbTestDao.deleteTestById(id);
    }

    @Test
    public void test() {
        MongoTestPojo model = new MongoTestPojo();
        model.setAge(10);
        model.setId(21);
        model.setName("wzx");
        model.setGender("男");
        UpdateResult updateResult = mongoTemplate.getCollection("test").replaceOne(Filters.eq("name", "wzx"), Document.parse(JSON.toJSONString(model)), new ReplaceOptions().upsert(true));
        Assert.assertTrue(updateResult.getModifiedCount()>0 || updateResult.getUpsertedId()!=null);
    }


}
