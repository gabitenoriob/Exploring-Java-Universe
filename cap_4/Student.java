package cap_4;

public class Student {
    private String name;
    private Double average;

    //construtor
    public Student(String name, Double average){
        this.name = name;

        if(average <= 10.00 && average >= 0.00)
        {
            this.average = average;
        }

    }

    //setters e getters
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAverage(Double average)
    {
        if(average <= 10.00 && average >= 0.00)
        {
            this.average = average;
        }
    }
    public Double getAverage(){
        return average;
    }
    //retornar a letra da nota
    public String getLetterGrade()
    {
        String letterGrade = " ";
        if(average >= 9.0)
        {
            letterGrade = "A";
        }
        else if(average >= 8.0)
        {
            letterGrade = "B";
        }
        else if(average >= 7.0 )
        {
            letterGrade = "C";
        }
        else if(average >= 6.0)
        {
            letterGrade = "D";
        }
        else
        {
            letterGrade = "F";
        }
        return letterGrade;
    }


}
