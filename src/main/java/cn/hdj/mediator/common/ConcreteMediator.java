package cn.hdj.mediator.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hdj
 * @version 1.0
 * @date 11/4/19 11:01 PM
 * @description:
 */
public class ConcreteMediator implements Mediator {

    Map<String, Colleague> colleagueMap;


    @Override
    public void register(String colleague, Colleague c) {
        if (colleagueMap == null) {
            colleagueMap = new HashMap<>();
        }
        colleagueMap.put(colleague, c);
    }

    @Override
    public void commend(String colleague) {
        Colleague c = colleagueMap.get(colleague);
        if (c != null) {
            c.selfMethod();

        }else {
            throw new IllegalArgumentException();
        }

    }
}
