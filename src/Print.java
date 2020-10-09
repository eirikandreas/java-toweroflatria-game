
public class Print extends Game{
	
	
	
	public static void menuText(){
		
		System.out.println("\n*********** WELCOME TO THE TOWER OF LATRIA. YOU FAITH DEPENDS ON YOUR CHOICES ************\n");
		System.out.println("\u250F\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2513");
		System.out.println("\u2503                                                                                        \u2503");
		System.out.println("\u2503 1: NEW GAME 2: HELP 3: ABOUT 99: EXIT                                                  \u2503");
		System.out.println("\u2503                                                                                        \u2503");
		System.out.println("\u2517\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u251B");
	}
	
	public static void menuHelp() {
		userInterfaceSpeechLineTop();
		System.out.println("\n [HELP]\n");
		System.out.println("\n You will be presented with different numbers that corresponds to your actions.\n");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void menuAbout() {
		userInterfaceSpeechLineTop();
		System.out.println("\n [ABOUT]\n");
		System.out.println("\n Tower of Latria\n");
		System.out.println("\n By Eirik Andreas Bergsmark\n\n 2019\n");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void playerXPText() {
		userInterfaceSpeechLineTop();
		System.out.println(" You gained a level");
		System.out.println(" Current Player level: " + Game.playerLevel);
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void playerIntroText() {
		userInterfaceSpeechLineTop();
		System.out.println(" The Old One, an entity of unfathomable power, had awakened the bane of existence into \n the world, unleashing terrible Demons that ripped the land asunder, consequently\n exterminating half of humankind.\n\n The once devoted shrine of Boletaria, the Tower of Latria, was used by Cleric the Madman\n and his army of Demons to imprison and torture the people of Boletaria.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
		userInterfaceSpeechLineTop();
		System.out.println(" You wake up by a hellish scream that pierce through your head, on a cold, stone floor. \n The room is dark and only a thin beam of light emits through a crack in the wall.\n You dont remember how you got here.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	
	// START CELL
	
	public static void startCellMenu() {
		System.out.println("You are here: Cell.\n");
		System.out.println("A door is in front of you, and there is a crack in the wall.\n");
		System.out.println("On the floor there is a rod, some pebbles and a tray.");
		System.out.println("");
		userInterfaceLine();
		System.out.println("1: Open door");
		System.out.println("2: Pick up rod");
		System.out.println("3: Peek through crack");
		System.out.println("4: Kick wall in despair");
		userInterfaceLine();
	}
	
	public static void startCellChoice1() {
		System.out.println(" You broke the hinge with the Rod! The Rod broke in the process. \n You carefully open the door.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void startCellChoice1Else(){
		userInterfaceSpeechLineTop();
		System.out.println(" Nothing happens. It seems like one of the door hinges are loose.\n Maybe i could break it with something.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		
	}
	
	public static void startCellChoice2() {
		rodGraphics();
		userInterfaceSpeechLineTop();
		System.out.println(" You picked up a rod");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		
	}
	
	public static void startCellChoice3() {
		userInterfaceSpeechLineTop();
		System.out.println(" Through the tiny crack, you can se the devestaded remains of Boletaria. It appears that\n you are situated in a cell soaring in the skies.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void startCellChoice4() {
		userInterfaceSpeechLineTop();
		System.out.println(" The hard surface of the cell wall hurts you. You take 1 damage.");
		System.out.println(" Current Health: " + Game.playerHP);
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void startCellElse() {
		userInterfaceSpeechLineTop();
		System.out.println(" You have allready picked up the rod.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void startCellDoorOpen() {
		userInterfaceSpeechLineTop();
		System.out.println(" The rod is useless after breaking the hinge.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void startCellFinished() {
		System.out.println("You are here: Cell.\n");
		System.out.println("This is the cell you came from.\n");
		System.out.println("There is nothing here.");
		System.out.println("");
		userInterfaceLine();
		System.out.println("1: Go to Prison Chamber");
		userInterfaceLine();
	}
	
	
	// PRISON CHAMBER
	
	public static void prisonChamberMenu() {
		System.out.println("You are here: Prison Chamber.\n");
		System.out.println("On your left there is several prison cells, and to your right there is a stairwell in\nfront of you, there is a gate.\n");
		System.out.println("You hear a faint breath from one of the prison cells. Like there is someone there.");
		System.out.println("");
		userInterfaceLine();
		System.out.println("1: Approach the stranger");
		System.out.println("2: Open Gate");
		System.out.println("3: Enter Stairwell Passage");
		System.out.println("4: Go to Cell");
		userInterfaceLine();
	}
	
	public static void prisonChoice2() {
		userInterfaceSpeechLineTop();
		System.out.println(" The lever had opened the Gate.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	public static void prisonChoice2Open() {
		userInterfaceSpeechLineTop();
		System.out.println(" This gate is opened elsewhere.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	// STRANGER 

	public static void strangerAmulet() {
		stranger1Graphics();
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: What? You managed to kill the Foul Dregling!");
		System.out.println(" Oh, thats a precious, sacred amulet! It has several markings on it in the language of\n the Gods! It reads: Thou that have faith and wisdom, will prevail!");
		System.out.println("\n Gave: [Amulet of Prayer]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		userEnter.nextLine();
		
	}
	
	public static void strangerGrass() {
		
		Game.playerPouch = "Empty";

		
		stranger1Graphics();
		
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: Thank you! I'm in high dept!\n\nI managed to get hold of a key to the Guard Room. As a thanks for your help, take it!\n Thats where you may find a weapon!");
		System.out.println("\n Gave: [Crescent Moon Grass]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
		copperKeyGraphics();
		userInterfaceSpeechLineTop();
		System.out.println(" Obtained: [Copper Key]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
	}
	
	public static void strangerInitText() {
		stranger1Graphics();
		
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: Psst!");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
		stranger1Graphics();
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: Who are you?");
		userInterfaceSpeechLineBottom();
		System.out.println("Please enter your name:");
		userInterfaceLine();
		Game.playerName = Game.userInput.nextLine();
		Game.playerName = Game.userInput.nextLine();
		
		stranger1Graphics();
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: Do you know why you are here, " + playerName + "? You were one of the hunters who opposed\n Cleric the Madmans extortion of mankind, " + playerName + ". Cleric use this Tower to expel the\n remains of all the people of Boletaria.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
		stranger1Graphics();
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: I am Lord Rydyell, and I have been locked up in this prison cell for several\n centuries. They keep us locked in here to accumulate masses of flesh, so that\n Cleric the Madman can create large Demon armies.\n\n In my time I have come to learn the language of the Demon Gods, and\n our future does not seem bright!\n\n Please get out of here and stop this madness!");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
		stranger1Graphics();
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: Beware! There is a Demon guard somewhere close you will need a weapon to defeat\n him.\n\n If you happen to find anything written in the language of the Demon Gods, I can be of\n assistance!\n\n And please, I'm starving. Bring me something to eat. You will not regret it.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	public static void strangerElse() {
		stranger1Graphics();
		
		userInterfaceSpeechLineTop();
		System.out.println(" Stranger: Beware! There is a Demon guard somewhere close you will need a weapon to defeat\n him.\n\n If you happen to find anything written in the language of the Demon Gods, I can be of\n assistance!\n\n And please, I'm starving. Bring me something to eat. You will not regret it.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	// STAIRWELL PASSAGE
	
	public static void stairwellPassageMenu() {
		System.out.println("You are here: Stairwell Passage\n");
		System.out.println("In front of you, there is a passageway that leads to a storage. One of the walls is\ncovered with a heavily reinforced door, and there is another stairwell to what seems to be\na Gate House.\n");
		System.out.println("There seems to be a lock mechanism, which needs a key for the heavily reinforced door to\nopen.");
		System.out.println("");
		userInterfaceLine();
		System.out.println("1: Enter Storage");
		System.out.println("2: Open heavily reinforced door");
		System.out.println("3: Proceed to Gate House");
		System.out.println("4: Go to Prison Chamber");
		userInterfaceLine();
	}
	
	public static void stairwellChoice2() {
		userInterfaceSpeechLineTop();
		System.out.println(" The heavily reinforced door is locked.");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
	}
	
	public static void stairwellChoice2HasKey() {
		copperKeyGraphics();
		
		userInterfaceSpeechLineTop();
		System.out.println(" The heavily reinforced door is opened with [Copper Key]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
		
	}
	
	public static void storageRoomMenu() {
		System.out.println("You are here: Storage\n");
		System.out.println("You enter a storage infested with rats. Between the rats and crates, you see some dry\nCrescent Moon Grass.\n");
		System.out.println("It seems like the Cresent Moon Grass is consumable.");
		System.out.println("");
		userInterfaceLine();
		System.out.println("1: Consume Crescent Moon Grass");
		System.out.println("2: Take Crescent Moon Grass");
		System.out.println("3: Go to Stairwell passage");
		userInterfaceLine();
	}
	
	public static void storageRoomChoice1() {
		moongrass1Graphics();
		
		userInterfaceSpeechLineTop();
		System.out.println(" You consume [Crescent Moon Grass] and feel better.");
		System.out.println(" [Current Health: " + playerHP + "]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	public static void storageRoomChoice1Else() {
		userInterfaceSpeechLineTop();
		System.out.println(" You cannot consume any more [Crescent Moon Grass].");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
	}
	
	public static void storageRoomChoice2() {
		moongrass1Graphics();
		
		userInterfaceSpeechLineTop();
		System.out.println(" You took some [Crescent Moon Grass] and put it in your pouch.");
		System.out.println(" Obtained: [Crescent Moon Grass]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	public static void storageRoomChoice2Else() {
		userInterfaceSpeechLineTop();
		System.out.println(" You cant take any more [Crescent Moon Grass].");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	public static void guardRoomMenu() {
		
		System.out.println("You are here: Guard Room 1\n");
		System.out.println("You enter a small Guard Room, luckily for you, there is no one there.");
		System.out.println("To your right there is a weapons rack with a Broken Sword, and to your left there is a\ncabinet with robes.");
		System.out.println("");
		userInterfaceLine();
		System.out.println("1: Take Broken Sword");
		System.out.println("2: Search cabinet");
		System.out.println("3: Go to Stairwell Passage");
		userInterfaceLine();
	}
// GUARD ROOM 1 
	
	public static void guardRoomChoice1() {
		brokenswordGraphics();
		userInterfaceSpeechLineTop();
		System.out.println(" You equip a [Broken Sword]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	public static void guardRoomChoice2() {
		robeGraphics();
		userInterfaceSpeechLineTop();
		System.out.println(" You equip a [Robe]");
		userInterfaceSpeechLineBottom();
		System.out.println("[PRESS ENTER TO CONTINUE]");
		userEnter.nextLine();
	}
	
	// GATE HOUSE 1 
	
	public static void gateHouseMenu() {
		System.out.println("You are here: Gate House 1\n");
		dregling1Graphics();
		System.out.println("You encounter a Foul Dregling\n");
		userInterfaceLine();
		System.out.println("1: Fight the Foul Dregling with " + playerWeapon);
		System.out.println("2: Run back to Stairwell Passage");
		userInterfaceLine();
	}
}


	
	
