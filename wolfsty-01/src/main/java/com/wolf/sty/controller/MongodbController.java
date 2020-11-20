package com.wolf.sty.controller;

import com.wolf.sty.bean.User;
import com.wolf.sty.common.vo.JSONResult;
import com.wolf.sty.util.DateUtils;
import com.wolf.sty.util.JSONHelper;
import javolution.util.FastList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by user on 2020/9/17.
 */
@RestController
@RequestMapping("/mongodb/")
public class MongodbController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/initBean", method = RequestMethod.GET)
    public JSONResult getValueByCode(String code) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUserName("郑先生1");
        user.setAddress("23");
        user.setPhone("181");
        user.setAddress("四川成都");
        user.setApp("ssss");
        user.setAppVersion("3.1.0");
        user.setDate(DateUtils.getDate());
        List<Map> proList = FastList.newInstance();
        Map pro = new HashMap();
        pro.put("key1","value1");
        pro.put("sex","1");
        pro.put("level","18");
        pro.put("idfa","sfwerwerdf");
        proList.add(pro);
        Map pro1 = new HashMap();
        pro1.put("ynlx","E");
        pro1.put("yhName","战三");
        pro1.put("yhAddress","石河子啊啊啊啊");
        pro1.put("payAmount","88");
        proList.add(pro1);
        user.setProList(proList);
        mongoTemplate.save(user);
        return new JSONResult();
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public JSONResult getById(String id) {
        Criteria criteria = Criteria.where("id").is(id).where("proList.key1").exists(true).where("proList.payAmount").gte("80");
                //.and("proList.idfa").is("sfwerwerdf");
        Query query = Query.query(criteria);
        //query.addCriteria(Criteria.where("proList.id").is("sfwerwerdf"));
        List<User> userList = mongoTemplate.find(query,User.class);
        System.out.println(JSONHelper.array2json(userList));
        return new JSONResult(mongoTemplate.findById(id,User.class));
    }

    @RequestMapping(value = "/searchByName", method = RequestMethod.GET)
    public JSONResult searchByName(String name) {
        /**
         * regex like
         * and 等于
         */
        Criteria criteria = Criteria.where("userName").regex(name);
        Query query = Query.query(criteria);
        List<User> userList = mongoTemplate.find(query,User.class);
        System.out.println(JSONHelper.array2json(userList));
        return new JSONResult(mongoTemplate.findById(name,User.class));
    }


}
