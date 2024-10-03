import java.util.ArrayList;

public class Team {
	
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerNames;


public Team(String teamName){

	this.teamName = teamName;
	this.playerNames = playerNames = new ArrayList<>();

}

public void setteamRank(int teamRank){

	this.teamRank = teamRank;

}

public void addteamPlayer(String playerName){

	playerNames.add(playerName);

}



@Override
public String toString(){

	StringBuilder list = new StringBuilder("Hold: "+teamName+" \n"+"Rang: "+teamRank+" \n"+"Top 3 spillere: \n");
	for (String teamPlayer : playerNames){

		list.append(teamPlayer).append("\n");

	}

	return list.toString();

}

}