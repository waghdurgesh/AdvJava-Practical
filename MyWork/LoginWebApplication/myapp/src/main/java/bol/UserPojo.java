package bol;

public class UserPojo {

	private String login = null;
	private int id = 0;
	private String node_id = null;
	private String avatar_url = null;
	private String html_url = null;
	private String followers_url = null;
	private String gists_url = null;
	private String starred_url = null;
	private String subscriptions_url = null;
	private String organizations_url = null;
	private String repos_url = null;
	private String received_events_url = null;
	private boolean site_admin = false;
	private String name = null;
	private String company = null;
	private String blog = null;
	private String location = null;
	private String email = null;
	private String hireable = null;
	private String bio = null;
	private String twitter_username = null;
	private int public_repos = 0;
	private int public_gists = 0;
	private int followers = 0;
	private int following = 0;
	private String updated_at = null;
	private String created_at = null;

	public UserPojo() {

		/*
		 * "login": "waghdurgesh", "id": 121015119, "node_id": "U_kgDOBzaLTw",
		 * "avatar_url": "https://avatars.githubusercontent.com/u/121015119?v=4",
		 * "gravatar_id": "", "url": "https://api.github.com/users/waghdurgesh",
		 * "html_url": "https://github.com/waghdurgesh", "followers_url":
		 * "https://api.github.com/users/waghdurgesh/followers", "following_url":
		 * "https://api.github.com/users/waghdurgesh/following{/other_user}",
		 * "gists_url": "https://api.github.com/users/waghdurgesh/gists{/gist_id}",
		 * "starred_url":
		 * "https://api.github.com/users/waghdurgesh/starred{/owner}{/repo}",
		 * "subscriptions_url":
		 * "https://api.github.com/users/waghdurgesh/subscriptions",
		 * "organizations_url": "https://api.github.com/users/waghdurgesh/orgs",
		 * "repos_url": "https://api.github.com/users/waghdurgesh/repos", "events_url":
		 * "https://api.github.com/users/waghdurgesh/events{/privacy}",
		 * "received_events_url":
		 * "https://api.github.com/users/waghdurgesh/received_events", "type": "User",
		 * "site_admin": false, "name": "Durgesh Wagh", "company": null, "blog": "",
		 * "location": "India", "email": null, "hireable": null, "bio":
		 * "Pursuing Development of Advanced Computing at CDAC", "twitter_username":
		 * null, "public_repos": 9, "public_gists": 0, "followers": 18, "following": 17,
		 * "created_at": "2022-12-19T08:57:02Z", "updated_at": "2023-01-21T13:47:05Z" }
		 */

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public String getFollowers_url() {
		return followers_url;
	}

	public void setFollowers_url(String followers_url) {
		this.followers_url = followers_url;
	}

	public String getGists_url() {
		return gists_url;
	}

	public void setGists_url(String gists_url) {
		this.gists_url = gists_url;
	}

	public String getStarred_url() {
		return starred_url;
	}

	public void setStarred_url(String starred_url) {
		this.starred_url = starred_url;
	}

	public String getSubscriptions_url() {
		return subscriptions_url;
	}

	public void setSubscriptions_url(String subscriptions_url) {
		this.subscriptions_url = subscriptions_url;
	}

	public String getOrganizations_url() {
		return organizations_url;
	}

	public void setOrganizations_url(String organizations_url) {
		this.organizations_url = organizations_url;
	}

	public String getRepos_url() {
		return repos_url;
	}

	public void setRepos_url(String repos_url) {
		this.repos_url = repos_url;
	}

	public String getReceived_events_url() {
		return received_events_url;
	}

	public void setReceived_events_url(String received_events_url) {
		this.received_events_url = received_events_url;
	}

	public boolean isSite_admin() {
		return site_admin;
	}

	public void setSite_admin(boolean site_admin) {
		this.site_admin = site_admin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHireable() {
		return hireable;
	}

	public void setHireable(String hireable) {
		this.hireable = hireable;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getTwitter_username() {
		return twitter_username;
	}

	public void setTwitter_username(String twitter_username) {
		this.twitter_username = twitter_username;
	}

	public int getPublic_repos() {
		return public_repos;
	}

	public void setPublic_repos(int public_repos) {
		this.public_repos = public_repos;
	}

	public int getPublic_gists() {
		return public_gists;
	}

	public void setPublic_gists(int public_gists) {
		this.public_gists = public_gists;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public UserPojo(String login, int id, String node_id, String avatar_url, String html_url, String followers_url,
			String gists_url, String starred_url, String subscriptions_url, String organizations_url, String repos_url,
			String received_events_url, boolean site_admin, String name, String company, String blog, String location,
			String email, String hireable, String bio, String twitter_username, int public_repos, int public_gists,
			int followers, int following, String updated_at, String created_at) {
		super();
		this.login = login;
		this.id = id;
		this.node_id = node_id;
		this.avatar_url = avatar_url;
		this.html_url = html_url;
		this.followers_url = followers_url;
		this.gists_url = gists_url;
		this.starred_url = starred_url;
		this.subscriptions_url = subscriptions_url;
		this.organizations_url = organizations_url;
		this.repos_url = repos_url;
		this.received_events_url = received_events_url;
		this.site_admin = site_admin;
		this.name = name;
		this.company = company;
		this.blog = blog;
		this.location = location;
		this.email = email;
		this.hireable = hireable;
		this.bio = bio;
		this.twitter_username = twitter_username;
		this.public_repos = public_repos;
		this.public_gists = public_gists;
		this.followers = followers;
		this.following = following;
		this.updated_at = updated_at;
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "UserPojo [login=" + login + ", id=" + id + ", node_id=" + node_id + ", avatar_url=" + avatar_url
				+ ", html_url=" + html_url + ", followers_url=" + followers_url + ", gists_url=" + gists_url
				+ ", starred_url=" + starred_url + ", subscriptions_url=" + subscriptions_url + ", organizations_url="
				+ organizations_url + ", repos_url=" + repos_url + ", received_events_url=" + received_events_url
				+ ", site_admin=" + site_admin + ", name=" + name + ", company=" + company + ", blog=" + blog
				+ ", location=" + location + ", email=" + email + ", hireable=" + hireable + ", bio=" + bio
				+ ", twitter_username=" + twitter_username + ", public_repos=" + public_repos + ", public_gists="
				+ public_gists + ", followers=" + followers + ", following=" + following + ", updated_at=" + updated_at
				+ ", created_at=" + created_at + "]";
	}
}