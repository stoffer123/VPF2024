package dk.cphbusiness.evu.vp.f2024.textio;

import java.util.List;

public interface TextIO
{
	void put(String str);
	void clear();
	String get();
	int getInt();
	int getInt(int min, int max);
	int choose(String title, List<String> options, String question);
	int choose(String title, String[] options, String question);
}
