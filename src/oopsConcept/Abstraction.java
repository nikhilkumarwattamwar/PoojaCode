package oopsConcept;

public class Abstraction {

    static abstract class TV {
        abstract void TurnOn();
        abstract void TurnOff();
        abstract void ChannelChange();
    }

     static class Remote extends TV {
        public void TurnOn() { System.out.println("TV ON"); }
        public void TurnOff() { System.out.println("TV OFF"); }
        public void ChannelChange() { System.out.println("TV Channel Changed"); }}
    
    

    public static void main(String[] args) {
        TV t = new Remote(); 
        t.TurnOn();
        t.TurnOff();
        t.ChannelChange();
    }
}


