package com.tg.design.structor.composite.transparent;

import java.util.List;

/**
 * Created by eds on 2018/5/20.
 */
public class Leaf extends Component {

    @Override
    public void add(Component component) {
        System.out.println("//////todo");
    }

    @Override
    public void remove(Component component) {
        System.out.println("//////todo");
    }

    @Override
    public List<Component> childrens() {
        return null;
    }
}
