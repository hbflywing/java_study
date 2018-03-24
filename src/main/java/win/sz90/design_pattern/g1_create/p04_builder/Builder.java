package win.sz90.design_pattern.g1_create.p04_builder;

/**
 *  建造者模式
 * Created by shawn.zeng on 2018/3/24.
 */
public class Builder {
    static class Student{
        String name = null;
        int number = -1;
        String sex = null;
        int age  = -1;
        String school = null;

        public Student setName(String name){
            this.name = name;
            return this;
        }

        public Student setNumber(String number){
            this.name  = name;
            return this;
        }

        public Student setSex(String sex){
            this.sex = sex;
            return this;
        }

        public Student setAge(int age){
            this.age = age;
            return this;
        }

        public Student setSchool(String school){
            this.school = school;
            return this;
        }

    }
}
