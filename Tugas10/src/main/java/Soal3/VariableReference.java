package Soal3;

public class VariableReference {

    String a;
    String b = "Hallo string b !";
    public static void main(String[] args) {
        VariableReference vr = new VariableReference();
        System.out.println("string a : " + vr.a);
        System.out.println("string b : " + vr.b);
    }
    
}
