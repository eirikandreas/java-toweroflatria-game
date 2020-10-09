import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Render extends Inventory{
	
	
public void userInterface() {
		System.out.println("TOWER OF LATRIA \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
		System.out.println("\u250F\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2513");
		System.out.println(" [LVL: " + Game.playerLevel + "] [HP: " + Game.playerHP + "] [ARMOR: " + Game.playerArmor + "] [WEAPON: " + Game.playerWeapon + "] [POUCH: " + Game.playerPouch + "] [KEY: " + keyList.toString() + "]");
		System.out.println(" [INVENTORY: " + weaponList.toString().replace("[", "").replace("]", "") + "]");
		
		System.out.println("\u2517\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u251B");
		System.out.println("");
	}
	

		
public static void startScreen() {
		
		int width = 90;
		int height = 24;
		
		System.out.println("\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
		System.out.println("\u2588\u2588\u2588\u2588\u2588\u2588 TOWER OF \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
		
		
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("Serif", Font.BOLD, 24));
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.drawString("Latria", 10, 20);
		
		for (int y = 0; y < height; y++) {
			StringBuilder builder = new StringBuilder();
			for (int x = 0; x < width; x++) {
				builder.append(image.getRGB(x, y) == -16777216 ? "\u2588" : " ");
				
			}
			
			System.out.println(builder);
		}
		
		
		
	}
	
	public static void rodGraphics() {
		System.out.println("                                                           \n" + 
				"                                                               *//   \n" + 
				"                                                               ,%**  \n" + 
				"                                                         /, ,**,**** \n" + 
				"                                                  *, .**,,       **  \n" + 
				"                                            ,* ,/,,*                 \n" + 
				"                                     ,, */,,,                        \n" + 
				"                              *, //*,,                               \n" + 
				"                       /, .//..*                                     \n" + 
				"            ##* /,  /(,,,                                            \n" + 
				"            &@#(,,                                                   \n" + 
				"             ##*                                                     \n" + 
				"              &            \n");
	}
	

	
	public static void copperKeyGraphics() {
		System.out.println(
				"              (%/                                                    \n" + 
				"               %&&(/*                                               \n" + 
				"             /##%&&&&&%,((,                                          \n" + 
				"              ((#(((  #%%&&(,(,                                      \n" + 
				"               (%          ##&&%(#((                                 \n" + 
				"          ##%%*%               #/&&&(,,*                             \n" + 
				"               %&                  (#%%%( ,,*                        \n" + 
				"                                        ##%&&.*.*                    \n" + 
				"                                            (##&&%**(#/(/*/  (#.*    \n" + 
				"                                                (##%&%(         ##   \n" + 
				"                                                   #%&           #%  \n" + 
				"                                                     &(           #  \n" + 
				"                                                      &          #   \n" + 
				"                                                       @#       #/   \n" + 
				"                                                         && //(#     \n");
	}
	
	public void amuletGraphics() {
		System.out.println(
				"                                                      *,                  \n" + 
				"                                                     *.                   \n" + 
				"                                                    /.                    \n" + 
				"                                                   #.                     \n" + 
				"                                                  (.                      \n" + 
				"                                                 *.                       \n" + 
				"                                                ,(                      //\n" + 
				"                                               ,/                  ./*,,  \n" + 
				"                                              ./               .*%,       \n" + 
				"                                              % *,      , ./#..           \n" + 
				"                                             ***.#*(.#*,.                 \n" + 
				"                                   /,,**.*,#*,/,.                         \n" + 
				"                                 **(,/*.., .,,(,                          \n" + 
				"                                ,/*,,**,,,,.*,,*/                         \n" + 
				"                                ,,,/.,*,/// ./*(*                         \n" + 
				"                                 ,*#**..*,//.*//                          \n" + 
				"                                   .. */#(,** .   \n");
	}
	
	public static void brokenswordGraphics() {
		System.out.println(
				"                                                                    ,.\n" + 
				"                                                                 ,.   \n" + 
				"                                                            ,/(,*     \n" + 
				"                                                        ../,*.        \n" + 
				"                                                     ,  */..          \n" + 
				"                                                   . *.,..            \n" + 
				"                                                ,  ,/,.               \n" + 
				"                                              * ,.*.,                 \n" + 
				"                                   (          ,.,..                   \n" + 
				"                                   (     . ,,(..                      \n" + 
				"                                    /* * /,,.*                        \n" + 
				"                                     #*,**.                           \n" + 
				"                                   #*,//*                             \n" + 
				"                                 (*((    (*                           \n" + 
				"                              /((//        ((((                       \n" + 
				"                            #/*#                                      \n" + 
				"                          #**(                                        \n" + 
				"                       /#*(                                           \n" + 
				"                     /#*/                  \n");
	}
	
	public static void moongrass1Graphics() {
		System.out.println("                                *         *        ,   *,      \n" + 
				"                               .**     .**//(***//(##(##(, .    \n" + 
				"                      */*     **//***/**((/(/(/* /*,***         \n" + 
				"                  **//////***/((*#///,      /(((,//*            \n" + 
				"               *((/(/(/(((,//*//////***     //,//(/*/,           \n" + 
				"            //(((#(,(/*/(*/(*       ((    /**/*                  \n" + 
				"         *//((/(((/(/(///(*/       /(((/,**,                    \n" + 
				"                     /        /   ,((/(/(/*(*//                  \n" + 
				"                            //(///(,*/                          \n" + 
				"                        ( ,//(((*/((/                           \n" + 
				"                        (/((##(((((////                         \n" + 
				"                      /((((#(((((((                             \n" + 
				"                      ((#(((((((,                               \n" + 
				"                     /(((/*,.                                   \n" + 
				"                      ...                  \n");
	}
	
	public static void stranger1Graphics() {
		System.out.println(
				"                                                                               \n" + 
				"                                                   *&&&&&.                     \n" + 
				"                                                 (&&&&&&&&,                    \n" + 
				"                                                *&@@,/@&&&@                    \n" + 
				"                                                %&@****&&&@                    \n" + 
				"                                               &&&@%***&&&&&&                  \n" + 
				"                                              ,&&&@@@@&&&&&&&                  \n" + 
				"                                          &   ,&&&&@@@&&&&&&&   #              \n" + 
				"                                         ,&   ,&&&&@@&&&&&&&&   #(             \n" + 
				"                                         %&   ,&&&&&&&&&&&&&&   #@             \n" + 
				"                                        %&&   ,&&&&&&&&&&&&&&   #@             \n" + 
				"                                       @&&&   ,&&&&&&&&&&&&&&   #@             \n" + 
				"                                     (&&&&&   ,&&&&&&&&&&&&&&   #&             \n" + 
				"                                     @&&&&&   ,&&&&&&&&&&&&&&   #&@            \n" + 
				"                                     *&&&&&   ,&&&&&&&&&&&&&&   #&&          \n" + 
				"                               &&,   .&&&&&   ,&&&&&&&&&&&&&&   #&&            \n" + 
				"                             &&&&&&%  %&&&&   ,&. .,@&&&&&&&&   #&&            \n" + 
				"                         ,   &&&&&&&&&&&&&&   ,&&&&&&(&&&&&     #&&&,          \n" + 
				"                       *&,   &&&&&&&&&&&&&&   ,&&&&&&&&&&&&&&   #&***        \n" + "  ");
	}
	
	public static void dregling1Graphics() {
		System.out.println(
				"                                                          *&      *%   ((            \n" + 
				"                                                          #/     #&&.,&@#            \n" + 
				"                                                           &.      &&&&@@/            \n" + 
				"                                                          &       %&&@&@*            \n" + 
				"                                                         ,&      (#&%&&@%.           \n" + 
				"                                                         *%       %##%&&/            \n" + 
				"                                                        %*         &(/*(*(*       \n" + 
				"                                                        %*      &%%*&&(*(%(*%%      \n" + 
				"                                                        &      ./%%((#/(/%%%%#*     \n" + 
				"                                                       ,&      *%&&&%%%%#&#@(     \n" + 
				"                                                       /%      %&&&&&&&%&&&&%%%     \n" + 
				"                                                       &*     ,&@&@ ,&%&(%&@&     \n" + 
				"                                                     ,(%#   ,,/&&%  /%%@@&%#&@@(    \n" + 
				"                                                     *(&/#%%%#%&%   (@&&&&%(%&@     \n" + 
				"                                                     /(%%@&&&%&/   (%&@&%%%%#&%     \n" + 
				"                                                      ##           %#%%%%&%&&&%(    \n" + 
				"                                                      %/          /#%%%%%%&&&&&&%   \n" + 
				"                                                      %          (%#%#%%%%&&&&&&@   " + " ");
	}

	public static void robeGraphics() {
		System.out.println(
				"                                 %%&        \n" +
				"                                %&  @,       \n" +
				"                               ,&   @&(      \n" +
				"                              &%%@@&%%%     \n" +
				"                             %&%&@@%%%&%    \n" +
				"                             &@%&@@%%%&%%   \n" +
				"                            %&&&&@@&%%&&%   \n" +
				"                           %&& %&@@%%% &&%%  \n" +
				"                        %&&&  &&&&@&&%  &&&%(  \n" +
				"                              @&&&@&&&      \n" +
				"                               &&&&&%%      \n" +
				"                               &&@&&&&      \n" +
				"                               &%@&&&&      \n" +
				"                               &&@@&&&      \n" +
				"                               && @%&&      \n" +
				"                               &          ");
	}
	
	public static void userInterfaceLine() {
		System.out.println("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
	}
	
	public static void userInterfaceSpeechLineTop() {
		System.out.println("\u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2557\n");
		
	}
	
	public static void userInterfaceSpeechLineBottom() {
		System.out.println("\n\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u255D");
		
	}
	
	


}


