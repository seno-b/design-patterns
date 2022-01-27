package me.seno.designpatterns._04_builder.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourPlan {

  private String title;
  private LocalDate startDate;
  private int nights;
  private int days;
  private String whereToStay;
  private List<DetailPlan> detailPlans = new ArrayList<DetailPlan>();

  public void addPlan(DetailPlan detailPlan) {
    this.detailPlans.add(detailPlan);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public int getNights() {
    return nights;
  }

  public void setNights(int nights) {
    this.nights = nights;
  }

  public int getDays() {
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }

  public String getWhereToStay() {
    return whereToStay;
  }

  public void setWhereToStay(String whereToStay) {
    this.whereToStay = whereToStay;
  }

  public List<DetailPlan> getDetailPlans() {
    return detailPlans;
  }

  public void setDetailPlans(
      List<DetailPlan> detailPlans) {
    this.detailPlans = detailPlans;
  }

  public void addPlan(int day, String plan) {
    this.detailPlans.add(new DetailPlan(day, plan));
  }

  public TourPlan() {

  }

  public TourPlan(String title, LocalDate startDate, int nights, int days, String whereToStay,
      List<DetailPlan> detailPlans) {
    this.title = title;
    this.startDate = startDate;
    this.nights = nights;
    this.days = days;
    this.whereToStay = whereToStay;
    this.detailPlans = detailPlans;
  }

  @Override
  public String toString() {
    return "TourPlan{" +
        "title='" + title + '\'' +
        ", startDate=" + startDate +
        ", nights=" + nights +
        ", days=" + days +
        ", whereToStay='" + whereToStay + '\'' +
        ", detailPlans=" + detailPlans +
        '}';
  }
}
