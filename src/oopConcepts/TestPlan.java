package oopConcepts;

public interface TestPlan {

    public static void main(String[] args){
        AndroidPhone ap = new AndroidPhone();



        ap.call();
        ap.fax();
        ap.receiveCall();
        ap.text();
        ap.vedioCall();
        CellPhone c = new AndroidPhone();
        TeleCommunication tc = new AndroidPhone();

        c.dial();

        }

    }

