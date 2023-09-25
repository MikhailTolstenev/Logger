import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int s : source)
            if (s > treshold) {
                result.add(s);
                logger.log("Элемент " + s + " проходит");

            } else {
                logger.log("Элемент " + s + " не проходит");
            }
        logger.log("Сортировку прошло  " + result.size() + " элементов из " + source.size());

        System.out.println(result);
        return result;
    }
}

