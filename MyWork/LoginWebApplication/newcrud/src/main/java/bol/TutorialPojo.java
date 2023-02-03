package bol;

import java.sql.Date;

public class TutorialPojo {

	private int tut_id = 0;
	private String tut_name = null;
	private String tut_author = null;
	private Date tut_publish_date = null;
	private int tut_visits = 0;
	private String tut_contents = null;
	private int tut_topic_id = 0;
	
	public TutorialPojo() {
		
	}

	public TutorialPojo(int tut_id, String tut_name, String tut_author, Date tut_publish_date, int tut_visits,
			String tut_contents, int tut_topic_id) {
		super();
		this.tut_id = tut_id;
		this.tut_name = tut_name;
		this.tut_author = tut_author;
		this.tut_publish_date = tut_publish_date;
		this.tut_visits = tut_visits;
		this.tut_contents = tut_contents;
		this.tut_topic_id = tut_topic_id;
	}

	@Override
	public String toString() {
		return "TutorialPojo [tut_id=" + tut_id + ", tut_name=" + tut_name + ", tut_author=" + tut_author
				+ ", tut_publish_date=" + tut_publish_date + ", tut_visits=" + tut_visits + ", tut_contents="
				+ tut_contents + ", tut_topic_id=" + tut_topic_id + "]";
	}

	public int getTut_id() {
		return tut_id;
	}

	public void setTut_id(int tut_id) {
		this.tut_id = tut_id;
	}

	public String getTut_name() {
		return tut_name;
	}

	public void setTut_name(String tut_name) {
		this.tut_name = tut_name;
	}

	public String getTut_author() {
		return tut_author;
	}

	public void setTut_author(String tut_author) {
		this.tut_author = tut_author;
	}

	public Date getTut_publish_date() {
		return tut_publish_date;
	}

	public void setTut_publish_date(Date tut_publish_date) {
		this.tut_publish_date = tut_publish_date;
	}

	public int getTut_visits() {
		return tut_visits;
	}

	public void setTut_visits(int tut_visits) {
		this.tut_visits = tut_visits;
	}

	public String getTut_contents() {
		return tut_contents;
	}

	public void setTut_contents(String tut_contents) {
		this.tut_contents = tut_contents;
	}

	public int getTut_topic_id() {
		return tut_topic_id;
	}

	public void setTut_topic_id(int tut_topic_id) {
		this.tut_topic_id = tut_topic_id;
	}

}