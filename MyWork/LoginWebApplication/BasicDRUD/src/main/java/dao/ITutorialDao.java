package dao;

import java.sql.SQLException;
import java.util.List;

import bol.TutorialPojo;

public interface ITutorialDao {
	List<String> getAllTutorialNamesByTopic(int topicId) throws SQLException;
	TutorialPojo getTutorialDetailsByName(String tutName) throws SQLException;
	//add a method to update visits by customer
	String updateVisits(String tutName) throws SQLException;
}
