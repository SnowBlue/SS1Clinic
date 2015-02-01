package core.time;

import org.joda.time.*;

/**
 * Created by Kenny on 2/1/2015.
 */
public class TimeSlot {
    private DateTime startTime;
    private DateTime endTime;

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }
}
