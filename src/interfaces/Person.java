package interfaces;


// an INTERFACE is PURELY Abstract
// ALL METHODS ARE PUBLIC AND ABSTRACT
// ALL PROPERTIES ARE PUBLIC STATIC AND FINAL
// NO STATIC METHODS
public interface Person {
    // you don't have to denote the method as PUBLIC, its understood all methods in an INTERFACE are PUBLIC
    // you don't have to denoate STATIc because all properties are STATIC

    public static boolean eatsFood = true;

    // you don't have to denote METHOD as ABSTRACT for the same reasons noted above
    // Interface abstract methods cannot have a body
    public abstract void activity();

}
