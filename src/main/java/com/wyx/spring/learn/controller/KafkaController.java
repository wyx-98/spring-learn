package com.wyx.spring.learn.controller;

import com.wyx.spring.learn.handler.KafkaSmartProducer;
import com.wyx.spring.learn.model.EmailEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wangyaokun
 * @date 2022/8/11 9:31
 * @description KafkaController
 */
@RequestMapping("/kafka")
@RestController
@Api(tags = "kafka相关功能类")
public class KafkaController {

    @Autowired
    KafkaSmartProducer kafkaSmartProducer;

    @RequestMapping(value = "/send-email", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public void sendEmail(@RequestBody EmailEntity emailEntity) {
        try {
            kafkaSmartProducer.sendMessage(emailEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
