package cn.hdj.bridge;

/**
 * @author hdj
 * @Description: 品牌
 * @Version 1.0
 */
public interface Brand {

    void sale();
}

class Huawei implements Brand {

    @Override
    public void sale() {
        System.out.println("销售华为品牌");
    }
}
class Xiaomi implements Brand {

    @Override
    public void sale() {
        System.out.println("销售华为品牌");
    }
}
