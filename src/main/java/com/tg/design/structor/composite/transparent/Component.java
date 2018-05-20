package com.tg.design.structor.composite.transparent;

import java.util.List;

/**
 * Created by eds on 2018/5/20.
 */
public abstract class Component {

    public String name;
    public Long id;

    public void do1() {
        System.out.println("called=========do1");
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract List<Component> childrens();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
