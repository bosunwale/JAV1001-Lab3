public class Main {
    public static void main(String[] args) {
        Dice sixSidesDice = new Dice();
        Dice tenSidesDice = new Dice(10);
        Dice twentySidesDice = new Dice(20, "d20");

        //Rolling six sides dice
        System.out.println(sixSidesDice);
        System.out.print("[");
        for(int i = 0; i <= 6; i++){
            System.out.print(sixSidesDice.RollDice() + ", ");
        }
        System.out.println("]");
        //Rolling ten sides dice
        System.out.println(tenSidesDice);
        System.out.print("[ ");
        for(int i = 0; i <= 10; i++){
            System.out.print(tenSidesDice.RollDice() + ", ");
        }
        System.out.println("]");
        //Rolling twenty sides dice
        System.out.println(twentySidesDice);
        System.out.print("[ ");
        for(int i = 0; i <= 20; i++){
            System.out.print(twentySidesDice.RollDice() + ", ");
        }
        System.out.println("]");
    }
}
