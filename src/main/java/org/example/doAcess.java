package org.example;

public class doAcess implements oAccess{
    private String path;

    public doAccess(String path){
        this.path=path;
        open();
    }

    public void open(){
        System.out.println("Open:"+path);
    }

    @Override
    public void access() {
        System.out.println("all right.");

    }
}
