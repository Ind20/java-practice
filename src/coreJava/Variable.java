package coreJava;

public class Variable {
    private final int a;

    public Variable(int a){
        this.a = a;
    }

    public int getValue(){
        return a;
    }

    public static void main(String[] args) {
        Variable variable = new Variable(10);
        int value = variable.getValue();
        System.out.println(value);
    }

}
