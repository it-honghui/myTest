package com.wanghonghui.java.Set;

import org.junit.Test;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        //Set 集合存和取的顺序不一致。
        Set hs = new HashSet();
        hs.add("世界军事");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");
        System.out.println(hs);
        // [舰船知识, 世界军事, 兵器知识, 汉和防务]
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * 使用HashSet存储字符串，并尝试添加重复字符串
     */
    @Test
    public void demo1() {
        // Set 集合存和取的顺序不一致。
        Set hs = new HashSet();
        hs.add("世界军事");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");

        // 返回此 set 中的元素的数量
        System.out.println(hs.size()); // 4

        // 如果此 set 尚未包含指定元素，则返回 true
        boolean add = hs.add("世界军事"); // false
        System.out.println(add);

        // 返回此 set 中的元素的数量
        System.out.println(hs.size());// 4
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    /**
     * 使用TreeSet集合存储字符串元素，并遍历
     */
    @Test
    public void demo2() {
        TreeSet ts = new TreeSet();
        ts.add("ccc");
        ts.add("aaa");
        ts.add("ddd");
        ts.add("bbb");

        System.out.println(ts); // [aaa, bbb, ccc, ddd
    }

    /**
     * 年龄按照搜要条件，年龄相同再比姓名
     */
    @Test
    public void demo3() {
        TreeSet ts = new TreeSet();
        ts.add(new Person("aa", 20, "男"));
        ts.add(new Person("bb", 18, "女"));
        ts.add(new Person("cc", 17, "男"));
        ts.add(new Person("dd", 17, "女"));
        ts.add(new Person("dd", 15, "女"));
        ts.add(new Person("dd", 15, "女"));

        System.out.println(ts);
        System.out.println(ts.size()); // 5
    }

    class Person implements Comparable {
        private String name;
        private int age;
        private String gender;

        public Person() {

        }

        public Person(String name, int age, String gender) {

            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public int hashCode() {
            return name.hashCode() + age * 37;
        }

        public boolean equals(Object obj) {
            System.err.println(this + "equals :" + obj);
            if (!(obj instanceof Person)) {
                return false;
            }
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;

        }

        public String toString() {
            return "Person [name=" + name + ", age=" + age + ", gender=" + gender
                    + "]";
        }

        @Override
        public int compareTo(Object obj) {

            Person p = (Person) obj;
            System.out.println(this + " compareTo:" + p);
            if (this.age > p.age) {
                return 1;
            }
            if (this.age < p.age) {
                return -1;
            }
            return this.name.compareTo(p.name);
        }

    }

    /**
     * 让容器自身具备比较性，自定义比较器。
     */
    @Test
    public void demo4() {
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add(new Book("think in java", 100));
        ts.add(new Book("java 核心技术", 75));
        ts.add(new Book("现代操作系统", 50));
        ts.add(new Book("java就业教程", 35));
        ts.add(new Book("think in java", 100));
        ts.add(new Book("ccc in java", 100));

        System.out.println(ts);
    }

    class MyComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            Book b1 = (Book) o1;
            Book b2 = (Book) o2;
            System.out.println(b1 + " comparator " + b2);
            if (b1.getPrice() > b2.getPrice()) {
                return 1;
            }
            if (b1.getPrice() < b2.getPrice()) {
                return -1;
            }
            return b1.getName().compareTo(b2.getName());
        }

    }

    class Book {
        private String name;
        private double price;

        public Book() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Book(String name, double price) {

            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book [name=" + name + ", price=" + price + "]";
        }
    }

}
