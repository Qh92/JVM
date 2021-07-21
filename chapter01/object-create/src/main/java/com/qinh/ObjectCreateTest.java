package com.qinh;

import com.qinh.entity.Animal;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * 对象实例化的方式
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/6 10:55
 */
public class ObjectCreateTest {

    public static void main(String[] args){

        //1.直接new
        Animal animal1 = new Animal();

        //2.通过Class的newInstance()方法
        try {
            Animal animal2 = Animal.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //3.通过Constructor的newInstance()方法
        try {
            Constructor<Animal> constructor = Animal.class.getDeclaredConstructor();
            Animal animal3 = constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //4.使用clone(),浅拷贝,必须实现Cloneable接口
        try {
            animal1.setAge(10);
            animal1.setName("金毛");
            Animal animal4 = (Animal)animal1.clone();
            System.out.println(animal4.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //5.使用反序列化
        Person person = new Person();
        Optional<Person> clone = deepClone(person);
        if (clone.isPresent()){
            Person person1 = clone.get();
            System.out.println(person1);
        }

        //6.objenesis

    }
    public static <T> Optional<T> deepClone(T t){
        ObjectInputStream ois = null;
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(t);
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            return Optional.of((T) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (baos != null)
                    baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bais != null)
                    bais.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Optional.empty();
    }



}

class Person implements Serializable {
    private String name = "人类";
    private int age = 5000;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
