//Write a java program to show implementation of interfaces

interface interfaceA {
    void methodA();

}

interface interfaceB {
    void methodB();
}

class MultiInterface implements interfaceA, interfaceB {
    public void methodA() {
        System.out.println("Abstract method of interface A");
    }

    public void methodB() {
        System.out.println("Abstract method of interface B");
    }

    void display() {
        System.out.println("");
    }
}

class MainInterface {
    public static void main(String args[]) {
        MultiInterface m = new MultiInterface();
        m.methodA();
        m.methodB();
    }
}