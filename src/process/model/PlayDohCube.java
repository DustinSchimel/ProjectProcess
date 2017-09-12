package process.model;

public class PlayDohCube
{

	private int size;
	
	public PlayDohCube()
	{
		this.size = 10;
	}
	
	public PlayDohCube(int size) 
	{
		this.size = size;
	}
	
	public String toString()
	{
		String description = "I am a cube, my size is " + size;
		return description;
	}
}
