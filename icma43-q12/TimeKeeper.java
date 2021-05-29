public interface TimeKeeper
    {
        void reset();         //resets seconds to 0
        void addToSeconds();  //adds 0.01 seconds to seconds. 
        String displayTime(); //returns the formatted time in hours and minutes to 2 d.p.
    }