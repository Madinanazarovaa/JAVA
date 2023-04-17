package Lesson6.task;

import java.util.Objects;

// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

public class Cat {
    public String name;
    public int age;
    public boolean isill;
    public String diagnozes;

    public Owner owner;

    public Cat(String name, int age, boolean isill, String diagnozes, Owner owner) {
        this.name = name;
        this.age = age;
        this.isill = isill;
        this.diagnozes = diagnozes;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("Cat {Name = %s, age = %s, isill = %s, diagnozes = %s, owner = %s}", name , age, isill,diagnozes,owner );//%d type to int
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        return cat.name.equals(this.name) && cat.age == this.age && cat.diagnozes.equals(this.diagnozes) &&
                cat.isill == this.isill;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnozes == null) ? 0 : diagnozes.hashCode());
        return result;
    }

}