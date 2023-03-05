package org.sdaee24;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sdaee24.last.Measurable;

import java.awt.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ship implements Measurable {

   private String name;
    private Color color;
    private EngineType engineType;
    private Age age; //15 years, 15 month
    private Double mass;
    private Double speed; //knots
    private Double fuelConsumption; // tons/nm

    @Override
    public Double getMassMeasure() { //this method would execute/serve/implement/obey the contract
        this.mass = new PoolOfWater().execute();
        return this.mass;
    }


    @Override //we define the logic to implement (execute) the contract
    public double getSpeedMeasure() {
        return 0; //
    }

}

