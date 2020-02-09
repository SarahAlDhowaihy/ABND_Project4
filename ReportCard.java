/**
 * Created by sarahaldowihy on 8/2/2017 AD.
 */

public class ReportCard {
    private String studentName ="";
    private double englishGrade , historyGrade, mathGrade , computerGrade , biologGrade;
    private static final int numberOfsubject =5 ;
    public ReportCard(){
        this.studentName="";
    }

    public ReportCard(String studentName) {
        this.studentName = studentName;
    }

    public ReportCard(String studentName, double englishGrade, double historyGrade, double mathGrade, double computerGrade, double biologGrade) {
        this.studentName = studentName;
        this.englishGrade = englishGrade;
        this.historyGrade = historyGrade;
        this.mathGrade = mathGrade;
        this.computerGrade = computerGrade;
        this.biologGrade = biologGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        if(englishGrade>=0)
        this.englishGrade = englishGrade;
        else
            this.englishGrade = 0;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        if(historyGrade>=0)
        this.historyGrade = historyGrade;
        else
            this.historyGrade=0;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        if (mathGrade>=0)
        this.mathGrade = mathGrade;
        else this.mathGrade =0;
    }

    public double getComputerGrade() {
        return computerGrade;
    }

    public void setComputerGrade(double computerGrade) {
        if(computerGrade>=0)
        this.computerGrade = computerGrade;
        else this.computerGrade=0;
    }

    public double getBiologGrade() {
        return biologGrade;
    }

    public void setBiologGrade(double biologGrade) {
        if (biologGrade>=0)
        this.biologGrade = biologGrade;
        else this.biologGrade =0;
    }

    public double getTotalGrade(double englishGrade, double historyGrade, double mathGrade, double computerGrade, double biologGrade) {
        /*
        the final grade is 500
        to make it out of 100
        division by number of subject
         */
        double total =0;
        total = englishGrade+historyGrade+mathGrade+computerGrade+biologGrade ;
        total = total/numberOfsubject;
        return  total;
    }

/*
Returns the string representation of the ReportCard
 */

    @Override
    public String toString(){
        return "Report Card for "+studentName
                +"\nEnglish: " + englishGrade + " out of 100"
                +"\nHistory: " + historyGrade + " out of 100"
                +"\nMath: "+ mathGrade + " out of 100"
                +"\nComputer: " + computerGrade + " out of 100"
                +"\nBiolog: " + biologGrade + " out of 100"
                +"\nthe Total: " + getTotalGrade(englishGrade,historyGrade,mathGrade,computerGrade,biologGrade) + " out of 100";
    }
}