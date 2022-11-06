package chapters.chapter_10;

public class Exercise_01Time {
    private long hour ;
    private long minute ;
    private long second ;
    public Exercise_01Time() {
        setTime(System.currentTimeMillis());
    }
    public Exercise_01Time(long elapsedTime) {
        setTime(elapsedTime);
    }
    public Exercise_01Time(long hour , long minute , long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second ;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000 ;
        this.second = totalSeconds % 60 ;
        long totalMinutes = totalSeconds / 60 ;
        this.minute = totalMinutes % 60 ;
        long totalHours = totalMinutes / 60 ;
        this.hour = totalHours % 24 ;
    }
}
