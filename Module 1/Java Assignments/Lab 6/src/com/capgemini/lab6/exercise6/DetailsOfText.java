package com.capgemini.lab6.exercise6;

public class DetailsOfText {
	int noofcharacters=0,nooflines=1,noofwords=2;
	public void describetext(String text)
	{
		
		for(int textindex=0;textindex<text.length();textindex++)
		{
			if(text.charAt(textindex)==' ')
			{
				noofwords++;
			}
			else if(text.charAt(textindex)=='\n')
			{
				nooflines++;
			}
			else
			{
				noofcharacters++;
			}
		}
		System.out.println("No of words:"+noofwords+"\nNo of lines:"+nooflines+"\nNo of characters:"+noofcharacters);
	}

}
