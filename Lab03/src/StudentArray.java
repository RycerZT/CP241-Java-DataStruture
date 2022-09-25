public class StudentArray implements StudentADT{
    Student[] allStudent;
    int totalStd;
    int current,size;
    Stat statADT;

    StudentArray(){
        allStudent = new Student[100];
        totalStd = 0;
        current = 0;
    }
    @Override
    public Student getCurrentStudent() {
        return allStudent[current++];
    }

    @Override
    public void setCurrentStudent(Student std) {
        allStudent[totalStd] = std;
        totalStd++;
        statADT = new Stat();
        for(int x=0; x<totalStd; x++){
            statADT.setData(allStudent[x].getTotalScore());
        }
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public double getMean() {
        return statADT.getMean();
    }

    @Override
    public double getSD() {
        return statADT.getSD();
    }

    @Override
    public double getMax() {
        return statADT.getMax();
    }

    @Override
    public double getMin() {
        return statADT.getMin();
    }

    @Override
    public double getTotal() {
        return 0;
    }
}
