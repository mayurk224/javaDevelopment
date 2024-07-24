public class access_modifier {
    // access modifier means from where you can access that variable or method
    // Types of Access Modifiers: private, protected, public, default(no modifier).
    // local variable by default they have protected access

    //                      ACCESS LEVEL:
    // Modifier         Class   Package    Subclass     World
    // 1.public           Y        Y           Y          Y
    // 2.protected        Y        Y           Y          N
    // 3.default          Y        Y           N          N
    // 4.private          Y        N           N          N

    // Least Accessible: private < default < protected < public :Most Accessible
}
