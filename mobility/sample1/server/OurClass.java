package server;

import java.io.Serializable;

public class OurClass implements Runnable, Serializable
{
    public void run()
    {
	new NonserializableMobileClass();
	System.out.println("Hello from OurClass!");
    }
}
