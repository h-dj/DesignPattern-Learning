package cn.hdj.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hdj
 * @Description: 报考类缓存池
 * @Version 1.0
 */
public class SignInfo4Pool extends SignInfo {
    //考试科目+考试地点的复合字符串作为唯一的池对象标准
    private String key;

    //构造函数获得相同标志
    public SignInfo4Pool(String _key) {
        this.key = _key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
