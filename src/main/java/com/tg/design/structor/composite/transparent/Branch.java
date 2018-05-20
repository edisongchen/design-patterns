package com.tg.design.structor.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eds on 2018/5/20.
 */
public class Branch extends Component {

    private List<Component> childrens = new ArrayList<>();

    @Override
    public void add(Component component) {
        childrens.add(component);
        System.out.println("///" + getClass().getSimpleName() + "/////add");
    }

    @Override
    public void remove(Component component) {
        for (Component children : childrens) {
            if (children.equals(component)) {
                children.remove(children);
                System.out.println("///" + getClass().getSimpleName() + "/////remove");
            }
        }
    }

    @Override
    public List<Component> childrens() {
        return childrens;
    }
}
