public class Time
{
    int hrs;
    int min;
    void input(int h, int m)
    {
        hrs=h;
        min=m;
    }
    void addTime(Time obj1, Time obj2)
    {
        int totalMins= obj1.hrs*60 + obj1.mins + obj2.hrs + ob