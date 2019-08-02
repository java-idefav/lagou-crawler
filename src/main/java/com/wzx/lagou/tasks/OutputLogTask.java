package com.wzx.lagou.tasks;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.result.UpdateResult;
import com.wzx.lagou.common.AvgSalary;
import com.wzx.lagou.common.RedisUtils;
import com.wzx.lagou.config.MyConfig;
import com.wzx.lagou.model.auto.TbCompany;
import com.wzx.lagou.model.auto.TbPosition;
import com.wzx.lagou.model.dto.*;
import com.wzx.lagou.service.CityService;
import com.wzx.lagou.service.CompanyService;
import com.wzx.lagou.service.PositionTypeService;
import com.wzx.lagou.service.PositionsService;
import ma.glasnost.orika.MapperFacade;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.*;

@Component
@EnableScheduling
public class OutputLogTask {

    @Resource
    private RedisUtils redisUtils;

    @Resource
    private MapperFacade mapperFacade;

    @Resource
    private CompanyService companyService;

    @Resource
    private PositionTypeService positionTypeService;

    @Resource
    private CityService cityService;

    @Resource
    private PositionsService positionsService;

    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    private MyConfig myConfig;

    @Scheduled(cron="45 42 3/5 * * ?")
//    @Scheduled(cron="0/10 * * * * ?")
    private void outputLod() throws IOException {
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println("现在是："+sdf.format(new Date()));
        //redis操作
        //redisUtils.set("redis_key", new Date().toString());
        //redisUtils.delete("redis_key");
        //=========================序列化、反序列===========================================
//        //jackson序列化、反序列化
//        TbUserDto userDto = new TbUserDto();
//        userDto.setId(1);
//        userDto.setUserId("zhangsan");
//        userDto.setUserPwd("zhangsan123");
//
//        ObjectMapper mapper = new ObjectMapper();
//        //Obj => Json
//        String json = mapper.writeValueAsString(userDto);
//        System.out.println(json);
//        //Json => Obj
//        json = "{\"id\":2,\"userId\":\"lisi\",\"userPwd\":\"lisi123\"}";
//        TbUserDto user = mapper.readValue(json, TbUserDto.class);
//        System.out.println(user);
//
//        //fastjson序列化、反序列化
//        //TbUserDto userDto = new TbUserDto();
//        userDto.setId(1);
//        userDto.setUserId("zhangsan");
//        userDto.setUserPwd("zhangsan123");
//
//        //JSONObject jsonObject = new JSONObject(string);
//        //Obj => Json
//        String jsonString = JSON.toJSONString(userDto);
//        System.out.println(jsonString);
//        //Json => Obj
//        json = "{\"id\":2,\"userId\":\"lisi\",\"userPwd\":\"lisi123\"}";
//        user = JSON.parseObject(json, TbUserDto.class);
//        System.out.println(user);

        //==================抓取公司数据=======================================================
//        String cookie = "_ga=GA1.2.1887885701.1559088698; user_trace_token=20190529081143-56fffa4c-81a6-11e9-a7f0-525400f775ce; LGUID=20190529081143-56fffd69-81a6-11e9-a7f0-525400f775ce; LG_HAS_LOGIN=1; index_location_city=%E4%B8%8A%E6%B5%B7; _gid=GA1.2.1810111922.1562644475; LG_LOGIN_USER_ID=5489c0205ec0bdb2af7fa33cf5ed0bc9f3f985508a56415b04f0c494a17d4a72; showExpriedIndex=1; showExpriedCompanyHome=1; showExpriedMyPublish=1; hasDeliver=96; gate_login_token=ddc81292e662496bd96997a285d9ce41ff0f88f346fdc760f8b9d2795dcd9d48; privacyPolicyPopup=false; JSESSIONID=ABAAABAABEEAAJAE5D1A141EEAC236EEECBE22009223438; _putrc=57271BB4DCFF207D123F89F2B170EADC; login=true; unick=%E5%90%B4%E5%AD%90%E5%B9%B8; Hm_lvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1562644475,1562660384,1562735301,1562738011; SEARCH_ID=4e01d6081c6f4afe93a7e75b8f96128c; TG-TRACK-CODE=search_code; X_HTTP_TOKEN=d5bed1e0f71466570572472651bc6b0411fb01729d; _gat=1; Hm_lpvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1562750831; LGSID=20190710172714-e72a3841-a2f4-11e9-be2a-525400f775ce; PRE_UTM=; PRE_HOST=; PRE_SITE=https%3A%2F%2Fsec.lagou.com%2Fverify.html%3Fe%3D3%26f%3Dhttps%3A%2F%2Fwww.lagou.com%2Fgongsi%2F; PRE_LAND=https%3A%2F%2Fwww.lagou.com%2Fgongsi%2F; LGRID=20190710172714-e72a3989-a2f4-11e9-be2a-525400f775ce";
//        Boolean status = false;
//        for (int i = 1;i <= 20;i++){
//            status = getCompanyData(Integer.toString(i), myConfig.getCookie());
//            if (!status){
//                break;
//            }
//        }
//        if (status){
//            System.out.println("全部数据导入成功！");
//        }

        //======================抓取职位类型================================================
//        getPositionTypeData();

        //======================抓取城市数据================================================
//        getCityData();

//        =================修正WorkYear错误============
//        Integer count = positionsService.countPositionNum();
//        double pages = Math.ceil((double)count / (double) 50);
//        for (int i=1;i<=pages;i++){
//            Map<String, Object> map = positionsService.selectAllPositionPaging(i, 100);
//            List<TbPositionsDto> positionsDtoList = (List<TbPositionsDto>)map.get("objList");
//            List<TbPositionsDto> positionsDtos = mapperFacade.mapAsList(positionsDtoList, TbPositionsDto.class);
//            for(TbPositionsDto positionsDto:positionsDtos) {
//                positionsDto.setWorkYear(positionsDto.getWorkYear().replace(positionsDto.getSalary(), "").trim());
//                Boolean updatePosition = positionsService.updatePosition(positionsDto);
//            }
//            System.out.println(i);
//        }

        //======================抓取公司职位数据================================================
//        List<TbCityDto> cityDtos = cityService.selectCityDto();
//        List<TbPositionTypeDto> positionTypeDtos = positionTypeService.selectPositionTypes();
//        for (TbCityDto cityDto:cityDtos) {
//            for (TbPositionTypeDto positionTypeDto:positionTypeDtos) {
//                System.out.println(cityDto.getCityName()+"=>"+positionTypeDto.getType());
//                getPositionsData(cityDto.getCityName(), positionTypeDto.getTypeId(), positionTypeDto.getTypeUrl(), 1);
//            }
//        }
        //======================计算公司平均工资================================================
//        updataAvgSalaryByCity();

        //======================补全公司名单================================================
//        updateCompanyData();
        //======================计算公司平均工资================================================
//        calcCompanyAvgSalary();
        //======================company数据写入MongoDB================================================
//        calcAvgSalaryToMogondb();
    }

