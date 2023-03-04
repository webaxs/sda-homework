package org.sdaee24;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ship {

   private String name;
    private Color color;
    private EngineType engineType;
    private Age age; //15 years, 15 month


}

