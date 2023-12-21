class Scratch {


    public static void main(String[] args) {
        AccessLevelModifiers alm = new AccessLevelModifiers();
        //alm.aPrivateField; -> wont work
        //alm.aPrivateMethod; -> wont work
        String privateField = alm.aPublicMethod();
        System.out.println("Got private field from public method: " + privateField);
        // calls internal private method from protected method
        alm.aProtectedMethod();

        System.out.println("\n*** Scorekeeper Demo ***");
        ScoreKeeper sk = new ScoreKeeper();
        //sk.playerOneScore = 5; --> malicious code can change score. Should be private
        //sk.checkWinner() --> not great, we dont need to check unless score changes. THis also should be private
        sk.playerOneCorrectAnswer();
        sk.playerOneCorrectAnswer();
        sk.playerTwoCorrectAnswer();
        sk.playerOneCorrectAnswer();
        sk.playerTwoCorrectAnswer();
        sk.playerOneCorrectAnswer();
        sk.playerTwoCorrectAnswer();
        sk.playerOneCorrectAnswer();
    }
}

class AccessLevelModifiers {
    // Most visible to most restricted - public, protected, default, private
    public String aPublicField = "Accessible from any class";
    protected String aProtectedField = "Accessible from class in same package or child class";
    String aDefaultAccessField = "Accessible from class in same package";
    private String aPrivateField = "Accessible only from within this class";

    public String aPublicMethod() {
        System.out.println("In the public method");
        return aPrivateField;
    }

    protected void aProtectedMethod() {
        System.out.println("In the protected method");
        aPrivateMethod();
    }

    private void aPrivateMethod() {
        System.out.println("In the private method");
    }

}

class ScoreKeeper {
    private int playerOneScore = 0, playerTwoScore = 0;

    public String getScoreBoard() {
        return "Player 1: " + playerOneScore + " - Player 2: " + playerTwoScore;
    }

    public void playerOneCorrectAnswer() {
        playerOneScore++;
        System.out.println("Player 1 got one right! " + getScoreBoard());
        checkWinner();
    }

    public void playerTwoCorrectAnswer() {
        playerTwoScore++;
        System.out.println("Player 2 got one right! " + getScoreBoard());
        checkWinner();
    }

    private void checkWinner() {
        if (playerOneScore == 5) {
            System.out.println("Player 1 Wins! ");
        } else if (playerTwoScore == 5) {
            System.out.println("Player w Wins! ");
        }
    }

}