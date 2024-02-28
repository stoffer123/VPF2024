package dk.cphbusiness.evu.vp.f2024.network.chatserver;

public class DummyTextListener implements TextListener
{
	@Override
	public void handleText(String text)
	{
		System.out.println(text);
	}
}
