package Plane;

public class Plane {

    private String planeType;
    private PlaneModelType planeModelType;

    public Plane(PlaneModelType planeModelType){
        this.planeModelType = planeModelType;
    }

    public String getPlaneType(){
        return this.planeType;
    }

}