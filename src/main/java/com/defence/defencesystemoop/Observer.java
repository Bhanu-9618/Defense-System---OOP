
package com.defence.defencesystemoop;

public interface Observer {
     void update(String Areaclear); 
     void updatemessage(String message);
     void setenableshoot(boolean a);
     void setenablemissile(boolean b);
     void setenablebtn(boolean c);
     default void setenablebtn2(boolean d){
     }
    
}
