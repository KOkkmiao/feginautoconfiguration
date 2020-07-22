import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 35716 <a href="xiaopeng.miao@1hai.cn">Contact me.</a>
 * @version 1.0
 * @since 2020/07/22 10:18
 * desc : 扫描路径包
 */
@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class Application {
}

