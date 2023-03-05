package org.sdaee24;

import org.sdaee24.last.Measurable;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MainForPractice {
    public static void main(String[] args) {

//        Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
//        Make Ship implement Measurable. Provide a method double average(List<Ship> objects)
//        that computes the average measure. Use it to compute the average speed, mass and consumption of a list of ships. done, ty

//        Continue with the preceding exercise and provide a method Measurable largest(List<Measurable> objects).

//        Use it to find the name of the employee with the largest salary. Why do you need a cast?
//        What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note that each type
//        is its own supertype. A class or interface without declared supertype has supertype Object.
//        Implement a static of method of the IntSequence class that yields a sequence with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with six values. Extra credit if you return an instance of an anonymous inner class.

        List<Ship> shipList = new ArrayList<>(); //STUB- actual list comes from somewhere else

        Double averageMass = shipList.stream()
                .mapToDouble((x) -> x.getMassMeasure())
                .summaryStatistics()
                .getAverage(); // Double

        Double averageSpeed = shipList.stream()
                .mapToDouble((x) -> x.getSpeedMeasure())
                .summaryStatistics()
                .getAverage(); // Double

        Double averageFuelConsumption = shipList.stream()
                .mapToDouble((x) -> x.getFuelConsumption())
                .summaryStatistics()
                .getAverage(); // Double

        // Try to GENERALIZE average measurements on Ship class, so we could comply with DRY principle.

    }
}