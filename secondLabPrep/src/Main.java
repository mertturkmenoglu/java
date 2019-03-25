import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // DRIVER CODE
        IdariPersonel idariPersonel = new IdariPersonel(10, "123", "ali can", new Daire(1));
        AkademikPersonel akademikPersonel = new AkademikPersonel("profesor", "456", "ahmet mehmet", new Daire(2));
        idariPersonel.kendiniTanit();
        akademikPersonel.kendiniTanit();
    }

}

