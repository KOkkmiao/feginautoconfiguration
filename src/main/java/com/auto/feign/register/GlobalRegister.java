package com.auto.feign.register;

import com.auto.feign.extend.BeanKeyChangeRegister;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 35716 <a href="xiaopeng.miao@1hai.cn">Contact me.</a>
 * @version 1.0
 * @since 2020/07/21 9:53
 * desc :
 */
@Component
public class GlobalRegister implements ApplicationContextAware {


    private static BeanKeyChangeRegister register;
    public static ApplicationContext applicationContext;

    public static String register(Class<?> clazz,String key){
        String returnUrl="";
        if (register!=null){
            returnUrl= register.setTargetInterFace(clazz, key);
            if (!returnUrl.contains("http")){
                throw new IllegalArgumentException(String.format("url 不规范%s",returnUrl));
            }
        }
        return returnUrl;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        GlobalRegister.applicationContext =applicationContext;
        GlobalRegister.register=applicationContext.getBean(BeanKeyChangeRegister.class);
    }
}
