public class Main{
	
	public static void main(String[] args){

		Team team1 = new Team("Real Madrid");
		Team team2 = new Team("FC København");
		Team team3 = new Team("Bayern München");
		Team team4 = new Team("Manchester City");
		Team team5 = new Team("Manchester United");

		team1.setteamRank(1);
		team2.setteamRank(2);
		team3.setteamRank(3);
		team4.setteamRank(4);
		team5.setteamRank(5);

		team1.addteamPlayer("Vinicius Junior");
		team1.addteamPlayer("Kylian Mbappe");
		team1.addteamPlayer("Jude Bellingham");
		team2.addteamPlayer("Rasmus Falk");
		team2.addteamPlayer("Mohamed Elyounoussi");
		team2.addteamPlayer("Kevin Diks");
		team3.addteamPlayer("Harry Kane");
		team3.addteamPlayer("Jamal Musiala");
		team3.addteamPlayer("Manuel Neuer");
		team4.addteamPlayer("Erling Haaland");
		team4.addteamPlayer("Kevin De Bruyne");
		team4.addteamPlayer("Rodri");
		team5.addteamPlayer("Alejandro Garnacho");
		team5.addteamPlayer("Kobbie Mainoo");
		team5.addteamPlayer("Christian Eriksen");

		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());


	}

}
