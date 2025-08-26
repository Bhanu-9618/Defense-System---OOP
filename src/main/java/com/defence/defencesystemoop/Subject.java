
package com.defence.defencesystemoop;


public interface Subject {
    void attach(Observer o);  
    void detach(Observer o);    
    void notifyObservers(String Areaclear ); 
    void updatemessagemainheli(String messagefromheli);
    void updatemessagemainsub(String messagefromsub);
    void updatemessagemaintank(String messagefromtank);
    
    
}
