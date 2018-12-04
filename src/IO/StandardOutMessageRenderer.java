package IO;

public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider;
	@Override
	public void render() {
		// TODO Auto-generated method stub
		if(messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.messageProvider=provider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return messageProvider;
	}

}
