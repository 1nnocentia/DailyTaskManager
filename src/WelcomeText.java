class WelcomeText {
    public static void show() throws InterruptedException{
        String[] colours = {
            "\u001B[31m", //Red
            "\u001B[32m", //Green
            "\u001B[33m", //Yellow
            "\u001B[34m", //Blue
            "\u001B[35m", //Purple
            "\u001B[36m"  //Cyan
        };

        String reset = "\u001B[0m";

        for(int i = 0; i < 10; i++) {
            String colour = colours[i % colours.length];

            System.out.println(colour + "\n**************************\n" + reset);
            System.out.println("\u001B[31m \033[1m Welcome\u001B[0m to Daily Task Manager\n");
            System.out.println(colour + "**************************\n" + reset);
            
            Thread.sleep(500);
            MaybeWeNeedThis.clearScreen();
        }

    }
}
