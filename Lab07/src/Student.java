public class Student {
    private String id, name;
    private double midScore, finalScore, quizScore, prjScore, collabScore;

    public  Student(){
        id = "";
        name = "";
        midScore = 0;
        finalScore = 0;
        quizScore = 0;
        prjScore = 0;
        collabScore = 0;
    }
    public void setStudent(String idS, String nameS, double midS,double finalS,double quizS, double prjS,double collabS){
        id = idS;
        name = nameS;
        midScore = midS;
        finalScore = finalS;
        quizScore = quizS;
        prjScore = prjS;
        collabScore = collabS;
    }
    public Student getStudent(){
        return null;
    }
    public double getTotalScore(){
        return this.midScore+this.finalScore+this.quizScore+this.prjScore+this.collabScore;
    }
    public String getId(){
        return  id;
    }
    public String getName(){
        return name;
    }

    public double getMidScore() {
        return midScore;
    }

    public double getCollabScore() {
        return collabScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public double getPrjScore() {
        return prjScore;
    }

    public double getQuizScore() {
        return quizScore;
    }
}
