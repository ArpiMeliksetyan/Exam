package Exam.service;

import Exam.model.Plane;

public class PlaneServiceCorrection {

//    Task_5

    public Plane highestCostOfPlane(Plane p1, Plane p2, Plane p3) {
        double max = p1.getCostOfPlane();
        Plane plane = p1;
        if (p2.getCostOfPlane() > max) {
            max = p2.getCostOfPlane();
            plane = p2;
        }
        if (p3.getCostOfPlane() > max) {
            max = p3.getCostOfPlane();
            plane = p3;
        }
        return plane;

    }

    //    Task_9
    public Plane minimalWeight(Plane[] planes) {
        int min = planes[0].getWeight();
        Plane plane = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= min) {
                min = planes[i].getWeight();
                plane = planes[i];
            }
        }
        return plane;

    }

//    Task_10

    public Plane minimalCost(Plane[] planes) {
        double min = planes[0].getCostOfPlane();
        Plane plane = planes[0];

        for (int i = 1; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getCostOfPlane() < min) {
                min = planes[i].getCostOfPlane();
                plane = planes[i];
            }
        }
        return plane;
    }
}
