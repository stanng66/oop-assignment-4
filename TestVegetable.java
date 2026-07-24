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
// Assignment Requirement: Create TestVegetable Class - This will have main method
public class TestVegetable {
    public static void main(String[] args) {
        // Polymorphism:1) Create Vegetable v1 of type carrot and 2) Vegetable v2 of type onion with 10 layers.
        Vegetable v1 = new Carrot("Orange", "Carrot");
        Vegetable v2 = new Onion("Yellow", "Onion", 10);

        // Assignment Requirement: for each object
        if (v1.isTasty()) {   // Assignment Requirement: If the isTasty is true then print I like stirfry of this vegetable
           System.out.println("I like stirfry of carrots");
        } else {   // Assignment Requirement: If the isTasty is false then print I don't like stirfry of this vegetable
           System.out.println("I don't like stirfry of carrots");
        }

        if (v2.isTasty()) {   // Assignment Requirement: If the isTasty is true then print I like stirfry of this vegetable
            System.out.println("I like stirfry of onion");
        } else {   // Assignment Requirement:  If the isTasty is false then print I don't like stirfry of this vegetable
            System.out.println("I don't like stirfry of onion");
        }

        // Assignment Requirement: Now create an example of downcasting using instanceof variable and show that v2 is carrot and v2 is onion
        if (v2 instanceof Onion) {
            Onion o = (Onion) v2;
            System.out.println("v2 is an Onion with " + o.getOnionLayers() + " layers");
        }

        if (v2 instanceof Carrot) {
            System.out.println("v2 is a Carrot");
        } else {
            System.out.println("v2 is NOT a Carrot");
        }
    }
}
