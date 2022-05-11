package org.example.prototype;

public class CloneableSheep implements Cloneable{
    private String name;
    private Integer age;
    private CloneableSheep friend;

    public CloneableSheep(String name, Integer age, CloneableSheep friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CloneableSheep getFriend() {
        return friend;
    }

    public void setFriend(CloneableSheep friend) {
        this.friend = friend;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }
}
