import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {

    static ArrayList <Item> closet = new ArrayList <Item>();
    static ArrayList <Item> Player = new ArrayList <Item>();
    static ArrayList <Item> Player2 = new ArrayList <Item>();
    private static final long serialVersionUID = 1L;
    static JFrame frame = new JFrame();
    static String backdrop = "";
    static boolean dress = true;

    public static void main(String[] args) {
        
        fillcloset();
        pickBackdrop();

        while(dress){

            getDressed();

            if(dress){

                getDressed2();
            }
        }

        startShow();
    
    }

    public static void startShow(){

        display();
        display2();
    }

    public static void pickBackdrop(){

        System.out.println("Where is the show?");
        System.out.println("Venue [1], Venue [2], Venue [3]");
        Scanner userInput = new Scanner(System.in);
        int enter = userInput.nextInt();

        if(enter == 1){

            backdrop = "Airport.PNG";
        }else if(enter == 2){

            backdrop = "Red Carpet.PNG";
        }else{

            backdrop = "Runway.PNG";
        }
        
    }

    public static void display(){

        JFrame frame = new JFrame();
        ImageIcon hat = new ImageIcon(Player.get(0).getFileName());
        JLabel hatlabel = new JLabel(hat);
        frame.add(hatlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        ImageIcon face = new ImageIcon(Player.get(1).getFileName());
        JLabel facelabel = new JLabel(face);
        frame.add(facelabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon head = new ImageIcon("Face.PNG");
        JLabel headlabel = new JLabel(head);
        frame.add(headlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon neck = new ImageIcon(Player.get(2).getFileName());
        JLabel necklabel = new JLabel(neck);
        frame.add(necklabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon shirt = new ImageIcon(Player.get(3).getFileName());
        JLabel shirtlabel = new JLabel(shirt);
        frame.add(shirtlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon pants = new ImageIcon(Player.get(4).getFileName());
        JLabel pantslabel = new JLabel(pants);
        frame.add(pantslabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon shoes = new ImageIcon(Player.get(5).getFileName());
        JLabel shoeslabel = new JLabel(shoes);
        frame.add(shoeslabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon background = new ImageIcon(backdrop);
        JLabel backgroundlabel = new JLabel(background);
        frame.add(backgroundlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void getDressed(){

        //preset
        presets();
        pickHat();
        pickFace();
        pickNeck();
        pickShirt();
        pickPantalones();
        pickShoes();
        printPlayer();
    }

    public static void presets(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Preset Number, if none press 0");
        int enter = userInput.nextInt();

        if(enter == 0){

            System.out.println("No preset given");
            System.out.println("");
            System.out.println("---------------------");
        }else if(enter == 1){

            System.out.println("Inputing Ella's Preset");
            Player.add(new Item(closet.get(0).getName(), closet.get(0).getType(), closet.get(0).getValue(), closet.get(0).getFileName()));
            Player.add(new Item(closet.get(7).getName(), closet.get(7).getType(), closet.get(7).getValue(), closet.get(7).getFileName()));
            Player.add(new Item(closet.get(9).getName(), closet.get(9).getType(), closet.get(9).getValue(), closet.get(9).getFileName()));
            Player.add(new Item(closet.get(14).getName(), closet.get(14).getType(), closet.get(14).getValue(), closet.get(14).getFileName()));
            Player.add(new Item(closet.get(19).getName(), closet.get(19).getType(), closet.get(19).getValue(), closet.get(19).getFileName()));
            Player.add(new Item(closet.get(22).getName(), closet.get(22).getType(), closet.get(22).getValue(), closet.get(22).getFileName()));

            display();
        }else if(enter == 2){

            System.out.println("Inputing Best Dressed Preset 1");
            Player.add(new Item(closet.get(27).getName(), closet.get(27).getType(), closet.get(27).getValue(), closet.get(27).getFileName()));
            Player.add(new Item(closet.get(24).getName(), closet.get(24).getType(), closet.get(24).getValue(), closet.get(24).getFileName()));
            Player.add(new Item(closet.get(32).getName(), closet.get(32).getType(), closet.get(32).getValue(), closet.get(32).getFileName()));
            Player.add(new Item(closet.get(12).getName(), closet.get(12).getType(), closet.get(12).getValue(), closet.get(12).getFileName()));
            Player.add(new Item(closet.get(16).getName(), closet.get(16).getType(), closet.get(16).getValue(), closet.get(16).getFileName()));
            Player.add(new Item(closet.get(23).getName(), closet.get(23).getType(), closet.get(23).getValue(), closet.get(23).getFileName()));

            display();
        }else if(enter == 3){

            System.out.println("Inputing Best Dressed Preset 2");
            Player.add(new Item(closet.get(28).getName(), closet.get(28).getType(), closet.get(28).getValue(), closet.get(28).getFileName()));
            Player.add(new Item(closet.get(5).getName(), closet.get(5).getType(), closet.get(5).getValue(), closet.get(5).getFileName()));
            Player.add(new Item(closet.get(10).getName(), closet.get(10).getType(), closet.get(10).getValue(), closet.get(10).getFileName()));
            Player.add(new Item(closet.get(13).getName(), closet.get(13).getType(), closet.get(13).getValue(), closet.get(13).getFileName()));
            Player.add(new Item(closet.get(19).getName(), closet.get(19).getType(), closet.get(19).getValue(), closet.get(19).getFileName()));
            Player.add(new Item(closet.get(23).getName(), closet.get(23).getType(), closet.get(23).getValue(), closet.get(23).getFileName()));

            display();
        }
        
    }

    public static void printPlayer(){

        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Player 1 is wearing:");
        System.out.println("");

        for(int i = 0; i < Player.size(); i++){

            System.out.println(Player.get(i).getName());
        }

        System.out.println("");
    }

    public static void printcloset(){

        for(int i = 0; i < closet.size(); i++){

            System.out.println(closet.get(i).getValue() + " " + closet.get(i).getName() + ", Type: " + closet.get(i).getType());
        }

        System.out.println("");
    }

    public static void fillcloset(){

        closet.add(new Item("HillBilly Cowboy Hat", "Hat", 0, "Cowboy Hat.PNG"));
        closet.add(new Item("Hair", "Hat", 1, "Hair.PNG"));
        closet.add(new Item("Shrek", "Hat", 2, "Shrrek.PNG"));
        closet.add(new Item("French", "Hat", 3, "French.PNG"));
        closet.add(new Item("Joe Cool Sunglasses", "Face", 4, "Joe Cool.PNG"));
        closet.add(new Item("Most Expensive Sunglasses", "Face", 5, "Expensive Glasses.PNG"));
        closet.add(new Item("Mustache", "Face", 6, "Mustache.PNG"));
        closet.add(new Item("Makeup", "Face", 7, "YouMakeup.PNG"));
        closet.add(new Item("Bling", "Neck", 8, "Chain.PNG"));
        closet.add(new Item("Ruff", "Neck", 9, "Ruff.PNG"));
        closet.add(new Item("Tie", "Neck", 10, "Tie.PNG"));
        closet.add(new Item("Big Scarf", "Neck", 11, "Scarf.PNG"));
        closet.add(new Item("Ball Gown", "Shirt", 12, "Dress.PNG"));
        closet.add(new Item("Generic White T-Shirt", "Shirt", 13, "Generic White.PNG"));
        closet.add(new Item("Prison Stripes", "Shirt", 14, "Prison.PNG"));
        closet.add(new Item("Suit", "Shirt", 15, "Suit.PNG"));
        closet.add(new Item("Fishnets", "Pantalones", 16, "Fishnets.PNG"));
        closet.add(new Item("Saggy Jeans", "Pantalones", 17, "Jeans.PNG"));
        closet.add(new Item("Pajamas", "Pantalones", 18, "Pajamas.PNG"));
        closet.add(new Item("Fancy Pants", "Pantalones", 19, "Fancy Pants.PNG"));
        closet.add(new Item("Heels", "Shoes", 20, "Heels.PNG"));
        closet.add(new Item("Bunny Slippers", "Shoes", 21, "Bunny Slippers.PNG"));
        closet.add(new Item("Feet", "Shoes", 22, "Feet.PNG"));
        closet.add(new Item("Cowboy Boots", "Shoes", 23, "Cowboy Boots.PNG"));
        closet.add(new Item("Denise", "Makeup", 24, "Simplistic.PNG"));
        closet.add(new Item("Aaron", "Makeup", 25, "Anime.PNG"));
        closet.add(new Item("Lola", "Makeup", 26, "Realism.PNG"));
        closet.add(new Item("Hair with Bow", "Hair", 27, "Sally.PNG"));
        closet.add(new Item("Slicked Back", "Hair", 28, "Elvis.PNG"));
        closet.add(new Item("Tiara", "Hat", 29, "Tiara.PNG"));
        closet.add(new Item("Headphones", "Neck", 30, "Headphones.PNG"));
        closet.add(new Item("Painting", "Neck", 31, "Mona.PNG"));
        closet.add(new Item("Nothing", "Neck", 32, "Nothing.PNG"));
        closet.add(new Item("High Tops", "Shoes", 33, "Jordans.PNG"));
        closet.add(new Item("Old English", "Shoes", 34, "Janes.PNG"));
        closet.add(new Item("Skirt", "Pantalones", 35, "Skirt.PNG"));
        closet.add(new Item("Cargos", "Pantalones", 36, "Cargos.PNG"));
        closet.add(new Item("Maternity", "Shirt", 37, "Maternity.PNG"));
        closet.add(new Item("T-shirt with Words", "Shirt", 38, "TshirtWords.PNG"));
        closet.add(new Item("Sparkley Heels", "Shoes", 39, "SparkelyHeels.PNG"));
    }

    public static void pickHat(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a HAT.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Hat")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player.add(new Item(closet.get(0).getName(), closet.get(0).getType(), closet.get(0).getValue(), closet.get(0).getFileName()));
        }else if (enter == 2){

            System.out.println("Which hair style will you choose?");
            System.out.println("1. Colorful");
            System.out.println("2. I NEED A BOW");
            System.out.println("3. Greaser");
            
            int enter2 = userInput.nextInt();
            if(enter2 == 1){

                Player.add(new Item(closet.get(1).getName(), closet.get(1).getType(), closet.get(1).getValue(), closet.get(1).getFileName()));
            }else if (enter2 == 2){

                Player.add(new Item(closet.get(27).getName(), closet.get(27).getType(), closet.get(27).getValue(), closet.get(27).getFileName()));
            }else{

                Player.add(new Item(closet.get(28).getName(), closet.get(28).getType(), closet.get(28).getValue(), closet.get(28).getFileName()));
            }
            
        }else if (enter == 3){

            Player.add(new Item(closet.get(2).getName(), closet.get(2).getType(), closet.get(2).getValue(), closet.get(2).getFileName()));
        }else if (enter == 4){

            Player.add(new Item(closet.get(3).getName(), closet.get(3).getType(), closet.get(3).getValue(), closet.get(3).getFileName()));
        }else{

            Player.add(new Item(closet.get(29).getName(), closet.get(29).getType(), closet.get(29).getValue(), closet.get(29).getFileName()));
        }

        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickFace(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a FACE ACCESSORY.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Face")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player.add(new Item(closet.get(4).getName(), closet.get(4).getType(), closet.get(4).getValue(), closet.get(4).getFileName()));
        }else if (enter == 2){

            Player.add(new Item(closet.get(5).getName(), closet.get(5).getType(), closet.get(5).getValue(), closet.get(5).getFileName()));
        }else if (enter == 3){

            Player.add(new Item(closet.get(6).getName(), closet.get(6).getType(), closet.get(6).getValue(), closet.get(6).getFileName()));
        }else{

            System.out.println("");
            System.out.println("Who will be your make-up artist? [1, 2, 3, 4]");
            System.out.println("");
            System.out.println("First is " + closet.get(24).getName() + ", a makeup artist who will make you stunningly bland. However, She does get the job done.");
            System.out.println("Your second choice is " + closet.get(25).getName() + ", a specialist in eye enlargement...and eyebrow englargement...yea he enlarges everything.");
            System.out.println("Your third choice is " + closet.get(26).getName() + ", she makes stunningly realistic work, sure to wow the crowds.");
            System.out.println("Of course, you could always just do it yourself, but how good are you at makeup?");

            int enter2 = userInput.nextInt();
            if(enter2 == 1){

                Player.add(new Item(closet.get(24).getName(), closet.get(24).getType(), closet.get(24).getValue(), closet.get(24).getFileName()));
            }else if (enter2 == 2){

                Player.add(new Item(closet.get(25).getName(), closet.get(25).getType(), closet.get(25).getValue(), closet.get(25).getFileName()));
            }else if (enter2 == 3){

                Player.add(new Item(closet.get(26).getName(), closet.get(26).getType(), closet.get(26).getValue(), closet.get(26).getFileName()));
            }else{

                Player.add(new Item(closet.get(7).getName(), closet.get(7).getType(), closet.get(7).getValue(), closet.get(7).getFileName()));
            }
        }

        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickNeck(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a NECK ACCESSORY.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Neck")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player.add(new Item(closet.get(8).getName(), closet.get(8).getType(), closet.get(8).getValue(), closet.get(8).getFileName()));
        }else if (enter == 2){

            Player.add(new Item(closet.get(9).getName(), closet.get(9).getType(), closet.get(9).getValue(), closet.get(9).getFileName()));
        }else if (enter == 3){

            Player.add(new Item(closet.get(10).getName(), closet.get(10).getType(), closet.get(10).getValue(), closet.get(10).getFileName()));
        }else if (enter == 4){

            Player.add(new Item(closet.get(11).getName(), closet.get(11).getType(), closet.get(11).getValue(), closet.get(11).getFileName()));
        }else if (enter == 5){

            Player.add(new Item(closet.get(30).getName(), closet.get(30).getType(), closet.get(30).getValue(), closet.get(30).getFileName()));
        }else if (enter == 6){

            Player.add(new Item(closet.get(31).getName(), closet.get(31).getType(), closet.get(31).getValue(), closet.get(31).getFileName()));
        }else{

            Player.add(new Item(closet.get(32).getName(), closet.get(32).getType(), closet.get(32).getValue(), closet.get(32).getFileName()));
        }


        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickShirt(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a SHIRT.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Shirt")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player.add(new Item(closet.get(12).getName(), closet.get(12).getType(), closet.get(12).getValue(), closet.get(12).getFileName()));
        }else if (enter == 2){

            Player.add(new Item(closet.get(13).getName(), closet.get(13).getType(), closet.get(13).getValue(), closet.get(13).getFileName()));
        }else if (enter == 3){

            Player.add(new Item(closet.get(14).getName(), closet.get(14).getType(), closet.get(14).getValue(), closet.get(14).getFileName()));
        }else if (enter == 4){

            Player.add(new Item(closet.get(15).getName(), closet.get(15).getType(), closet.get(15).getValue(), closet.get(15).getFileName()));
        }else if (enter == 5){

            Player.add(new Item(closet.get(37).getName(), closet.get(37).getType(), closet.get(37).getValue(), closet.get(37).getFileName()));
        }else{

            Player.add(new Item(closet.get(38).getName(), closet.get(38).getType(), closet.get(38).getValue(), closet.get(38).getFileName()));
        }
        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickPantalones(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick PANTALONES.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Pantalones")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player.add(new Item(closet.get(16).getName(), closet.get(16).getType(), closet.get(16).getValue(), closet.get(16).getFileName()));
        }else if (enter == 2){

            Player.add(new Item(closet.get(17).getName(), closet.get(17).getType(), closet.get(17).getValue(), closet.get(17).getFileName()));
        }else if (enter == 3){

            Player.add(new Item(closet.get(18).getName(), closet.get(18).getType(), closet.get(18).getValue(), closet.get(18).getFileName()));
        }else if (enter == 4){

            Player.add(new Item(closet.get(19).getName(), closet.get(19).getType(), closet.get(19).getValue(), closet.get(19).getFileName()));
        }else if (enter == 5){

            Player.add(new Item(closet.get(35).getName(), closet.get(35).getType(), closet.get(35).getValue(), closet.get(35).getFileName()));
        }else{

            Player.add(new Item(closet.get(36).getName(), closet.get(36).getType(), closet.get(36).getValue(), closet.get(36).getFileName()));
        }

        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickShoes(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a SHOES.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Shoes")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player.add(new Item(closet.get(20).getName(), closet.get(20).getType(), closet.get(20).getValue(), closet.get(20).getFileName()));
        }else if (enter == 2){

            Player.add(new Item(closet.get(21).getName(), closet.get(21).getType(), closet.get(21).getValue(), closet.get(21).getFileName()));
        }else if (enter == 3){

            Player.add(new Item(closet.get(22).getName(), closet.get(22).getType(), closet.get(22).getValue(), closet.get(22).getFileName()));
        }else if (enter == 4){

            Player.add(new Item(closet.get(23).getName(), closet.get(23).getType(), closet.get(23).getValue(), closet.get(23).getFileName()));
        }else if (enter == 5){

            Player.add(new Item(closet.get(33).getName(), closet.get(33).getType(), closet.get(33).getValue(), closet.get(33).getFileName()));
        }else if (enter == 6){

            Player.add(new Item(closet.get(34).getName(), closet.get(34).getType(), closet.get(34).getValue(), closet.get(34).getFileName()));
        }else{

            Player.add(new Item(closet.get(39).getName(), closet.get(39).getType(), closet.get(39).getValue(), closet.get(39).getFileName()));
        }

        System.out.println("");
        System.out.println("---------------------");

        
    }

    //

    public static void display2(){

        JFrame frame = new JFrame();
        ImageIcon hat = new ImageIcon(Player2.get(0).getFileName());
        JLabel hatlabel = new JLabel(hat);
        frame.add(hatlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        ImageIcon face = new ImageIcon(Player2.get(1).getFileName());
        JLabel facelabel = new JLabel(face);
        frame.add(facelabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon head = new ImageIcon("Face.PNG");
        JLabel headlabel = new JLabel(head);
        frame.add(headlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon neck = new ImageIcon(Player2.get(2).getFileName());
        JLabel necklabel = new JLabel(neck);
        frame.add(necklabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon shirt = new ImageIcon(Player2.get(3).getFileName());
        JLabel shirtlabel = new JLabel(shirt);
        frame.add(shirtlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon pants = new ImageIcon(Player2.get(4).getFileName());
        JLabel pantslabel = new JLabel(pants);
        frame.add(pantslabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon shoes = new ImageIcon(Player2.get(5).getFileName());
        JLabel shoeslabel = new JLabel(shoes);
        frame.add(shoeslabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ImageIcon background = new ImageIcon(backdrop);
        JLabel backgroundlabel = new JLabel(background);
        frame.add(backgroundlabel);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void getDressed2(){

        //preset
        presets2();
        pickHat2();
        pickFace2();
        pickNeck2();
        pickShirt2();
        pickPantalones2();
        pickShoes2();
        printPlayer2();
    }

    public static void presets2(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Player 2");
        System.out.println("Enter Preset Number, if none press 0");
        int enter = userInput.nextInt();

        if(enter == 0){

            System.out.println("No preset given");
            System.out.println("");
            System.out.println("---------------------");
        }else if(enter == 1){

            System.out.println("Inputing Ella's Preset");
            Player2.add(new Item(closet.get(0).getName(), closet.get(0).getType(), closet.get(0).getValue(), closet.get(0).getFileName()));
            Player2.add(new Item(closet.get(7).getName(), closet.get(7).getType(), closet.get(7).getValue(), closet.get(7).getFileName()));
            Player2.add(new Item(closet.get(9).getName(), closet.get(9).getType(), closet.get(9).getValue(), closet.get(9).getFileName()));
            Player2.add(new Item(closet.get(14).getName(), closet.get(14).getType(), closet.get(14).getValue(), closet.get(14).getFileName()));
            Player2.add(new Item(closet.get(19).getName(), closet.get(19).getType(), closet.get(19).getValue(), closet.get(19).getFileName()));
            Player2.add(new Item(closet.get(22).getName(), closet.get(22).getType(), closet.get(22).getValue(), closet.get(22).getFileName()));

            display();
        }else if(enter == 2){

            System.out.println("Inputing Best Dressed Preset 1");
            Player2.add(new Item(closet.get(27).getName(), closet.get(27).getType(), closet.get(27).getValue(), closet.get(27).getFileName()));
            Player2.add(new Item(closet.get(24).getName(), closet.get(24).getType(), closet.get(24).getValue(), closet.get(24).getFileName()));
            Player2.add(new Item(closet.get(32).getName(), closet.get(32).getType(), closet.get(32).getValue(), closet.get(32).getFileName()));
            Player2.add(new Item(closet.get(12).getName(), closet.get(12).getType(), closet.get(12).getValue(), closet.get(12).getFileName()));
            Player2.add(new Item(closet.get(16).getName(), closet.get(16).getType(), closet.get(16).getValue(), closet.get(16).getFileName()));
            Player2.add(new Item(closet.get(23).getName(), closet.get(23).getType(), closet.get(23).getValue(), closet.get(23).getFileName()));

            display();
        }else if(enter == 3){

            System.out.println("Inputing Best Dressed Preset 2");
            Player2.add(new Item(closet.get(28).getName(), closet.get(28).getType(), closet.get(28).getValue(), closet.get(28).getFileName()));
            Player2.add(new Item(closet.get(5).getName(), closet.get(5).getType(), closet.get(5).getValue(), closet.get(5).getFileName()));
            Player2.add(new Item(closet.get(10).getName(), closet.get(10).getType(), closet.get(10).getValue(), closet.get(10).getFileName()));
            Player2.add(new Item(closet.get(13).getName(), closet.get(13).getType(), closet.get(13).getValue(), closet.get(13).getFileName()));
            Player2.add(new Item(closet.get(19).getName(), closet.get(19).getType(), closet.get(19).getValue(), closet.get(19).getFileName()));
            Player2.add(new Item(closet.get(23).getName(), closet.get(23).getType(), closet.get(23).getValue(), closet.get(23).getFileName()));

            display();
        }
        
    }

    public static void printPlayer2(){

        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Player 2 is wearing:");
        System.out.println("");

        for(int i = 0; i < Player2.size(); i++){

            System.out.println(Player2.get(i).getName());
        }

        System.out.println("");
    }

    public static void pickHat2(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a HAT.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Hat")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player2.add(new Item(closet.get(0).getName(), closet.get(0).getType(), closet.get(0).getValue(), closet.get(0).getFileName()));
        }else if (enter == 2){

            System.out.println("Which hair style will you choose?");
            System.out.println("1. Colorful");
            System.out.println("2. I NEED A BOW");
            System.out.println("3. Greaser");
            
            int enter2 = userInput.nextInt();
            if(enter2 == 1){

                Player2.add(new Item(closet.get(1).getName(), closet.get(1).getType(), closet.get(1).getValue(), closet.get(1).getFileName()));
            }else if (enter2 == 2){

                Player2.add(new Item(closet.get(27).getName(), closet.get(27).getType(), closet.get(27).getValue(), closet.get(27).getFileName()));
            }else{

                Player2.add(new Item(closet.get(28).getName(), closet.get(28).getType(), closet.get(28).getValue(), closet.get(28).getFileName()));
            }
            
        }else if (enter == 3){

            Player2.add(new Item(closet.get(2).getName(), closet.get(2).getType(), closet.get(2).getValue(), closet.get(2).getFileName()));
        }else if (enter == 4){

            Player2.add(new Item(closet.get(3).getName(), closet.get(3).getType(), closet.get(3).getValue(), closet.get(3).getFileName()));
        }else{

            Player2.add(new Item(closet.get(29).getName(), closet.get(29).getType(), closet.get(29).getValue(), closet.get(29).getFileName()));
        }

        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickFace2(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a FACE ACCESSORY.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Face")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player2.add(new Item(closet.get(4).getName(), closet.get(4).getType(), closet.get(4).getValue(), closet.get(4).getFileName()));
        }else if (enter == 2){

            Player2.add(new Item(closet.get(5).getName(), closet.get(5).getType(), closet.get(5).getValue(), closet.get(5).getFileName()));
        }else if (enter == 3){

            Player2.add(new Item(closet.get(6).getName(), closet.get(6).getType(), closet.get(6).getValue(), closet.get(6).getFileName()));
        }else{

            System.out.println("");
            System.out.println("Who will be your make-up artist? [1, 2, 3, 4]");
            System.out.println("");
            System.out.println("First is " + closet.get(24).getName() + ", a makeup artist who will make you stunningly bland. However, She does get the job done.");
            System.out.println("Your second choice is " + closet.get(25).getName() + ", a specialist in eye enlargement...and eyebrow englargement...yea he enlarges everything.");
            System.out.println("Your third choice is " + closet.get(26).getName() + ", she makes stunningly realistic work, sure to wow the crowds.");
            System.out.println("Of course, you could always just do it yourself, but how good are you at makeup?");

            int enter2 = userInput.nextInt();
            if(enter2 == 1){

                Player2.add(new Item(closet.get(24).getName(), closet.get(24).getType(), closet.get(24).getValue(), closet.get(24).getFileName()));
            }else if (enter2 == 2){

                Player2.add(new Item(closet.get(25).getName(), closet.get(25).getType(), closet.get(25).getValue(), closet.get(25).getFileName()));
            }else if (enter2 == 3){

                Player2.add(new Item(closet.get(26).getName(), closet.get(26).getType(), closet.get(26).getValue(), closet.get(26).getFileName()));
            }else{

                Player2.add(new Item(closet.get(7).getName(), closet.get(7).getType(), closet.get(7).getValue(), closet.get(7).getFileName()));
            }
        }

        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickNeck2(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a NECK ACCESSORY.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Neck")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player2.add(new Item(closet.get(8).getName(), closet.get(8).getType(), closet.get(8).getValue(), closet.get(8).getFileName()));
        }else if (enter == 2){

            Player2.add(new Item(closet.get(9).getName(), closet.get(9).getType(), closet.get(9).getValue(), closet.get(9).getFileName()));
        }else if (enter == 3){

            Player2.add(new Item(closet.get(10).getName(), closet.get(10).getType(), closet.get(10).getValue(), closet.get(10).getFileName()));
        }else if (enter == 4){

            Player2.add(new Item(closet.get(11).getName(), closet.get(11).getType(), closet.get(11).getValue(), closet.get(11).getFileName()));
        }else if (enter == 5){

            Player2.add(new Item(closet.get(30).getName(), closet.get(30).getType(), closet.get(30).getValue(), closet.get(30).getFileName()));
        }else if (enter == 6){

            Player2.add(new Item(closet.get(31).getName(), closet.get(31).getType(), closet.get(31).getValue(), closet.get(31).getFileName()));
        }else{

            Player2.add(new Item(closet.get(32).getName(), closet.get(32).getType(), closet.get(32).getValue(), closet.get(32).getFileName()));
        }


        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickShirt2(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a SHIRT.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Shirt")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player2.add(new Item(closet.get(12).getName(), closet.get(12).getType(), closet.get(12).getValue(), closet.get(12).getFileName()));
        }else if (enter == 2){

            Player2.add(new Item(closet.get(13).getName(), closet.get(13).getType(), closet.get(13).getValue(), closet.get(13).getFileName()));
        }else if (enter == 3){

            Player2.add(new Item(closet.get(14).getName(), closet.get(14).getType(), closet.get(14).getValue(), closet.get(14).getFileName()));
        }else if (enter == 4){

            Player2.add(new Item(closet.get(15).getName(), closet.get(15).getType(), closet.get(15).getValue(), closet.get(15).getFileName()));
        }else if (enter == 5){

            Player2.add(new Item(closet.get(37).getName(), closet.get(37).getType(), closet.get(37).getValue(), closet.get(37).getFileName()));
        }else{

            Player2.add(new Item(closet.get(38).getName(), closet.get(38).getType(), closet.get(38).getValue(), closet.get(38).getFileName()));
        }
        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickPantalones2(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick PANTALONES.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Pantalones")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player2.add(new Item(closet.get(16).getName(), closet.get(16).getType(), closet.get(16).getValue(), closet.get(16).getFileName()));
        }else if (enter == 2){

            Player2.add(new Item(closet.get(17).getName(), closet.get(17).getType(), closet.get(17).getValue(), closet.get(17).getFileName()));
        }else if (enter == 3){

            Player2.add(new Item(closet.get(18).getName(), closet.get(18).getType(), closet.get(18).getValue(), closet.get(18).getFileName()));
        }else if (enter == 4){

            Player2.add(new Item(closet.get(19).getName(), closet.get(19).getType(), closet.get(19).getValue(), closet.get(19).getFileName()));
        }else if (enter == 5){

            Player2.add(new Item(closet.get(35).getName(), closet.get(35).getType(), closet.get(35).getValue(), closet.get(35).getFileName()));
        }else{

            Player2.add(new Item(closet.get(36).getName(), closet.get(36).getType(), closet.get(36).getValue(), closet.get(36).getFileName()));
        }

        System.out.println("");
        System.out.println("---------------------");
    }

    public static void pickShoes2(){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a SHOES.");
        int num = 1;

        for(int i = 0; i < closet.size(); i++){

            if(closet.get(i).getType().equals("Shoes")){

                System.out.println(num + ". " + closet.get(i).getName());
                num++;
            }
        
        }

        System.out.println("");

        System.out.println("Pick Number");
        int enter = userInput.nextInt();

        if(enter == 1){

            Player2.add(new Item(closet.get(20).getName(), closet.get(20).getType(), closet.get(20).getValue(), closet.get(20).getFileName()));
        }else if (enter == 2){

            Player2.add(new Item(closet.get(21).getName(), closet.get(21).getType(), closet.get(21).getValue(), closet.get(21).getFileName()));
        }else if (enter == 3){

            Player2.add(new Item(closet.get(22).getName(), closet.get(22).getType(), closet.get(22).getValue(), closet.get(22).getFileName()));
        }else if (enter == 4){

            Player2.add(new Item(closet.get(23).getName(), closet.get(23).getType(), closet.get(23).getValue(), closet.get(23).getFileName()));
        }else if (enter == 5){

            Player2.add(new Item(closet.get(33).getName(), closet.get(33).getType(), closet.get(33).getValue(), closet.get(33).getFileName()));
        }else if (enter == 6){

            Player2.add(new Item(closet.get(34).getName(), closet.get(34).getType(), closet.get(34).getValue(), closet.get(34).getFileName()));
        }else{

            Player2.add(new Item(closet.get(39).getName(), closet.get(39).getType(), closet.get(39).getValue(), closet.get(39).getFileName()));
        }

        System.out.println("");
        System.out.println("---------------------");

        dress = false;
    }
}
