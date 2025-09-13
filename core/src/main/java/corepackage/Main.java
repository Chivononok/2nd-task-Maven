package corepackage;

import apipackage.TestApi;

public class Main {
    public static void main(String[] args){
        TestApi ta = new TestApi();
        System.out.println(ta.helloTestApi("Сережа - молодец!!!"));
    }
}
