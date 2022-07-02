package com.sda.polymorph;

public class ACremoteController implements RemoteController{

    @Override
    public void enable(boolean enable){
        System.out.println("ACRemote is enable? = " + enable);
    }

}

