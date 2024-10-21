package samplePrograms.Programs;

/**
 * Hello world!
 *
 */
public class App 
{
	public String display(String s )
	{
		return s; 
	}
    public static void main( String[] args )
    {
    	App a= new App();
        System.out.println( "Hello World!"+a.display("20"));
    }
}
