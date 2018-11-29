package cc.esunny.model;

import javax.xml.bind.annotation.XmlRootElement;

 

@XmlRootElement

public class Employee 
{

	private String name = "";
	
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	private String ID = "";

	public String getID()
	{
		return this.ID;
	}

	public void setID(String id)
	{
		this.ID = id;
	}
}
