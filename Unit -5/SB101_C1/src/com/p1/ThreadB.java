package com.p1;

class ThreadB extends Thread{
F p1;
B m1;
public ThreadB(F p1,B m1) {
this.m1=m1;
this.p1=p1;
}
@Override
public void run() {
m1.funB(p1);
}
}
