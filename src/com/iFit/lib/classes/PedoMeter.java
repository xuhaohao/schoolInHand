package com.iFit.lib.classes;

import java.io.Serializable;

public class PedoMeter
  implements Serializable
{
  public static final String ACCOMPLISHGOAL = "accpmlish_goal";
  public static final String ACTIVITY_TIME = "activity_time";
  public static final String AGE = "age";
  public static final String CALORIES = "calories";
  public static final String DAY = "pedometer_day";
  public static final String DEVICEID = "device_id";
  public static final String DISTANCE = "distance";
  public static final String GOALD = "goald";
  public static final String HEIGHT = "height";
  public static final String MONTH = "pedometer_month";
  public static final String PEDOMETER = "pedometer";
  public static final String PEDOMETERID = "_id";
  public static final String RUNSTEPS = "run_steps";
  public static final String SEX = "sex";
  public static final int[] SLEPT = new int[96];
  public static final String SLEPT_TIME = "slept_time";
  public static final String STEPLENGTH = "step_length";
  public static final String STEPS = "steps";
  public static final String WEEK = "week";
  public static final String WEIGHT = "weight";
  public static final String YEAR = "pedometer_year";
  public static final String YEAR_MONTH_DAY = "year_month_day";
  private static final long serialVersionUID = 1L;
  public int activityTtime = 0;
  public int calories = 0;
  public int dailyGoal = 0;
  public int day;
  public int distance = 0;
  public int fuel = 0;
  public String id;
  public int month;
  public String pedometer;
  public int sleepTime = 0;
  public int[] slept;
  public int steps = 0;
  public int week;
  public int year;
}


/* Location:           C:\Users\hh\Desktop\app\IBonten 1.4\classes_dex2jar.jar
 * Qualified Name:     com.iFit.lib.classes.PedoMeter
 * JD-Core Version:    0.7.0.1
 */