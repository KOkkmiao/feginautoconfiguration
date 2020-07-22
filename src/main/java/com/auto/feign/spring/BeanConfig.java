package com.auto.feign.spring;

import com.auto.feign.contract.ContractFeign;
import feign.Feign;
import feign.jackson.JacksonEncoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 35716 <a href="xiaopeng.miao@1hai.cn">Contact me.</a>
 * @version 1.0
 * @since 2020/07/22 10:26
 * desc :
 */
@Configuration
public class BeanConfig {
    @Bean
    @ConditionalOnMissingBean(Feign.Builder.class)
    public Feign.Builder getBuilder() {
        return Feign
                .builder()
                .contract(new ContractFeign())
                .encoder(new JacksonEncoder());
    }
}
