package net.nurbek.HackerRank.Java.Advanced;

import java.io.IOException;

public class P09_CovariantReturnTypes
{
    public static void main(String[] args) throws IOException
    {
        String s = "WestBengal";
        Region region = null;

        switch (s)
        {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }

        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

class Flower
{
    public String whatsYourName()
    {
        return "flower";
    }
}

class Jasmine extends Flower
{
    @Override
    public String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower
{
    @Override
    public String whatsYourName()
    {
        return "Lily";
    }
}

class Region
{
    public Flower yourNationalFlower()
    {
        return new Flower();
    }
}

class WestBengal extends Region
{
    @Override
    public Flower yourNationalFlower()
    {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region
{
    @Override
    public Flower yourNationalFlower()
    {
        return new Lily();
    }
}

// SOLVED //

/*
https://www.hackerrank.com/challenges/java-covariance/problem
*/