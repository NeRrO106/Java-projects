/*
Build a droid
by Andrei - 2023
*/
public class Droid{
    String name;
    int batteryLevel;

    Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -=10;
    }

    public void energyReport(){
        System.out.println(name + " has " + batteryLevel + " left");
    }

    public void energyTransfer(Droid b){
        int initialBat = batteryLevel;
        batteryLevel = b.batteryLevel;
        b.batteryLevel = initialBat;
    }

    public String toString(){
        return "Hello, I'm the droid: " + name + " and i have: " + batteryLevel + " battery";
    }

    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        Droid Bot = new Droid("Bot");
        System.out.println(Codey);
        Codey.performTask("dancing");
        Codey.performTask("working");
        Codey.performTask("repairing");
        Codey.energyReport();
        Codey.energyTransfer(Bot);
        Codey.energyReport();
        Bot.energyReport();
    }
}