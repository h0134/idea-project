public class assignment {
    public static void main(String[] args) {
        Bank  bank        = new Bank("Bangalore", 1.2f);
        SBI   sbiBranch   = new SBI("chithradurga", 1.0f, "501");
        BOI   boiBranch   = new BOI("Delhi", 1.5f, "863");
        ICICI iciciBranch = new ICICI("Noida", 2.0f, "765");
        bank.getDetails();
        sbiBranch.getDetails();
        boiBranch.getDetails();
        iciciBranch.getDetails();
    }
}
