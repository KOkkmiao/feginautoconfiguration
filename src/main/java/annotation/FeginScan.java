package annotation;

import org.springframework.context.annotation.Import;
import register.FeginScanerRegistrar;

import java.lang.annotation.*;

/**
 * @author 35716 <a href="xiaopeng.miao@1hai.cn">Contact me.</a>
 * @version 1.0
 * @since 2020/07/20 13:51
 * desc :
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(FeginScanerRegistrar.class)
public @interface FeginScan {

    /**
     * 扫描路径
     * @return
     */
    String baseBackage();
}
