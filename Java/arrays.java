class Scratch {
    public static void main(String[] args) {
        String[] stringArray;
        int[] intArray;

        stringArray = new String[4];
        intArray = new int[3];

        stringArray[0] = "first dish";
        stringArray[1] = "second dish";
        stringArray[2] = "third dish";
        stringArray[3] = "fourth dish";

        intArray[0] = 5;
        intArray[1] = 3;
        intArray[2] = 8;

        System.out.println(stringArray[1] + " " + stringArray[3] + " " + intArray[0]);

        String[] names = {"Rachel", "Monica"};

        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}