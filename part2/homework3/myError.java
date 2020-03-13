package part2.homework3;

public class myError extends Exception{

    private String massage;

    public myError(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "msg='" + massage + '\'';
    }
}
