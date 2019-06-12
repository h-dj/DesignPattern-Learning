package cn.hdj.bridge;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public interface Computer {
    void sale();
}

abstract class AbstractComputer implements Computer {
    private Brand brand;

    public AbstractComputer(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void sale() {
        brand.sale();
    }
}

class Latop extends AbstractComputer {
    public Latop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}

class Desktop extends AbstractComputer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式");
    }
}