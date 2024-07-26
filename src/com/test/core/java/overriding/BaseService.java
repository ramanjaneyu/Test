package com.test.core.java.overriding;
/*
This question asked in Publicis Sapeint interview
 */
public class BaseService { }
class ChildService extends BaseService { }
class Base {
    public int value = 90;
    public void display(BaseService service) {
        System.out.println("In Base");
    }
}
class Child extends Base {
    public int value = 45;
    public void display(ChildService service) {
        System.out.println("In Child");
    }
}
class CompileTime {
    public static void main(String[] args) {
         Base baseOrg = new Base();
         System.out.println(baseOrg.value); //90
         Base base = new Child();
         System.out.println(base.value); //90
         base.display(new ChildService()); //In base

         Child child = new Child();
         System.out.println(child.value); //45
         child.display(new BaseService()); //In Base
    }
}