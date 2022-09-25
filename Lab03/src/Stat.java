public class Stat implements StatADT{
        private double[] number = new double[100];
        private int total =0;

        @Override
        public void setData(double input) {
            number[total] = input;
            total++;
        }

        @Override
        public void setTotal(int t) {
            total = t;
        }

        @Override
        public double getData(int element) {
            return number[element];
        }

        @Override
        public int getTotal() {
            return total;
        }

        @Override
        public double getMean() {
            double sum;
            sum = 0;
            for(int i =0; i<total;i++) {
                sum = sum+number[i];
            }
            return sum/(double) total;
        }

        @Override
        public double getSD() {
            double mean = getMean();
            double numerator = 0;
            double denominator = (total - 1);

            for(int i=0;i<total;i++){
                numerator = numerator+Math.pow((number[i]-mean),2);
            }
            return Math.sqrt(numerator/denominator);
        }

        @Override
        public double getMax() {
            double max=number[0];
            for(int i=1;i<total;i++){
                if(max<number[i]){
                    max=number[i];
                }
            }
            return max;
        }

        @Override
        public double getMin() {
            double min=number[0];
            for(int i=1;i<total;i++){
                if(min>number[i]){
                    min=number[i];
                }
            }
            return min;
        }
}
