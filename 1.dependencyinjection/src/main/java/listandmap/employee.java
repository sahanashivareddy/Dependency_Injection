package listandmap;

import java.util.ArrayList;

public class employee {
	ArrayList<String> name;
	public void display()
	{
		for(String name:name)
		{
			System.out.println(name);
		}
	}
	public ArrayList<String> getName() {
		return name;
	}
	public void setName(ArrayList<String> name) {
		this.name = name;
	}

}
