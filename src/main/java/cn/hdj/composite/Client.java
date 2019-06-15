package cn.hdj.composite;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractFile image = new ImageFile("meizi.png");
        AbstractFile text = new TextFile("javanote.txt");
        Folder folder = new Folder("老王的文件夹");

        folder.addFile(image);
        folder.addFile(text);
        //整个文件夹杀毒
        folder.killVirus();

        //单个文件杀毒
        image.killVirus();
    }
}
