package org.hank.command;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        A real = new A();
        y(real);
        System.out.println();

        int b = real.a; // 5
        x(b); //
        System.out.println(real.a); // 5
    }

    public static void x(int p) { // 기본형을 전달
        p = 3;
    }

    public static void y(A temp) {
        // A temp = 인자값
        // 이미 이 시점에서 변수가 이 함수에만 살아있다
        //
        // 참조형 주소값을 전달
        temp = new A();
        // 새 참조 주소값으로 덮어씌운거죠?
        // 그 순간 이제 위에서 받았던 참조 주소값에 있는 객체는 다시 건드릴 수 없다.
        temp.a = 5;
        // 이제 여기서만 존재하는 인스턴스에 변경을 한 것.
    }

    public void println(int x) {

    }

    public void println(boolean x) {
    }
}

class A {
    int a = 0;
    A i = new A();

    List<A> myList = new ArrayList<>();
    List<A> myList2;

    A() {
    }

    A(String a) {

    }

    public void x(int p) {
        a = p;
    }
}
