package cn.hdj.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hdj
 * @Description: 组合模式中的容器类
 * @Version 1.0
 */
public class Folder implements AbstractFile {
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    private List<AbstractFile> list = new ArrayList<>();

    public void addFile(AbstractFile file) {
        list.add(file);
    }

    @Override
    public void killVirus() {
        System.out.println(name+ "  文件夹杀毒！");
        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
