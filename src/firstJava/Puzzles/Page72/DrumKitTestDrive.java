package firstJava.Puzzles.Page72;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = true;
        d.topHat = true;
            d.playSnare();
            d.playTopHat();

    }

    public static class DrumKit {
        boolean topHat = true;
        boolean snare = true;

        void playTopHat() {

            System.out.println("динь динь ди-динь");

        }

        void playSnare() {

            System.out.println("бах бах ба-бах");


        }
    }
}