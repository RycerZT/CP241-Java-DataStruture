public class Stat implements StatADT{
private double[] number = new double[100];
private int Total = 0;
    @Override
    public void setData(int element, double input) {
        number[element] = input;
    }

    @Override
    public void setTotal(int t) {
        Total = t;
    }

    @Override
    public double getData(int element) {
        return number[element];
    }

    @Override
    public int getTotal() {
        return Total;
    }

    @Override
    public double getMean() {
        double sum;
        sum = 0;
        for(int i = 0;i<Total;i++){
            sum = sum + number[i];
        }
        return sum/(double) Total;
    }

    @Override
    public double getSD() {
        double mean = getMean();
        double sq =0;
        double res = (Total -1);

        for (int i = 0; i < Total; i++) {
            sq = sq + Math.pow((number[i] - mean), 2);
        }
        return Math.sqrt(sq/res);
    }

    @Override
    public double getMax() {
        double max=number[0];
        for (int u = 0; u < Total; u++){
            if (max<number[u]){
                max=number[u];
            }
        }
        return max;
    }

    @Override
    public double getMin() {
        double min =number[0];
        for (int l=0; l< Total; l++){
            if (min>number[l]){
                min=number[l];
            }
        }
        return min;
    }
}
