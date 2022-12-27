package org.example;

public class Proxy implements oAccess {
    private String path;
    private String previliege;
    private doAcess doAcess;

    public Proxy(String path, String role) {
        this.path = path;
        this.previliege = role;
    }



    @Override
    public void access() {
        if (previliege == "administrator") {
            if (doAcess == null) {
                doAcess = new doAcess();
            }
            doAcess.access();
        } else {
            System.out.println("You haven't access");
        }
    }
}
