package core.time;

import org.joda.time.*;
import java.util.*;

/**
 * Created by Kenny on 2/1/2015.
 */
public class TimeTable {
    public TimeTable(){
        allTimeSlots = new ArrayList<TimeSlot>();
        bookedTimeSlots = new ArrayList<TimeSlot>();
    }
    private List<TimeSlot> allTimeSlots;
    private List<TimeSlot> bookedTimeSlots;
    public List<TimeSlot> getAvailableTimeSlots(DateTime rangeStart, DateTime rangeEnd){
        return new ArrayList<TimeSlot>();
    }

    public List<TimeSlot> getAllTimeSlots() {
        return allTimeSlots;
    }

    public void setAllTimeSlots(List<TimeSlot> allTimeSlots) {
        this.allTimeSlots = allTimeSlots;
    }

    public List<TimeSlot> getBookedTimeSlots() {
        return bookedTimeSlots;
    }

    public void addBookedTimeSlots(TimeSlot bookedTimeSlot) {
        this.bookedTimeSlots.add(bookedTimeSlot);
    }
}
