package com.wolf.sty.controller;

import com.wolf.sty.common.vo.JSONResult;
import com.wolf.sty.redis.CommonRedisDao;
import com.wolf.sty.service.ISysParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2020/9/17.
 */
@RestController
public class RedisController {

    @Autowired
    private CommonRedisDao commonRedisDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ISysParamService sysParamService;

    @RequestMapping(value = "/setVal", method = RequestMethod.GET)
    public JSONResult setVal() {
        commonRedisDao.set("wolf","wolf-spring-boot");
        return new JSONResult();
    }
    @RequestMapping(value = "/setVal2", method = RequestMethod.GET)
    public JSONResult setVal2() {
        redisTemplate.opsForValue().set("wolf:sty01","wolf-spring-boot");
        return new JSONResult();
    }

    @RequestMapping(value = "/setVal3", method = RequestMethod.GET)
    public JSONResult setVal3() {
        redisTemplate.opsForValue().set("wolf:sty02","wolf-spring-boot2");
        commonRedisDao.set("wolf:sty02","wolf-spring-boot1");
        return new JSONResult(commonRedisDao.get("wolf:sty02"));
    }

    @RequestMapping(value = "/setVal4", method = RequestMethod.GET)
    public JSONResult setVal4() {
        commonRedisDao.set("wolf:sty03","wolf-spring-boot1");
        redisTemplate.opsForValue().set("wolf:sty03","wolf-spring-boot2");
        return new JSONResult(commonRedisDao.get("wolf:sty03"));
    }

    @RequestMapping(value = "/getValueByCode", method = RequestMethod.GET)
    public JSONResult getValueByCode(String code) {
        return new JSONResult(sysParamService.getValueByCode(code));
    }
}
