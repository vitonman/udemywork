package com.vita.setsandhashsets;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }

/*   @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof Labrador){
            String objectName = ((Labrador) obj).getName();
            return this.getName().equals(objectName);
        }

        return false;
    }*/
}
