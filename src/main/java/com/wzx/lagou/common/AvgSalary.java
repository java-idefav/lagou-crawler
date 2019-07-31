package com.wzx.lagou.common;

import com.wzx.lagou.model.dto.TbPositionsDto;

import java.util.*;

public class AvgSalary implements Comparator<Map<String,Object>>{
    public static Map<String,Double> getAvgSalary(List<TbPositionsDto> TbPositionsDtoList){
        double min = 0, max = 0;
        Map<String,Double> map = new HashMap<String, Double>();
        if (TbPositionsDtoList == null || TbPositionsDtoList.size()==0){
            map.put("avgSalaryMin", 0.0);
            map.put("avgSalaryMax", 0.0);
            return map;
        }
        for(TbPositionsDto positionsDto:TbPositionsDtoList){
            Map<String, Double> salaryMap = getSalaryToNum(positionsDto.getSalary());
            min += salaryMap.get("minSalary");
            max += salaryMap.get("maxSalary");
        }
        min = Double.valueOf(String.format("%.2f", min/(double)TbPositionsDtoList.size()));
        max = Double.valueOf(String.format("%.2f", max/(double)TbPositionsDtoList.size()));
        map.put("avgSalaryMin", min);
        map.put("avgSalaryMax", max);
        return map;
    }

    private static Map<String,Double> getSalaryToNum(String strSalary){
        Map<String,Double> map = new HashMap<String, Double>();
        strSalary = strSalary.toLowerCase();
        strSalary = strSalary.replace("k", "");
        if(strSalary.indexOf("-") > 0) {
            String[] salarys = strSalary.split("-");
            map.put("minSalary", Double.valueOf(salarys[0]));
            map.put("maxSalary", Double.valueOf(salarys[1]));
        }else if(strSalary.indexOf("以上") > 0){
            strSalary = strSalary.replace("以上","");
            map.put("minSalary", Double.valueOf(strSalary));
            map.put("maxSalary", Double.valueOf(strSalary));
        }else {
            map.put("minSalary", 0.0);
            map.put("maxSalary", 0.0);
        }
        return map;
    }

    public static List<Map<String,Object>> sortList(List<Map<String,Object>> arrayList){
        List<Map<String, Object>> order = order(true, arrayList);
        return order;
    }

    @Override
    public int compare(Map<String,Object> o1, Map<String,Object> o2) {
        if (o1.get("salary")==(o2.get("salary"))) {
            return o1.get("city").toString().compareTo(o2.get("city").toString());
        }
        return Integer.parseInt(o1.get("salary").toString())-Integer.parseInt(o2.get("salary").toString());
    }

    private static List<Map<String,Object>> order(boolean asc,List<Map<String,Object>> arrayList) {
        Comparator<Map<String,Object>> comp = asc ? new AvgSalary() : Collections.reverseOrder(new AvgSalary());
        Collections.sort(arrayList, comp);
        return arrayList;
    }
}
