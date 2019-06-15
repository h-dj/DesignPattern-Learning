package cn.hdj.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hdj
 * @Description: 组合模式
 * @Version 1.0
 */
public interface Component {
    void operate();
}

class Leaf implements Component {

    @Override
    public void operate() {
    }
}

/*
容器
*/
interface Composite extends Component {

    void addComponent(Component component);
}

class RealComposite implements Composite {
    private List<Component> list = new ArrayList<>();


    @Override
    public void operate() {
        for (Component component : list) {
            component.operate();
        }
    }


    @Override
    public void addComponent(Component component) {
        list.add(component);
    }
}