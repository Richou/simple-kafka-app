package com.heanoria.reminders.kafkasample.consumer.datas;

public class MessageContainer {

	private final boolean error;
	private final String value;
	private final Exception exception;

	private MessageContainer(boolean error, String value, Exception exception) {
		this.error = error;
		this.value = value;
		this.exception = exception;
	}

	public boolean isError() {
		return error;
	}

	public String getValue() {
		return value;
	}

	public Exception getException() {
		return exception;
	}

	public static MessageContainerBuilder builder() {
		return new MessageContainerBuilder();
	}

	public static final class MessageContainerBuilder {
		private String value;
		private Exception exception;

		private MessageContainerBuilder() {
		}

		public MessageContainerBuilder value(String value) {
			this.value = value;
			return this;
		}

		public MessageContainerBuilder exception(Exception exception) {
			this.exception = exception;
			return this;
		}

		public MessageContainer buildValidMessage() {
			return new MessageContainer(false, value, null);
		}

		public MessageContainer buildErrorMessage() {
			return new MessageContainer(true, null, exception);
		}
	}
}
