package extend;



/**
 * @author 35716 <a href="xiaopeng.miao@1hai.cn">Contact me.</a>
 * @version 1.0
 * @since 2020/07/21 9:48
 * desc : bean实例中url变化后如何修改等操作
 */
public interface BeanKeyChangeRegister {
    String setTargetInterFace(Class<?> targetName, String key);
}

