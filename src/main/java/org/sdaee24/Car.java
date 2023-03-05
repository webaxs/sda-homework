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
public class Car implements Measurable {

   private String name;
    private Color color;
    private EngineType engineType;
    private Age age; //15 years, 15 month
    private Double speed; // km/h or mph
    private Double fuelConsumption; // l/100km or mpg

    @Override
    public double getSpeedMeasure() {
        return 0;
    }


}

