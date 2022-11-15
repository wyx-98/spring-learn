package com.wyx.spring.learn.handler;

import com.alibaba.fastjson.JSON;
import com.wyx.spring.learn.model.EmailEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wangyaokun
 * @date 2022/8/10 16:26
 * @description KafkaSmartProducer
 */
@Slf4j
@Component
public class KafkaSmartProducer {

    @Resource
    private KafkaTemplate<String, String> template;

    public final static String TOPIC_EMAIL = "email-platform-topic";

    /**
     * 邮件发送专属方法
     *
     * @param emailEntity 邮件实体
     */
    public void sendMessage(EmailEntity emailEntity) {
        try {
            log.info("on message:{}", emailEntity);
            SendResult<String, String> recordMetadata = this.template.send(new ProducerRecord<>(TOPIC_EMAIL, JSON.toJSONString(emailEntity))).get();
            log.info("recordMetadata: {}", recordMetadata);
            if (log.isDebugEnabled()) {
                log.debug("send message:{}", emailEntity.toString());
            }
        } catch (Exception e) {
            log.error("error sending message", e);
        }
    }

}
