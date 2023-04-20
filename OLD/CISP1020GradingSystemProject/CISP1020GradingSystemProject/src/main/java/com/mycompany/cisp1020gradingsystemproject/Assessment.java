package com.mycompany.cisp1020gradingsystemproject;

public class Assessment
{
    public double score;

    public Assessment(double score)
    {
        this.score = score;
    }

    public double getScore() 
    {
        return score;
    }

    public void setScore(double newScore)
    {
        score = newScore;
    }
}
