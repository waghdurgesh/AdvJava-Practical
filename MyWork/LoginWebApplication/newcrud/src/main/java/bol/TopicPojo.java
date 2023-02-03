package bol;

public class TopicPojo {

	private int topic_id = 0;
	private String topic_name = null;
	
	public TopicPojo() {
		
	}

	public TopicPojo(int topic_id, String topic_name) {
		super();
		this.topic_id = topic_id;
		this.topic_name = topic_name;
	}

	@Override
	public String toString() {
		return "TopicPojo [topic_id=" + topic_id + ", topic_name=" + topic_name + "]";
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

}