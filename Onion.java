// ====================
// Assignment 4
// Stanley Nguyen
// Humber College
// CPAN-131-RNA
// Mehrnaz Zhian
// July 28, 2026
// --------------------
// This program demonstrates inheritance and polymorphism
// ====================
// Assignment Requirement: Create 2nd Child: Onion inheriting from vegetable
public class Onion extends Vegetable {
    // Assignment Requirement: This will have private int attribute as layers 
    private int onionLayers;

    // Assignment Requirement: Create 2 constructors: pass color and name in super and set the layers with current attribute 
    public Onion() {
    }

    public Onion(String parmVegetableColour, String parmVegetableName, int parmOnionLayer) {
        super(parmVegetableColour, parmVegetableName);
        this.onionLayers = parmOnionLayer;
    }

    public int getOnionLayers() {
        return onionLayers;
    }

    public void setOnionLayers(int parmOnionLayer) {
        this.onionLayers = parmOnionLayer;
    }


    // Assignment Requirement: Implement the body of isTasty. If you like the vegetable then return true
    @Override
    public boolean isTasty() {
        return true; // If you like the vegetable
    }
}
