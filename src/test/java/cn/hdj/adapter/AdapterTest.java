package cn.hdj.adapter;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * @Auther: hdj
 * @Date: 2019/5/29 11:11
 * @Description:
 */
public class AdapterTest {
    @Test
    public void handler() throws Exception {
        Target t = new Adapter();
        t.handler();
}

    {
        try (Reader reader = new InputStreamReader(new FileInputStream(new File("")))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}