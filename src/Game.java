import java.util.Random;
import java.util.Scanner;


public class Game extends Render {

	//GAME LOGIC
	static Scanner userInput = new Scanner(System.in);
	static Scanner userEnter = new Scanner(System.in);
	static int menuNumber;
	
	//PLAYER
	static int playerHP;
	static String playerName;
	static String playerWeapon;
	static String playerArmor;
	static String playerPouch;
	static String playerKey;

	static String thisdoesnothing = "hehe";


	// ???
	int playerMana;
	static int playerLevel;
	int playerXP;
	
	//DEMON
	int demonHP;
	boolean dreglingIsKilled;
	
	//NPC
	String npcRydyell;
	
	//WORLD
	boolean roomE1DoorOpen;
	boolean gateDoor1;
	
	//ITEMS
	boolean obtainedAOP;

	String equipWeapon;
	String weaponName;
	int weaponDamage;
	private String addWeapon;
	
	/*ENEMY TYPES:
	 * ?? Boletaria Soldier
	 * 
	 * L0 Prisoner
	 * L0 Dregling
	 * L1 Shadow Lurker
	 * 
	 * L1 Silver Skeleton
	 * L2 Gold Skeleton
	 * L3 Black Skeleton
	 * 
	 * L4 Blue Eye Knight
	 * L5 Red Eye Knight
	 * 
	 * ?? Man Centipede
	 * 
	 * ?? Gragoyle
	 * 
	 * ?? Plague Babies
	 * 
	 * ?? Storm Beast
	 * 
	 * ?? Giant tick / SACK LIKE CREATURE
	 * ?? Prisoner Horde
	 * ?? Dregling
	 */

	//INIT WEAPONS
	Weapon fist = new Weapon("Fist", "Bare hands", 1);
	Weapon rod = new Weapon("Rod", "Rusty rod", 3);
	Weapon brokenSword = new Weapon("Broken Sword", "Chipped sword",3);
	Weapon crystalSword = new Weapon("Crystal Sword", "Pristine Legendary Weapon", 3);

	//INIT START SCREEN
	public void startMenu() {
		playerInit();
		Print.menuText();
		menuNumber = userInput.nextInt();
		
		if (menuNumber == 1) {
			playerStart();
			
		} else if (menuNumber == 2) {
			Print.menuHelp();
			userEnter.nextLine();
			startMenu();
			
			
		} else if (menuNumber == 3) {
			Print.menuAbout();
			userEnter.nextLine();
			startMenu();
			
		} else if (menuNumber == 99) {
			System.exit(0);
			
		} else {
			startMenu();
			
		}
	}
	
	public void playerInit() {
		
		//INIT WORLD
		roomE1DoorOpen = false;
		gateDoor1 = false;
		obtainedAOP = false;
		dreglingIsKilled = false;
		
		//INIT PLAYER
		playerName = "IDDQD";
		playerHP = 5;
		playerMana = 100;

		equipWeapon = "Fist";
		
		playerWeapon = "Fist";
		playerArmor = "None";
		playerKey = "None";
		playerPouch = "Empty";
		
		//INIT DEMON
		demonHP = 15;
		
		//PLAYER XP
		playerLevel = 0;
		playerXP = 0;
		
		
	}
	
	public void playerAddXP() {
		playerXP = +10;
		
		if (playerXP == 10) {
			playerLevel = +1;
			Print.playerXPText();
			
		}
	}
	
	public void playerStart() {
		Print.playerIntroText();
		userEnter.nextLine();
		roomE1F0();
	}
	
	//START CELL
	public void roomE1F0() {
		
		if (roomE1DoorOpen == false) {
			userInterface();
			Print.startCellMenu();
			menuNumber = userInput.nextInt();
		
			if (menuNumber == 1) {
			
				if (weaponList.contains(rod.name)) {
					equipWeapon = "Fist";
					userInterfaceSpeechLineTop();
					Print.startCellChoice1();
					userEnter.nextLine();
					roomE2F0();
				
				} else {
					Print.startCellChoice1Else();
					userEnter.nextLine();
					roomE1F0();
				}

		} else if (menuNumber == 2) {
			
			if (equipWeapon.contentEquals("Fist")) {

				weaponList.add(rod.name);
				equipWeapon = rod.name;

				Print.startCellChoice2();
				userEnter.nextLine();
				roomE1F0();
				
			} else if (roomE1DoorOpen == true){
				Print.startCellDoorOpen();
				userEnter.nextLine();
				roomE1F0();	
			
			} else {
				Print.startCellElse();
				userEnter.nextLine();
				roomE1F0();
				
			}
			
		} else if (menuNumber == 3) {
			Print.startCellChoice3();
			userEnter.nextLine();
			roomE1F0();

		} else if (menuNumber == 4) {
			
			if (playerHP < 2) {
				dead();
				
			} else {
			  playerHP = playerHP - 1;
		      Print.startCellChoice4();
			  userEnter.nextLine();
			  roomE1F0();
			
			}
			
		} else {
			roomE1F0();

		}
		
		} else {
			userInterface();
			Print.startCellFinished();
			menuNumber = userInput.nextInt();
			
			if (menuNumber == 1) {
				
				roomE2F0();
				
			} else {
				
				roomE1F0();
			}
			
		}
			
	}
	
