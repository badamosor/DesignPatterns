public abstract class Builder {
	protected String result;
	public abstract void buildPart();
	
	public String getResult()
	{
		return result;
	}
}