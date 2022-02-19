package firstQuestion;

public class StairAlgorithm {

    public StairAlgorithm() {

    }

    public void buildStair (Integer n){
        if (n >= 1 ){
            char[] emptyLine = new char[n];
            for (int i = emptyLine.length - 1; i >= 0 ; i-- ){
                emptyLine[i] = '*';
                System.out.println(emptyLine);
            }
        }
    }
}