	// PRISON CHAMBER FLOOR 0
	public void roomE2F0(){
		roomE1DoorOpen = true;
		userInterface();
		Print.prisonChamberMenu();

		menuNumber = userInput.nextInt();
		
		if(menuNumber == 1){
			
			if (playerPouch.contentEquals("Amulet of Prayer")) {
				playerPouch = "Empty";
				Print.strangerAmulet();
				roomE2F0();
				
			} else if (playerPouch.contentEquals("Crescent Moon Grass") && playerName.contentEquals("IDDQD")) {
				Print.strangerInitText();
				playerCheat();
				userEnter.nextLine();
				Print.strangerGrass();
				keyList.add("Copper Key");
				roomE2F0();
				
			} else if (playerPouch.contentEquals("Crescent Moon Grass")) {
				Print.strangerGrass();
				keyList.add("Copper Key");
				roomE2F0();
				
		    } else if (playerName.contentEquals("IDDQD")) {
		    	Print.strangerInitText();
		    	playerCheat();
				
			} else {
				Print.strangerElse();
				userEnter.nextLine();
				
				roomE2F0();
				
			}
			
		} else if (menuNumber == 2) {
			
			if (gateDoor1 == true) {
			Print.prisonChoice2();
			ending();
				
			} else {
			Print.prisonChoice2Open();
			roomE2F0();
			
			}
		} else if (menuNumber == 3){
			roomF2F1();
			
		} else if (menuNumber == 4){
			roomE1F0();
			
		} else {
			roomE2F0();
			
		}
	}
	
	// STAIRWELL PASSAGE FLOOR TWO
	public void roomF2F1() {
		userInterface();
		Print.stairwellPassageMenu();
		
		menuNumber = userInput.nextInt();
		
		if(menuNumber == 1){
			roomF1F1();
			
		}
		else if(menuNumber == 2) {
			
			if (keyList.contains("Copper Key")) {
				Print.stairwellChoice2HasKey();
				roomG2F1();
				
			} else {
				Print.stairwellChoice2();
				roomF2F1();
				
			}
			
		} else if(menuNumber == 3){
			roomF3F1();
			
		} else if(menuNumber == 4){
			roomE2F0();
			
		} else{
			roomF2F1();
			
		}
	}
	
	// STORAGE FLOOR 1
	public void roomF1F1(){
		
		userInterface();
		Print.storageRoomMenu();
		
		menuNumber = userInput.nextInt();
		
		if(menuNumber == 1){
			
			if(playerHP < 10) {
				playerHP = playerHP + 1;
				Print.storageRoomChoice1();
				roomF1F1();
				
			} else {
				Print.storageRoomChoice1Else();
				userEnter.nextLine();
				roomF1F1();
				
			}
	
		}
		else if(menuNumber == 2){
			
			if (playerPouch.contentEquals("Empty")) {
				playerPouch = "Crescent Moon Grass";
				Print.storageRoomChoice2();
				roomF1F1();
			
			} else {
				Print.storageRoomChoice2Else();
				roomF1F1();
				
			}
			
		} else if(menuNumber == 3){
			roomF2F1();
			
		} else {
			roomF1F1();
			
		}
	}
	
