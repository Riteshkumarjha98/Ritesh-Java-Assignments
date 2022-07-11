package com.p1;

class Main {
public static void main(String[] args) {
F p1 = new F();
B m1 = new B();
ThreadF t1 = new ThreadF(p1, m1);
ThreadB t2 = new ThreadB(p1, m1);
t1.start();
t2.start();
}
}
