package com.epam.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import java.util.logging.Level; 
//import java.util.logging.Logger;

interface Mobile {

public void Create();
}
class Basic_Mobile implements Mobile {

public void Create() {
System.out.print("Mobile:\n");
}

}

class Mobile_Model implements Mobile {

protected Mobile Mobile;

public Mobile_Model(Mobile h){
this.Mobile=h;
}


public void Create() {
this.Mobile.Create();
}

}
 class Apple extends Mobile_Model {

public Apple(Mobile h) {
super(h);
}


public void Create(){
super.Create();
System.out.print("Apple is at the top in mobiles.\n");
}
}
 class Iphone extends Mobile_Model {

public Iphone(Mobile h) {
super(h);
}


public void Create(){
super.Create();
System.out.print("Iphone is a model of apple.\n");
}
}


public class App
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
   
    public static void main( String[] args )
    {
       LOGGER.log(null, null, Level.INFO,"use of memento,behaviour patterns and decorate,structural patterns.\n");
       Mobile apple = new Apple(new Basic_Mobile());
       Mobile iphone =new Iphone(new Basic_Mobile());
apple.Create();
                iphone.Create();
System.out.println("\n*****");

Mobile apple_iphone = new Apple(new Iphone(new Basic_Mobile()));
apple_iphone.Create();
       LOGGER.log(null, null, Level.INFO,"program terminated.\n");
       
    }
}
