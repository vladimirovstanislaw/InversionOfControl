package IO;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
	private static MessageSupportFactory instance;
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;

	private MessageSupportFactory() {
		props = new Properties();
		try {
			String jj=System.getProperty("user.dir");
			System.out.println(jj);
			props.load(new FileInputStream("src\\IO\\msf.properties"));
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");

			renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
			provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;

	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}
}
