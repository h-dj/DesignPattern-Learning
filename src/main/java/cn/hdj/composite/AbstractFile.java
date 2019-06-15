package cn.hdj.composite;

/**
 * @author hdj
 * @Description: 组合模式中的抽象组件
 * @Version 1.0
 */
public interface AbstractFile {
    void killVirus();
}

//实际组件
class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println(name + "  杀毒");
    }
}
class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println(name + "  杀毒");
    }
}