	// GUARD ROOM 1 FLOOR 1
	public void roomG2F1(){
		boolean playerAccessedGuardroom = false;
		userInterface();
		Print.guardRoomMenu();
		menuNumber = userInput.nextInt();
		
		if(playerAccessedGuardroom == true) {
			
			System.out.println("\nYou hear steps. Hide in the cabinet");
			userInterfaceSpeechLineBottom();
			System.out.println("[PRESS ENTER TO CONTINUE]\n");
		
			if(menuNumber == 1){

				weaponList.add(brokenSword.name);
				equipWeapon = brokenSword.name;
				
				Print.guardRoomChoice1();
				roomG2F1();
			
			} else if(menuNumber == 2){
				playerArmor = "Robe";

				Print.guardRoomChoice2();
				roomG2F1();
			
			} else if(menuNumber == 3){
				
				roomF2F1();
				
			} else {
				roomG2F1();
			}
			
		} else {
			
			if(menuNumber == 1){
				
				if(!weaponList.contains(brokenSword.name)) {
				equipWeapon = brokenSword.name;
				
				brokenswordGraphics();
				
				userInterfaceSpeechLineTop();
				System.out.println(" You equip a [Broken Sword]");
				userInterfaceSpeechLineBottom();
				System.out.println("[PRESS ENTER TO CONTINUE]");
				userEnter.nextLine();
				roomG2F1();
				
				} else {
					
					userInterfaceSpeechLineTop();
					System.out.println(" You can only carry one [Broken Sword]");
					userInterfaceSpeechLineBottom();
					System.out.println("[PRESS ENTER TO CONTINUE]");
					userEnter.nextLine();
					roomG2F1();
					
				}
			
			} else if(menuNumber == 2) {
				
				if (playerArmor.contentEquals("None")) {
					
					playerArmor = "Robe";

					robeGraphics();

					userInterfaceSpeechLineTop();
					System.out.println(" You equip a [Robe]");
					userInterfaceSpeechLineBottom();
					System.out.println("[PRESS ENTER TO CONTINUE]");
					userEnter.nextLine();
					roomG2F1();
					
				} else {
					
					userInterfaceSpeechLineTop();
					System.out.println(" You can only wear one [Robe]");
					userInterfaceSpeechLineBottom();
					System.out.println("[PRESS ENTER TO CONTINUE]");
					userEnter.nextLine();
					roomG2F1();
					
				}
			
			} else if(menuNumber == 3){
				
				roomF2F1();
				
			} else{
				
				roomG2F1();
				
			}
		 
		}
		
	}
	
	// GATE HOUSE Floor 1
	public void roomF3F1() {
		
		if (demonHP > 0) {
	
			userInterface();
			Print.gateHouseMenu();

			menuNumber = userInput.nextInt();
		
			if(menuNumber == 1) {
				
			fight();
			
			} else if(menuNumber == 2) {
				
			roomF2F1();
	
			} else {
				
			roomF3F1();
		}
		
		} else {
			
			playerKillDreglingF3F1();
			
		}
	}
	
	public void fight() {
		
		userInterface();
		
		dregling1Graphics();
		
		System.out.println("[" + playerName + " Health: "+ playerHP + "]");
		System.out.println("[Foul Dregling Health: " + demonHP + "]");
		userInterfaceLine();
		System.out.println("1: Attack Foul Dregling with " + equipWeapon);
		System.out.println("2: Run back to Stairwell Passage");
		userInterfaceLine();

		menuNumber = userInput.nextInt();
		
		if(menuNumber == 1) {
			
			attack();
			
		}
		else if(menuNumber == 2) {
			
			roomF2F1();
			
		}
		else {
			
			fight();
			
		}
	}
	
