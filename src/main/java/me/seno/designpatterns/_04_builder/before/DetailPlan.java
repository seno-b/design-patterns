package me.seno.designpatterns._04_builder.before;

public class DetailPlan {
  private int day;
  private String plan;

  public DetailPlan(int day, String plan) {
    this.day = day;
    this.plan = plan;
  }

  @Override
  public String toString() {
    return "DetailPlan{" +
        "day=" + day +
        ", plan='" + plan + '\'' +
        '}';
  }
}
