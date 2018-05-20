package com.tg.design.structor.composite;

import com.tg.design.structor.composite.transparent.Branch;
import com.tg.design.structor.composite.transparent.Component;
import com.tg.design.structor.composite.transparent.Leaf;

/**
 * Created by eds on 2018/5/20.
 */
public class CompositeTest {

    public static void main(String args[]) {
        Component vo = transparentTest();
        print(vo);
    }

    /**
     * 透明模式测试
     */
    private static Component transparentTest() {
        Component parent = new Branch();
        parent.setId(1L);
        parent.setName("p");

        Component c1 = new Leaf();
        c1.setId(2L);
        c1.setName("c1");

        parent.add(c1);
        return parent;
    }

    private static void print(Component vo) {
        if (vo != null) {
            System.out.println("id:" + vo.getId() + ",name:" + vo.getName());
            if (vo.childrens() != null && !vo.childrens().isEmpty()) {
                vo.childrens().forEach(i -> print(i));
            }
        }
    }

}
