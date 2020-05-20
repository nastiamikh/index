public class BmiService {
    public int calculate (int weight, int height0){
        int height = height0 * height0;
        int index = weight  * 100 / height;
        return index;
    }

}
