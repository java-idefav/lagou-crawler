package com.wzx.lagou.mongodb;


/**
 * 测试model
 */
public class MongoTestPojo {
    private Integer id;//编号
    private Integer age;//年龄
    private String name;//姓名
    private String gender;//性别

    /**
     * 无参构造方法
     */
    public  MongoTestPojo(){}

    /**
     * 有参构造方法
     *
     * @param id   编号
     * @param age  年龄
     * @param name 姓名
     * @param gender  性别
     */
    public MongoTestPojo(Integer id, Integer age, String name, String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
