package com.iFit.lib.classes;

import java.io.Serializable;

public class SportTime
  implements Serializable
{
  public int overHours = 0;
  public int overMinute = 0;
  public int spaddingTime = 0;
  public int startHours = 0;
  public int startMinute = 0;
  public boolean[] weeks = new boolean[7];
  
  public SportTime()
  {
    for (int i = 0;; i++)
    {
      if (i >= this.weeks.length) {
        return;
      }
      this.weeks[i] = false;
    }
  }
}


/* Location:           C:\Users\hh\Desktop\app\IBonten 1.4\classes_dex2jar.jar
 * Qualified Name:     com.iFit.lib.classes.SportTime
 * JD-Core Version:    0.7.0.1
 */