class Person {
    String name;
    int age;

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPinfo() {
        System.out.println("Name = " + name + " | " + "Age = " + age);
    }
}

class Student extends Person {
    int regNo;

    void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    void displayReg() {
        System.out.println("Register number = " + regNo);
    }
}

class SingleInheritance {
    public static void main(String args[]) {
        Person p = new Person();
        p.setData("ABCD", 33);
        p.displayPinfo();

        Student S = new Student();
        S.setData("XYZ", 19);
        S.setRegNo(111);
        S.displayPinfo();
        S.displayReg();
    }
}
