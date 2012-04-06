package server;

import java.io.Serializable;

public class OurClass implements Runnable, Serializable
{
    public void run()
    {
	System.out.println("I'm OurClass");
    }
}
