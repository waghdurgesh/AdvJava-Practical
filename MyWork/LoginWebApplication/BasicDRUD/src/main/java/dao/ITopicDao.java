package dao;

import java.sql.SQLException;
import java.util.List;

import bol.TopicPojo;

public interface ITopicDao {
	List<TopicPojo> getAllTopics() throws SQLException;
}
