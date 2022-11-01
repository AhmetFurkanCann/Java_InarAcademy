package chapters.chapter_09;

public class Exercise_06StopWatch {
    private double startTime = 0;
    private double endTime = 0 ;
    public Exercise_06StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public  double getStartTime(){
        return startTime ;
    }
    public double getEndTime() {
        return endTime ;
    }
    public void start() {
        startTime = System.currentTimeMillis() ;
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return endTime - startTime ;
    }
}