	public void attack() {

		Random rand;
		rand = new Random();

		int playerDamage = 0;
		// IF PLAYERLEVEL EQUALS 1
		
		// IF PLAYERLEVEL EQUALS 5
		
		//
		if(equipWeapon.isEmpty()) {
			
			playerDamage = rand.nextInt(1);
			
		} else if(equipWeapon.contains(fist.name)) {
			
			playerDamage = rand.nextInt(fist.dmg);
			
		} else if(equipWeapon.contains(rod.name)) {
			
			playerDamage = rand.nextInt(rod.dmg);
			
		} else if(equipWeapon.contains(brokenSword.name)) {
			
			playerDamage = rand.nextInt(brokenSword.dmg);
			
		} else if(equipWeapon.contains(crystalSword.name)) {
			
			playerDamage = rand.nextInt(crystalSword.dmg);
		}
		
		dregling1Graphics();
		userInterfaceSpeechLineTop();
		System.out.println(" You attacked the Foul Dregling with " + equipWeapon + " and gave " + playerDamage + " damage!");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
	
		demonHP = demonHP - playerDamage;
		
		userInterfaceSpeechLineTop();

		System.out.println("[Foul Dregling Health: " + demonHP + "]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
		if(demonHP < 1) { 
			
			playerKillDreglingF3F1(); 
		
		} else if(demonHP > 0) {
			
			int demonDamage = 0;
			demonDamage = rand.nextInt(4);
			
			userInterface();
			dregling1Graphics();
			userInterfaceSpeechLineTop();
			System.out.println(" The Foul Dregling attacked you and gave " + demonDamage + " damage!");
			userInterfaceSpeechLineBottom();
			System.out.println("[PRESS ENTER TO CONTINUE]");
			userEnter.nextLine();
			
			playerHP = playerHP - demonDamage;
			
			userInterfaceSpeechLineTop();
			System.out.println("[" + playerName + " Health: " + playerHP + "]");
			userInterfaceSpeechLineBottom();
			System.out.println("[PRESS ENTER TO CONTINUE]");
			userEnter.nextLine();
			
			if(playerHP < 1) {
				
				dead(); 
				
			} else if(playerHP > 0) {
				
				fight();
				
			}
		}
		
	}
	
	
	public void dead() {
		
		userInterfaceSpeechLineTop();
		System.out.println(" You have died!");
		System.out.println(" Boletaria remains in despair.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		
		userEnter.nextLine();
		
		startScreen();
		
		startMenu();
		
	}
	
	//PLAYER KILLS DREG IN GATEHOUSE
	public void playerKillDreglingF3F1() {
		
		//ADDS PLAYER XP
		playerAddXP();
		
		userInterface();
		dreglingIsKilled = true;
		
		System.out.println("You killed the Dregling.\n");
		System.out.println("In front of you lies the corpse of the Dregling, and something shiny sparkles within its\nintestines.\n\nThere is also a lever, what will happen if you pull it?\n");
		userInterfaceLine();
		System.out.println("1: Search Corpse");
		System.out.println("2: Pull lever");
		System.out.println("3: Go back to Stairwell Passage");
		userInterfaceLine();

		menuNumber = userInput.nextInt();
		
		if(menuNumber == 1) {
			
			if(obtainedAOP == false) {
			
			playerPouch = "Amulet of Prayer";
			obtainedAOP = true;
			
			amuletGraphics();
			
			userInterfaceSpeechLineTop();
			System.out.println(" You picked up an Amulet of Prayer. It has some markings in some language I cant decipher.");
			System.out.println(" Obtained: [Amulet of Prayer]");
			userInterfaceSpeechLineBottom();
			System.out.println("[PRESS ENTER TO CONTINUE]");
			userEnter.nextLine();
			playerKillDreglingF3F1();
			
			} else {
				
				userInterfaceSpeechLineTop();
				System.out.println(" There is nothing more in this corpse.");
				System.out.println(" Your hands are covered in blood and Demon feces.");
				userInterfaceSpeechLineBottom();
				System.out.println("[PRESS ENTER TO CONTINUE]");
				userEnter.nextLine();
				playerKillDreglingF3F1();
				
			}
			
		} else if (menuNumber == 2) {
			
			gateDoor1 = true;
			userInterfaceSpeechLineTop();
			System.out.println(" The lever is pulled, and the ground rumbles.");
			System.out.println(" Something seems to have happened.");
			userInterfaceSpeechLineBottom();
			System.out.println("[PRESS ENTER TO CONTINUE]");
			userEnter.nextLine();
			playerKillDreglingF3F1();
			
		} else if (menuNumber == 3) {
			
			roomF2F1();
		
		} else{
			
			playerKillDreglingF3F1();
		}
		
	}
	
	public void ending() {
		
		userInterfaceSpeechLineTop();
		System.out.println(" Congratulations!\n");
		System.out.println(" You made it through the first gate " + playerName + "!\n");
		System.out.println(" There are more Demons and Gates to come.\n");
		System.out.println(" Tower of Latria - Made by Eirik Andreas Bergsmark 2019");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		
		userEnter.nextLine();
		
		startScreen();
		
		startMenu();
	}
	
	public void playerCheat() {
		if (playerName.contentEquals("Bengt")) {
			playerHP = 99;
			equipWeapon = crystalSword.name;
			weaponList.add(crystalSword.name);
			roomE2F0();
		} else {
			roomE2F0();
		}
		
	}
	
	//INTERFACE
	
	
public static void inventoryInterface() {
		userInterfaceSpeechLineTop();
		System.out.println("WEAPONS IN INVENTORY");
		System.out.println(weaponList);
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
}


	public static void main(String[] args) {

		//INIT GAME
		Game game;
		game = new Game();



		startScreen();

		game.startMenu();
		game.roomE2F0();


		System.out.println(playerHP + " " +  playerLevel);




	}

} //END GAME CLASS


