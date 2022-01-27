package me.seno.designpatterns._04_builder.after;

import me.seno.designpatterns._04_builder.before.TourPlan;

public class App {

  public static void main(String[] args) {
    DefaultTourPlanBuilder defaultTourPlanBuilder = new DefaultTourPlanBuilder();
    TourPlan plan = defaultTourPlanBuilder.title("무슨 플랜?")
        .addPlan(1, "도착")
        .addPlan(2, "귀국")
        .getPlan();
    System.out.println("plan = " + plan);
  }

}
