package org.example.builder.chain;

public class Student {
    private String name;
    private Integer age;

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

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class StudentBuilder {
        private String name;
        private Integer age;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setName(this.name);
            student.setAge(this.age);
            return student;
        }
    }
}
