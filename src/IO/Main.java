package IO;

public class Main {
	public static void main(String[] args) {
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
		mr.render();
		mr.render();
	}
}
