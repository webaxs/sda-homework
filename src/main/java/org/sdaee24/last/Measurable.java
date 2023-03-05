package org.sdaee24.last;

import org.sdaee24.Scales;

public interface Measurable {
   default Double getMassMeasure() { //definition of our contract + it's default implementation.
       // Replacing Abtract classes. After Java 8 we've got the situation that Interfaces are favored
       // over abstract classes.
       //When we provide the default implementation, we are NOT obliged to implement this contract
       // in any class//which implements our contract.
       Scales sc = new Scales();
       return sc.execute();
   }

    double getSpeedMeasure(); //definition of contract. So in case if we say that some class
    // implements this contract- we MUST provide the exact implementation (logic)
}
