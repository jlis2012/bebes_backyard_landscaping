/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LisJennifer
 */
public class LandscapeType {
    //attribute
    private String gravel;
    private String grass;
    private String landscapeType;
    
    //constructors
    public LandscapeType() {
        boolean isGravel = true;
        boolean isGrass = false;
        landscapeType = "Unknown";
    }
    
    public LandscapeType(boolean isGravel, boolean isGrass, String landscapeType){
        this.landscapeType = landscapeType;
    }
    //behavior
    @Override
    public String toString() {
        return "LandscapeType{" + "Gravel=" + gravel + ", Grass=" + grass + 
                "LandscapeType= " + landscapeType + '}';
    }
    
    //getters and setters

    public String isGravel() {
        return gravel;
    }

    public void setGravel(String gravel) {
        this.gravel = gravel;
    }

    public String isGrass() {
        return grass;
    }

    public void setGrass(String grass) {
        this.grass = grass;
    }

    public String getLandscapeType() {
        return landscapeType;
    }

    public void setLandscapeType(String landscapeType) {
        this.landscapeType = landscapeType;
    }

}
