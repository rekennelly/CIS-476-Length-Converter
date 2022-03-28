/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LengthConverter;

/**
 *
 * @author kennelra
 */
public class MileHandler implements Handler {
    private Handler handler;
    private String handlerName = "Mile Handler";
    

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String process(String input, String choice) {
        if (choice.equals("mile")) {
            // convert string to double
            double kmValue = Double.parseDouble(input);
            // convert kilometers to miles
            double valInMiles = kmValue * 0.62137;
            // return string with "miles" added to end
            String milesString = String.valueOf(valInMiles) + " miles";
            return milesString;
        }
        else if (handler != null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            return handler.process(input, choice);
        }
        else {
            System.out.println("Error.");
            return "ERROR";
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
