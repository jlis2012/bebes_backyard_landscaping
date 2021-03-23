/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LisJennifer
 */
public class ProjectEstimate {
    //attributes
    private String landscapeType;
    private double length;
    private double width;
    private double area;
    private double calculateCost;

    public ProjectEstimate(String landscapeType, double yardLength, 
            double yardWidth, double landscapeCost) {
        this.landscapeType = landscapeType;
        this.length = length;
        this.width = width;
        this.area = area;
        this.calculateCost = calculateCost;
    }

    //behaviors
    @Override
    public String toString() {
        return "ProjectEstimate{" + "landscapeType=" + landscapeType + 
                ", length=" + length + ", width=" + width + 
                ", calculateCost=" + calculateCost + '}';
    }
    
    public double calculateArea()
    {
        return length * width;
    }
    
    public double getPrice()
    {
        double grass = 15.0;
        double gravel = 25.0;
        
        return 0.0;
    }

    //getters and setters
    public String getLandscapeType() {
        return landscapeType;
    }

    public void setLandscapeType(String landscapeType) {
        this.landscapeType = landscapeType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getcalculateCost() {
        return calculateCost;
    }

    public void setcalculateCost(double calculateCost) {
        this.calculateCost = calculateCost;
    }
    
    
    
}
