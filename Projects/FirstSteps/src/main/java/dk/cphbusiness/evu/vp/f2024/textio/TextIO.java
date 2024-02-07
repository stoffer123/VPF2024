package dk.cphbusiness.evu.vp.f2024.textio;

import java.util.List;

public interface TextIO
{
	void put(String str);
	void clear();
	String get();

	default int getInt()
	{
		while(true)
		{
			String input = get();
			try
			{
				return Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{
				put("Please enter an integer: ");
			}
		}
	}

	default int getInt(int min, int max)
	{
		if(min > max)
		{
			throw new IllegalArgumentException("The parameter min must be less than or equal to the parameter max");
		}
		while(true)
		{
			int i = getInt();
			if(i >= min && i <= max)
			{
				return i;
			}
			put("Please enter an integer between " + min + " and " + max + ": ");
		}
	}

	default int choose(String title, List<String> options, String question)
	{
		put(title);
		put(System.lineSeparator());
		int number = 1;
		for(String item : options)
		{
			put("  [" + (number++) + "] " + item);
			put(System.lineSeparator());
		}
		put(System.lineSeparator());
		put(question);
		int choice = getInt(1, options.size());
		return choice - 1;
	}

	default int choose(String title, String[] options, String question)
	{
		put(title);
		put(System.lineSeparator());
		int number = 1;
		for(String item : options)
		{
			put("  [" + (number++) + "] " + item);
			put(System.lineSeparator());
		}
		put(System.lineSeparator());
		put(question);
		int choice = getInt(1, options.length);
		return choice - 1;
	}

}
