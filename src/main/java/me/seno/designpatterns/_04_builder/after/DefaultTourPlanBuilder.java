package me.seno.designpatterns._04_builder.after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import me.seno.designpatterns._04_builder.before.DetailPlan;
import me.seno.designpatterns._04_builder.before.TourPlan;

public class DefaultTourPlanBuilder implements TourPlanBuilder {

  private String title;

  private int nights;

  private int days;

  private LocalDate startDate;

  private String whereToStay;

  private List<DetailPlan> detailPlans = new ArrayList<>();

  @Override
  public TourPlanBuilder title(String title) {
    this.title = title;
    return this;
  }

  @Override
  public TourPlanBuilder nightsAndDays(int nights, int days) {
    this.nights = nights;
    this.days = days;
    return this;
  }

  @Override
  public TourPlanBuilder startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public TourPlanBuilder whereToStay(String whereToStay) {
    this.whereToStay = whereToStay;
    return this;
  }

  @Override
  public TourPlanBuilder addPlan(int day, String plan) {
    detailPlans.add(new DetailPlan(day, plan));
    return this;
  }

  @Override
  public TourPlan getPlan() {
    return new TourPlan(this.title, this.startDate, this.nights, this.days, this.whereToStay,
        this.detailPlans);
  }
}
