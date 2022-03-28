/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LengthConverter;

/**
 *
 * @author kennelra
 */
public interface Handler {
    
    public void setHandler(Handler handler);
    public String process(String input, String choice);
    public String getHandlerName();    
}
