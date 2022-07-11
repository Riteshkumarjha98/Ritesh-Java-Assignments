package com.p1;

class ThreadF extends Thread{
F p1;
B m1;
public ThreadF(F p1,B m1) {
this.m1=m1;
this.p1=p1;
}
@Override
public void run() {
p1.funA(m1);
}
}