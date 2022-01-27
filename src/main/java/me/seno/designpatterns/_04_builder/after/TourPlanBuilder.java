package me.seno.designpatterns._04_builder.after;

import java.time.LocalDate;
import me.seno.designpatterns._04_builder.before.TourPlan;

public interface TourPlanBuilder {

  TourPlanBuilder title(String title);

  TourPlanBuilder nightsAndDays(int nights, int days);

  TourPlanBuilder startDate(LocalDate localDate);

  TourPlanBuilder whereToStay(String whereToStay);

  TourPlanBuilder addPlan(int day, String plan);

  TourPlan getPlan();
}
