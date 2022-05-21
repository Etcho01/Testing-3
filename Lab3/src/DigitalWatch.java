public class DigitalWatch {
    public boolean On = false;
    public boolean TimerTick = false;
    public float Timer = 0;

    public String TurnOn(){
        if(!On){
        On = true;
        return "Turned On";
    }
    else{
        return "watch is turned on";
    }
    }
    public String TurnOff(){
        if(On){
            On = false;
            return "Turned off";
        }
        else{
            return "Error";
        }
    }
    public String SetTimer(float time){
        if(On){
        Timer = time;
        TimerTick = true;
        return "Timer set";
    }
    else{
        return "Watch is turned off";
    }
    }
    public String Interrupt(){
        if(TimerTick){
        return "Wait for timer to end";
    }
    else{
        return "Accepted";
    }
    }

}