    /**
     * 抓取公司数据
     * @param pageNum 第pageNum页显示的公司
     * @param cookie 请求数据时需要cookie
     * @return true表示抓取成功，false表示抓取失败
     * @throws IOException
     */
    private Boolean getCompanyData(String pageNum,String cookie) throws IOException {

        ObjectMapper mapper = new ObjectMapper();//jackson解析json

        MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();
        map.add("first","false");
        map.add("pn",pageNum);
        map.add("sortField","0");
        map.add("havemark","0");
        //请求外部api的json数据
        RestTemplate template = new RestTemplate();
        //ResponseEntity<String> response = template.getForEntity("https://www.lagou.com/gongsi/0-0-0-0.json",String.class);
        HttpHeaders headers = new HttpHeaders();

        headers.add(HttpHeaders.REFERER, "https://www.lagou.com/gongsi/");
        headers.add(HttpHeaders.COOKIE, cookie);
//        List<String> cookieList=new ArrayList<String>();
//
//        String cookieStr="_ga=GA1.2.1887885701.1559088698; user_trace_token=20190529081143-56fffa4c-81a6-11e9-a7f0-525400f775ce; LGUID=20190529081143-56fffd69-81a6-11e9-a7f0-525400f775ce; LG_HAS_LOGIN=1; index_location_city=%E4%B8%8A%E6%B5%B7; _gid=GA1.2.1810111922.1562644475; LG_LOGIN_USER_ID=5489c0205ec0bdb2af7fa33cf5ed0bc9f3f985508a56415b04f0c494a17d4a72; showExpriedIndex=1; showExpriedCompanyHome=1; showExpriedMyPublish=1; hasDeliver=96; gate_login_token=ddc81292e662496bd96997a285d9ce41ff0f88f346fdc760f8b9d2795dcd9d48; privacyPolicyPopup=false; SEARCH_ID=5d3d39b307b942098baa1e3ecdd5a55c; JSESSIONID=ABAAABAABEEAAJA3F9E216A7501174E115B577F288C05BA; _putrc=57271BB4DCFF207D123F89F2B170EADC; login=true; unick=%E5%90%B4%E5%AD%90%E5%B9%B8; Hm_lvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1561849675,1562644475,1562660384; TG-TRACK-CODE=index_company; _gat=1; LGSID=20190709192208-c9e0b730-a23b-11e9-a4dd-5254005c3644; PRE_UTM=; PRE_HOST=; PRE_SITE=https%3A%2F%2Fwww.lagou.com%2F; PRE_LAND=https%3A%2F%2Fwww.lagou.com%2Fgongsi%2F; X_HTTP_TOKEN=d5bed1e0f71466574531762651bc6b0411fb01729d; LGRID=20190709192256-e686d8e6-a23b-11e9-a4dd-5254005c3644; Hm_lpvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1562671374";
//        String[] split = cookieStr.split("; ");
//        cookieList.addAll(Arrays.asList(split));
//        headers.put(HttpHeaders.COOKIE  ,cookieList);
        headers.add(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
//        headers.add(HttpHeaders.HOST, "www.lagou.com");
//        headers.add(HttpHeaders.ACCEPT, "*/*");
        HttpEntity<MultiValueMap<String, String>> formeEntity = new HttpEntity<MultiValueMap<String, String>>(map,headers);

        ResponseEntity<String> response = template.postForEntity("https://www.lagou.com/gongsi/0-0-0-0.json", formeEntity, String.class);
        String bodyJsonStr = response.getBody();
//        System.out.println(response.getBody());

        JsonNode node = mapper.readTree(bodyJsonStr);
        String resultNode = node.findValue("result").toString();
        List<TbCompanyDto> companyDtoList = mapper.readValue(resultNode, new TypeReference<List<TbCompanyDto>>() {});
        List<TbCompany> companyList = mapperFacade.mapAsList(companyDtoList, TbCompany.class);
        Boolean status = false;
        for (TbCompany company:companyList) {
            List<TbCompanyDto> companies = companyService.selectCompanyByCompanyId(company.getCompanyId());
            if (companies.size()>0) {
                status = companyService.updateCompany(company);
            }else {
                status = companyService.insertCompany(company);
            }
            if (!status){
                break;
            }
        }
        if (status){
            System.out.println("第"+pageNum+"页导入数据成功！");
            return true;
        }else {
            System.out.println("第"+pageNum+"页导入数据失败！");
            return false;
        }
    }

    /**
     * 抓取职位类型
     * @return true表示抓取成功，false表示抓取失败
     */
    private Boolean getPositionTypeData() throws UnsupportedEncodingException {
        HttpHeaders headers = new HttpHeaders();
//        headers.add(HttpHeaders.COOKIE, "index_location_city=%E4%B8%8A%E6%B5%B7;");
        headers.add(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
        HttpEntity<MultiValueMap<String, String>> formeEntity = new HttpEntity<MultiValueMap<String, String>>(null,headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntityhtml = restTemplate.getForEntity("https://www.lagou.com", String.class);
        Document document = Jsoup.parse(forEntityhtml.getBody());
//        Elements elements = document.select("div.mainNavs > div:nth-child(1) .category-list > h2");
        Elements elements = document.select("div.mainNavs > div.menu_box");
        List<TbPositionTypeDto> positionTypeDtos = positionTypeService.selectPositionTypes();
        Boolean result= true;
        for(Element element:elements){
            String text = element.select(".category-list > h2").text().trim();
            System.out.println(text);
            Elements elements1 = element.select("div.menu_sub > dl");
            for(Element element1:elements1){
                String tdText = element1.select("dt > span").get(0).text().trim();
                System.out.println(tdText);
                Elements ddElements = element1.select("dd a");
                String[] ddTextList = element1.select("dd h3").text().trim().split(" ");
                System.out.println(ddTextList.length);
                for(int i = 0;i<ddElements.size();i++){
                    TbPositionTypeDto positionTypeDto = new TbPositionTypeDto();
                    positionTypeDto.setTypeId(ddElements.get(i).attr("data-lg-tj-id")+"-"+ddElements.get(i).attr("data-lg-tj-no"));
                    positionTypeDto.setType(ddTextList[i]);
                    positionTypeDto.setBranch(tdText);
                    positionTypeDto.setLargeType(text);
                    positionTypeDto.setTypeUrl(URLDecoder.decode(ddElements.get(i).attr("href"), "utf-8"));
                    Boolean isHave = false;

                    for (TbPositionTypeDto typeDto:positionTypeDtos){
                        if (typeDto.getTypeId().equals(positionTypeDto.getTypeId())) {
                            isHave=!isHave;
                            Boolean updateStatus = false;
//                            if (typeDto.getType()==null || typeDto.getBranch()==null || typeDto.getLargeType()==null || typeDto.getTypeUrl()==null) {
//                                updateStatus = positionTypeService.updatePositionType(positionTypeDto);
//                            }
                            if ( typeDto.getType()==null || typeDto.getBranch()==null || typeDto.getLargeType()==null || typeDto.getTypeUrl()==null || !typeDto.getType().equals(positionTypeDto.getType()) || !typeDto.getBranch().equals(positionTypeDto.getBranch()) || !typeDto.getLargeType().equals(positionTypeDto.getLargeType()) || !typeDto.getTypeUrl().equals(positionTypeDto.getTypeUrl())) {
                                updateStatus = positionTypeService.updatePositionType(positionTypeDto);
                            }

                            if (updateStatus){
                                System.out.println(text+"=>"+tdText+"=>"+ddTextList[i]+"|||记录已更新！");
                            }else {
                                System.out.println(text+"=>"+tdText+"=>"+ddTextList[i]+"|||记录未更新！");
                            }
                            break;
                        }
                    }
                    if (!isHave) {
                        Boolean insertStatus = positionTypeService.insertPositionType(positionTypeDto);
                        if (insertStatus){
                            System.out.println(text+"=>"+tdText+"=>"+ddTextList[i]+"|||添加记录成功！");
                        }else {
                            System.out.println(text+"=>"+tdText+"=>"+ddTextList[i]+"|||添加记录失败！");
                            result = false;
                        }
                    }
                }
            }
        }
//        String text = elements.get(0).text().trim();
//        System.out.println(text);
        return result;
    }

    /**
     * 抓取城市列表
     * @return true表示抓取成功，false表示抓取失败
     */
    private Boolean getCityData(){
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
        HttpEntity<String> requestEntity = new HttpEntity<String>(null,headers);
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String,String> params = new LinkedMultiValueMap<String, String>();
        ResponseEntity<String> response = restTemplate.exchange("https://www.lagou.com/jobs/allCity.html", HttpMethod.GET,requestEntity, String.class, params);
        String html = response.getBody();
        Document document = Jsoup.parse(html);
        Elements elements = document.select("table.word_list ul.city_list a");
        List<TbCityDto> cityDtos = cityService.selectCityDto();
        Boolean result = true;
        for(Element element:elements){
            TbCityDto cityDto = new TbCityDto();
            cityDto.setCityName(element.text().trim());
            cityDto.setUrl(element.attr("href").trim());
            Boolean isHave = false;
            for (TbCityDto city:cityDtos){
                if (city.getCityName().equals(cityDto.getCityName())){
                    isHave = true;
                    if (!city.getUrl().equals(cityDto.getUrl())) {
                        Boolean updateStatus = cityService.updateCity(cityDto);
                        if (updateStatus){
                            System.out.println(cityDto.getCityName()+"=>记录已更新！");
                        }else {
                            System.out.println(cityDto.getCityName()+"=>记录更新失败！");
                            result = false;
                        }
                    }else {
                        System.out.println(cityDto.getCityName()+"|||记录未更新！");
                    }
                }
            }
            if (!isHave){
                Boolean insertStatus = cityService.insertCity(cityDto);
                if (insertStatus){
                    System.out.println(cityDto.getCityName()+"=>添加记录成功！");
                }else {
                    System.out.println(cityDto.getCityName()+"=>添加记录失败！");
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * 抓取职位列表
     * @param cityNmae 城市
     * @param positionTypeUrl 职位类型Url
     * @param page 页数
     * @return true表示抓取成功，false表示抓取失败
     * @throws UnsupportedEncodingException
     */
    private Boolean getPositionsData(String cityNmae,String typeId,String positionTypeUrl,Integer page) throws UnsupportedEncodingException {
        Boolean result = true;
        try {
            HttpHeaders headers = new HttpHeaders();
//            positionTypeUrl = URLDecoder.decode(positionTypeUrl, "utf-8");//URL解码
            headers.add(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
            headers.add(HttpHeaders.COOKIE, String.format("index_location_city=%s;", URLEncoder.encode(cityNmae, "utf-8")));
            HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
            MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
            params.add("filterOption", page.toString());
            String url = String.format("%s%d/", positionTypeUrl, page);
            System.out.println(url);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class, params);
            String html = response.getBody();
            Document document = Jsoup.parse(html);
            Integer totalPage = Integer.parseInt(document.select("div.page-number .totalNum").text());
            System.out.println(String.format("共%d页",totalPage));
            Elements elementPositionsList = document.select(".con_list_item");

            //Boolean isHaveElement = false;//用于判断
            for (Element elementPosition : elementPositionsList) {
                //isHaveElement = true;
                //创建用于写入数据库的TbPositionsDto对象
                TbPositionsDto positionsDto = new TbPositionsDto();
                positionsDto.setCity(cityNmae);
                positionsDto.setTypeId(typeId);

                positionsDto.setPositionId(elementPosition.attr("data-positionid").trim());
                positionsDto.setSalary(elementPosition.attr("data-salary").trim());
                positionsDto.setCompanyName(elementPosition.attr("data-company").trim());
                positionsDto.setPositionName(elementPosition.attr("data-positionname").trim());
                positionsDto.setCompanyId(elementPosition.attr("data-companyid").trim());
                positionsDto.setHrId(elementPosition.attr("data-hrid").trim());

                Elements elementLink = elementPosition.select("a.position_link");
                positionsDto.setPositionUrl(elementLink.attr("href").trim());
                positionsDto.setLocation(elementLink.select("em").text().trim());

                positionsDto.setCreateTime(elementPosition.select("span.format-time").text().trim());

                String strExps = elementPosition.select("div.list_item_top .li_b_l").text().trim();
                strExps = strExps.replace(positionsDto.getSalary(), "");
                String[] strlist = strExps.split("/");
                positionsDto.setWorkYear(strlist[0].trim());
                positionsDto.setEducation(strlist[1]);

                positionsDto.setCompanyUrl(elementPosition.select("div.company_name a").attr("href").trim());
                positionsDto.setCompanyMark(elementPosition.select("i.company_mark span").text().trim());

                String strCompanyInfo = elementPosition.select("div.industry").text().trim();
                String[] split = strCompanyInfo.split("/");
                positionsDto.setIndustryField(split[0].trim());
                positionsDto.setFinanceStage(split[1].trim());
                positionsDto.setCompanySize(split[2].trim());

                positionsDto.setCompanyLogo(elementPosition.select("div.com_logo img").attr("src").trim());

                String strPositionLabe = elementPosition.select("div.list_item_bot .li_b_l").text().replace(' ', ',');
                positionsDto.setPositionLabelList(strPositionLabe);

                positionsDto.setPositionAdvantage(elementPosition.select("div.list_item_bot .li_b_r").text().trim());

                Boolean isHave = positionsService.isHavePosition(positionsDto.getPositionId());
                if (!isHave) {
                    Boolean insertStatus = positionsService.insertPositions(positionsDto);
                    if (insertStatus) {
                        System.out.println(positionsDto.getPositionName() + "=>添加职位成功！");
                    } else {
                        System.out.println(positionsDto.getPositionName() + "=>添加职位失败！");
                        result = false;
                    }
                } else {
                    Boolean updateStatus = positionsService.updatePosition(positionsDto);
                    if (updateStatus) {
                        System.out.println(positionsDto.getPositionName() + "=>更新职位成功！");
                    } else {
                        System.out.println(positionsDto.getPositionName() + "=>更新职位失败！");
                        result = false;
                    }
                }
            }
            if (/*isHaveElement && */page < totalPage) {
                getPositionsData(cityNmae,typeId, positionTypeUrl, page + 1);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage()+"<=404页面<=找不到分页");
            result = false;
        }
        return result;
    }

    /**
     * 计算城市平均工资
     * @return 无
     */
    private void updataAvgSalaryByCity(){
        List<TbCityDto> cityDtos = cityService.selectCityDto();
        for (TbCityDto cityDto:cityDtos){
            Map<String, Object> map = positionsService.selectAllPositionByCity(cityDto.getCityName(),1, 100);
            PageInfo pageInfo = (PageInfo) map.get("pageInfo");
            List<TbPositionsDto> list = pageInfo.getList();
            int pages = pageInfo.getPages();
            if (pages>1) {
                for (int i = 2;i<=pages;i++){
                    Map<String, Object> map1 = positionsService.selectAllPositionByCity(cityDto.getCityName(),i, 100);
                    PageInfo pageInfo1 = (PageInfo) map1.get("pageInfo");
                    List<TbPositionsDto> list1 = pageInfo1.getList();
                    list.addAll(list1);
                }
            }
            Map<String, Double> avgSalaryMap = AvgSalary.getAvgSalary(mapperFacade.mapAsList(list, TbPositionsDto.class));
            DecimalFormat df = new DecimalFormat("0.00");
            cityDto.setAvgSalaryMin(df.format(avgSalaryMap.get("avgSalaryMin")));
            cityDto.setAvgSalaryMax(df.format(avgSalaryMap.get("avgSalaryMax")));
            Boolean aBoolean = cityService.updateCity(cityDto);
            System.out.println(cityDto.getCityName()+"==>"+aBoolean);
        }
    }

    /**
     * 更新company数据
     */
    private void updateCompanyData() {
        List<TbPositionsDto> positionsDtoList = positionsService.selectAllCompanys();
        for (TbPositionsDto positionsDto:positionsDtoList){
            TbCompanyDto companyDto = new TbCompanyDto();
            companyDto.setCity(positionsDto.getCity());
            companyDto.setCompanyId(positionsDto.getCompanyId());
            companyDto.setCompanyShortName(positionsDto.getCompanyName());
            companyDto.setCompanyLogo(positionsDto.getCompanyLogo());
            companyDto.setCompanySize(positionsDto.getCompanySize());
            boolean isHave = companyService.selectCompanyByCompanyId(positionsDto.getCompanyId()).size() > 0;
            if (isHave) {
                Boolean status = companyService.updateCompany(mapperFacade.map(companyDto, TbCompany.class));
                System.out.println(positionsDto.getCompanyName()+"==>更新"+status);
            }else {
                boolean status = companyService.insertCompany(mapperFacade.map(companyDto, TbCompany.class));
                System.out.println(positionsDto.getCompanyName()+"==>添加"+status);
            }
        }
    }

    /**
     * 计算公司平均工资
     */
    private void calcCompanyAvgSalary() {
        PageInfo pageInfo = companyService.selectAllCompany(1, 100);
        List<TbCompanyDto> companylist = pageInfo.getList();
        for (int i=2;i<=pageInfo.getPages();i++){
            PageInfo pageInfo1 = companyService.selectAllCompany(i, 100);
            companylist.addAll(pageInfo1.getList());
        }
        for (TbCompanyDto companyDto:companylist){
            Map<String, Object> map = positionsService.selectAllPositionByCompany(companyDto.getCompanyId(),1, 100);
            List<TbPositionsDto> positionDtoList = mapperFacade.mapAsList((List<TbPosition>)map.get("objList"),TbPositionsDto.class);
            PageInfo pageInfo1 = (PageInfo) map.get("pageInfo");
            if (pageInfo1.getPages()>1) {
                for (int j = 2; j <= pageInfo1.getPages(); j++) {
                    map = positionsService.selectAllPositionByCompany(companyDto.getCompanyId(), j, 100);
                    positionDtoList.addAll(mapperFacade.mapAsList((List<TbPosition>)map.get("objList"),TbPositionsDto.class));
                }
            }
            Map<String, Double> avgSalary = AvgSalary.getAvgSalary(positionDtoList);
            TbCompany company = new TbCompany();
            company.setCompanyId(companyDto.getCompanyId());
            company.setAvgSalaryMin(avgSalary.get("avgSalaryMin"));
            company.setAvgSalaryMax(avgSalary.get("avgSalaryMax"));
            Boolean status = companyService.updateCompany(company);
            System.out.println(companyDto.getCompanyShortName()+"==>"+status);
        }
    }

    /**
     * 向MongoDB写入公司平均工资和公司信息docoment
     */
    private void calcAvgSalaryToMogondb(){
        PageInfo pageInfo = companyService.selectAllCompany(1, 100);
        List<TbCompanyDto> companylist = pageInfo.getList();
        for (int i=2;i<=pageInfo.getPages();i++){
            PageInfo pageInfo1 = companyService.selectAllCompany(i, 100);
            companylist.addAll(pageInfo1.getList());
        }
        for (TbCompanyDto companyDto:companylist){
            Map<String, Object> map = positionsService.selectAllPositionByCompany(companyDto.getCompanyId(),1, 100);
            List<TbPositionsDto> positionDtoList = mapperFacade.mapAsList((List<TbPosition>)map.get("objList"),TbPositionsDto.class);
            PageInfo pageInfo1 = (PageInfo) map.get("pageInfo");
            if (pageInfo1.getPages()>1) {
                for (int j = 2; j <= pageInfo1.getPages(); j++) {
                    map = positionsService.selectAllPositionByCompany(companyDto.getCompanyId(), j, 100);
                    positionDtoList.addAll(mapperFacade.mapAsList((List<TbPosition>)map.get("objList"),TbPositionsDto.class));
                }
            }
            Map<String, Double> avgSalary = AvgSalary.getAvgSalary(positionDtoList);
            Map<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("minSalary", avgSalary.get("avgSalaryMin"));
            modelMap.put("maxSalary", avgSalary.get("avgSalaryMax"));
            //写MongoDB
            modelMap.put("company_name", companyDto.getCompanyShortName());
            modelMap.put("company_id", companyDto.getCompanyId());
            modelMap.put("company_info", companyDto);
//            DBObject document = (DBObject) JSON.toJSON(companyDto);
//            modelMap.put("company_info", document);
            UpdateResult updateResult = mongoTemplate.getCollection("company").replaceOne(Filters.eq("company_id", modelMap.get("company_id").toString()), org.bson.Document.parse(JSON.toJSONString(modelMap)), new ReplaceOptions().upsert(true));
            boolean status = (updateResult.getModifiedCount() > 0 || updateResult.getUpsertedId() != null);
            //写MySQL
//            TbCompany company = new TbCompany();
//            company.setCompanyId(companyDto.getCompanyId());
//            company.setAvgSalaryMin(avgSalary.get("avgSalaryMin"));
//            company.setAvgSalaryMax(avgSalary.get("avgSalaryMax"));
//            Boolean status = companyService.updateCompany(company);
            System.out.println(companyDto.getCompanyShortName()+"==>"+status);
        }
    }

}
