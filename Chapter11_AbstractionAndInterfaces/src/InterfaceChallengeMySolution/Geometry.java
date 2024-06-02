package InterfaceChallengeMySolution;

import jdk.jshell.execution.Util;

import java.util.Random;

public enum Geometry{

    LINE,
    POINT,
    POLYGON;

    // Depending on what kind of a class instance it is, this will return the Geometry type
    public Geometry getType(Mappable mappable){
        if(mappable instanceof Building){
            return POINT;
        }
        else if(mappable instanceof UtilityLine){
            return LINE;
        }
        else return POLYGON;
    }
}
