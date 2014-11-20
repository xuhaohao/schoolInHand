package com.iFit.lib.classes;

import java.io.Serializable;

public class DateTime
  implements Serializable
{
  public int hours = 0;
  public boolean isOpen = false;
  public boolean[] isSetDay;
  public int minute = 0;
  public String time = "00:00";
  
  public DateTime()
  {
    boolean[] arrayOfBoolean = new boolean[7];
    arrayOfBoolean[0] = true;
    arrayOfBoolean[1] = true;
    arrayOfBoolean[2] = true;
    arrayOfBoolean[3] = true;
    arrayOfBoolean[4] = true;
    this.isSetDay = arrayOfBoolean;
  }
}


/* Location:           C:\Users\hh\Desktop\app\IBonten 1.4\classes_dex2jar.jar
 * Qualified Name:     com.iFit.lib.classes.DateTime
 * JD-Core Version:    0.7.0.1
 */